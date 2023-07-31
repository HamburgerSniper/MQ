package org.catmq.client.consumer;

import org.catmq.client.common.ClientProxy;

/**
 * ConsumerProxy：Consumer代理类，用于和Broker之间进行通信
 */
public class ConsumerProxy implements ClientProxy {
    @Override
    public void increaseRequestedCount(String brokerAddress) {
        
    }

    @Override
    public void decreaseRequestedCount(String brokerAddress) {

    }
}
