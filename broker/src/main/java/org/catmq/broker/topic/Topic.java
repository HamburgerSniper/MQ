package org.catmq.broker.topic;

import org.catmq.protocol.definition.OriginMessage;
import org.catmq.protocol.service.SendMessage2BrokerResponse;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * Topic接口：表示Broker中的Topic
 */
public interface Topic {

    /**
     * 将Message发送给订阅了这个Topic的Consumer
     * put message to the consumers who have this topic
     */
    CompletableFuture<SendMessage2BrokerResponse> putMessage(List<OriginMessage> messages);

    /**
     * Consumer订阅该Topic
     *
     * @param subscriptionName Consumer发给Broker请求订阅某topic
     *                         的SubscribeRequest中的subscriptionName
     * @param consumerId       consumerId
     */
    void subscribe(String subscriptionName, long consumerId);

    Subscription getOrCreateSubscription(String subscriptionName);

    /**
     * @return 该Topic主题的名字
     */
    String getTopicName();

    /**
     * Topic是否被订阅
     *
     * @param subscriptionName Consumer发给Broker请求订阅某topic
     *                         的SubscribeRequest中的subscriptionName
     * @param consumerId       consumerId
     * @return Boolean类型变量，true表示已订阅，false表示未订阅
     */
    boolean isSubscribe(String subscriptionName, long consumerId);
}
