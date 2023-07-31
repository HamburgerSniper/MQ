package org.catmq.client;

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ByteString;
import io.grpc.Channel;
import io.grpc.ClientInterceptors;
import io.grpc.ManagedChannel;
import io.grpc.Metadata;
import io.grpc.stub.MetadataUtils;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.apache.curator.framework.CuratorFramework;
import org.catmq.client.common.*;
import org.catmq.entity.GrpcConnectManager;
import org.catmq.entity.TopicDetail;
import org.catmq.protocol.definition.Code;
import org.catmq.protocol.definition.OriginMessage;
import org.catmq.protocol.definition.ProcessMode;
import org.catmq.protocol.service.BrokerServiceGrpc;
import org.catmq.protocol.service.SendMessage2BrokerRequest;
import org.catmq.protocol.service.SendMessage2BrokerResponse;
import org.catmq.zk.TopicZkInfo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * DefaultProducer：
 * 默认生产者，继承ClientConfig类，构造器模式实现
 */
@Slf4j
public class DefaultCatProducer extends ClientConfig {
    @Getter
    private String tenantId;
    @Getter
    private final TopicDetail topicDetail;
    @Getter
    private long producerId;
    @Getter
    private final CuratorFramework client;
    // TODO 选择broker策略
    private PartitionSelector partitionSelector;

    private final ThreadPoolExecutor handleResponseExecutor;

    private final ThreadPoolExecutor handleRequestExecutor;

    private final GrpcConnectManager grpcConnectManager;

    private final TopicZkInfo topicZkInfo;


    private DefaultCatProducer(String tenantId, String topic, CuratorFramework client,
                               PartitionSelector partitionSelector, ThreadPoolExecutor handleResponseExecutor,
                               ThreadPoolExecutor handleRequestExecutor, GrpcConnectManager grpcConnectManager,
                               TopicZkInfo topicZkInfo) {
        this.tenantId = tenantId;
        this.topicDetail = TopicDetail.get(topic);
        this.client = client;
        this.partitionSelector = partitionSelector;
        this.producerId = 1111L;
        this.handleRequestExecutor = handleRequestExecutor;
        this.handleResponseExecutor = handleResponseExecutor;
        this.grpcConnectManager = grpcConnectManager;
        this.topicZkInfo = topicZkInfo;
    }


    public void sendMessage(MessageEntry messageEntry, long timeout) {
        doSend(messageEntry, ProcessMode.SYNC, null, timeout);
    }


    public void sendMessage(Collection<? extends MessageEntry> messages, long timeout) {
        BatchMessageEntry batchMessageEntry = BatchMessageEntry.generateFromList(messages);
        sendMessage(batchMessageEntry, timeout);
    }

    public void asyncSendMessage(final MessageEntry messageEntry, final SendCallback sendCallback, final long timeout) {
        final long beginStartTime = System.currentTimeMillis();
        Runnable runnable = () -> {
            long costTime = System.currentTimeMillis() - beginStartTime;
            if (timeout > costTime) {
                doSend(messageEntry, ProcessMode.ASYNC, sendCallback, timeout - costTime);
            } else {
                sendCallback.onException(
                        new Exception("time out!"));
            }
        };
        asyncExecuteMessageSend(runnable);
    }

    private void asyncExecuteMessageSend(Runnable runnable) {
        try {
            handleRequestExecutor.submit(runnable);
        } catch (RejectedExecutionException e) {
            runnable.run();
        }
    }

    /**
     * 发送批量消息
     *
     * @param messages     将MessageEntry的子类打包集合(批量消息)
     * @param sendCallback broker对producer的回复，onSuccess or onException
     * @param timeout      过期时间
     */
    public void sendMessage(Collection<? extends MessageEntry> messages, final SendCallback sendCallback, final long timeout) {
        BatchMessageEntry batchMessageEntry = BatchMessageEntry.generateFromList(messages);
        asyncSendMessage(batchMessageEntry, sendCallback, timeout);
    }

    /**
     * 支持 同步/异步 发送 普通/有序/批量/延迟消息
     * @param messageEntry message
     * @param processMode SYNC or ASYNC
     * @param sendCallback success or exception
     * @param timeout 超时时间
     */
    private void doSend(MessageEntry messageEntry, ProcessMode processMode, SendCallback sendCallback, long timeout) {
        // TODO 使用选择broker策略
        // 构建要发送的message
        ManagedChannel channel = grpcConnectManager.get(topicZkInfo.getBrokerZkPaths().get(0));
        Metadata metadata = new Metadata();
        metadata.put(Metadata.Key.of("action", Metadata.ASCII_STRING_MARSHALLER), "sendMessage");
        metadata.put(Metadata.Key.of("tenant-id", Metadata.ASCII_STRING_MARSHALLER), tenantId);
        Channel headChannel = ClientInterceptors.intercept(channel, MetadataUtils.newAttachHeadersInterceptor(metadata));
        BrokerServiceGrpc.BrokerServiceFutureStub futureStub = BrokerServiceGrpc.newFutureStub(headChannel);
        List<OriginMessage> messages = new ArrayList<>();
        if (messageEntry instanceof BatchMessageEntry batchMessageEntry) {
            // 批量消息(一堆message为一个entry的消息)，遍历后添加
            for (MessageEntry me : batchMessageEntry) {
                OriginMessage message = OriginMessage.newBuilder()
                        .setBody(ByteString.copyFrom(me.getBody()))
                        .setExpireTime(me.getExpireTime())
                        .build();
                messages.add(message);
            }
        } else {
            // 其他消息(普通消息、有序消息等一条message为一个entry的消息)，直接添加
            OriginMessage message = OriginMessage.newBuilder()
                    .setBody(ByteString.copyFrom(messageEntry.getBody()))
                    .setExpireTime(messageEntry.getExpireTime())
                    .build();
            messages.add(message);
        }

        // message构建完成后，设置将message发给broker的请求request的参数
        SendMessage2BrokerRequest request = SendMessage2BrokerRequest.newBuilder()
                .addAllMessage(messages)
                .setTopic(topicDetail.getCompleteTopicName() + "#0")
                .setProducerId(this.producerId)
                .build();
        log.warn("send message: {}", request.getMessage(0).getExpireTime());
        // 在message发送给broker后，监听信道内broker对producer发送的message请求的request的response
        ListenableFuture<SendMessage2BrokerResponse> responseFuture = futureStub.sendMessage2Broker(request);


        // processMode：发送方式 同步or异步
        switch (processMode) {
            // 同步发送
            case SYNC -> {
                try {
                    // 收到broker的确认再发送下一个
                    SendMessage2BrokerResponse response = responseFuture.get();
                    if (response.getStatus().getCode() != Code.OK) {
                        log.error("fail to send a message, message: {}", response.getStatus().getMessage());
                    }

                } catch (ExecutionException | InterruptedException e) {
                    log.error("Fail to get response.", e);
                }
            }
            // 异步发送
            case ASYNC -> Futures.addCallback(responseFuture, new FutureCallback<>() {
                @Override
                public void onSuccess(SendMessage2BrokerResponse result) {
                    sendCallback.onSuccess(new SendResult());
                }

                @Override
                public void onFailure(Throwable t) {
                    sendCallback.onException(t);
                }
            }, MoreExecutors.directExecutor()/* 调用线程 */);
            // 异常处理，既不是SYNC也不是ASYNC则记录异常
            // TODO：异常处理
            default -> log.error("Unknown process mode: {}", processMode);
        }
    }


    protected static DefaultCatProducerBuilder builder(String tenantId, CuratorFramework client,
                                                       ThreadPoolExecutor handleRequestExecutor,
                                                       ThreadPoolExecutor handleResponseExecutor,
                                                       GrpcConnectManager grpcConnectManager, String topic,
                                                       TopicZkInfo topicZkInfo) {
        return new DefaultCatProducerBuilder(tenantId, client, handleRequestExecutor, handleResponseExecutor,
                grpcConnectManager, topic, topicZkInfo);
    }

    public static class DefaultCatProducerBuilder {
        private final String tenantId;

        private final String topic;

        private final CuratorFramework client;

        private PartitionSelector partitionSelector;

        private final ThreadPoolExecutor handleResponseExecutor;

        private final ThreadPoolExecutor handleRequestExecutor;

        private final GrpcConnectManager grpcConnectManager;

        private final TopicZkInfo topicZkInfo;


        protected DefaultCatProducerBuilder(String tenantId, CuratorFramework client, ThreadPoolExecutor handleRequestExecutor,
                                            ThreadPoolExecutor handleResponseExecutor, GrpcConnectManager grpcConnectManager,
                                            String topic, TopicZkInfo topicZkInfo) {
            this.tenantId = tenantId;
            this.client = client;
            this.handleRequestExecutor = handleRequestExecutor;
            this.handleResponseExecutor = handleResponseExecutor;
            this.grpcConnectManager = grpcConnectManager;
            this.topic = topic;
            this.topicZkInfo = topicZkInfo;
        }

        public DefaultCatProducerBuilder setPartitionSelector(PartitionSelector partitionSelector) {
            this.partitionSelector = partitionSelector;
            return this;
        }

        public DefaultCatProducer build() {
            return new DefaultCatProducer(tenantId, topic, client, partitionSelector, handleRequestExecutor,
                    handleResponseExecutor, grpcConnectManager, topicZkInfo);
        }
    }


}
