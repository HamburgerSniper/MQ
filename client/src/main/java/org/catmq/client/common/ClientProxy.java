package org.catmq.client.common;

import org.catmq.entity.BrokerInfo;

public interface ClientProxy {
    /**
     * Increase the number of requests sent to the specified broker
     * 增加发送到指定代理的请求数
     *
     * @param brokerAddress the path target like /address/broker/ip:port.
     */
    void increaseRequestedCount(String brokerAddress);

    /**
     * Decrease the number of requests sent to the specified broker
     * 减少发送到指定代理的请求数
     *
     * @param brokerAddress the path target like /address/broker/ip:port.
     */
    void decreaseRequestedCount(String brokerAddress);

    /**
     * Get broker information where this producer connected from zk.
     * 获取此 producer 从 zk 连接的代 broker 信息
     * <strong>One producer connects with many brokers which has not been considered yet</strong>
     * 一个 producer 连接很多broker的情况暂未考虑
     *
     * @param brokerAddress the path target like /address/broker/ip:port.
     * @return broker information
     */
    default BrokerInfo getBrokerInfo(String brokerAddress) {
        // TODO:One producer connects with many brokers which has not been considered yet
        throw new UnsupportedOperationException();
    }
}
