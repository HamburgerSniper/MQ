package org.catmq.client.consumer;

import org.catmq.zk.BaseZookeeper;

/**
 * Consumer与ZooKeeper相关的操作，实现BaseZookeeper抽象类
 */
public class ConsumerZooKeeper extends BaseZookeeper {

    private final ConsumerConfig config;

    @Override
    protected void register2Zk() {
        // TODO
    }

    @Override
    protected void close() {
        // TODO

        super.client.close();
    }

    protected ConsumerZooKeeper(ConsumerConfig config) {
        super(null);
        this.config = config;
    }
}
