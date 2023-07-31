package org.catmq.broker.topic;

import org.catmq.broker.common.Consumer;
import org.catmq.broker.common.NumberedMessageBatch;

import java.util.List;

/**
 * Dispatcher接口：调度器，用来调度Consumer
 */
public interface Dispatcher {
    /**
     * 在调度器Dispatcher中新增Consumer
     * Add a consumer to the dispatcher.
     * <strong>String is temporary</strong>
     *
     * @param consumer consumer
     */
    void addConsumer(Consumer consumer);

    /**
     * 从调度器Dispatcher中移除Consumer
     * Remove a consumer from the dispatcher.
     *
     * @param consumer consumer
     */
    void removeConsumer(Consumer consumer);

    /**
     * 获取当前调度器Dispatcher所负责调度的所有Consumer
     * Get all consumers from the dispatcher.
     *
     * @return consumers
     */
    List<Consumer> getConsumers();

    /**
     * 判断Consumer是否为活跃的(起作用的)消费者
     *
     * @param consumer
     * @return
     */
    boolean isActiveConsumer(Consumer consumer);

    /**
     * 向消费队列consumerQueue发送消费消息consumeMessage
     * Send consume message to consumer queue.
     *
     * @param entryBatch
     */
    void sendMessage4Consuming(NumberedMessageBatch entryBatch);

}
