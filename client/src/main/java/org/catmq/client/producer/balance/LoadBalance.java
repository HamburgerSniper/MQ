package org.catmq.client.producer.balance;

import org.apache.curator.framework.CuratorFramework;

import java.util.Optional;

/**
 * 负载均衡接口 ： 实现类均为负载均衡算法
 */
@FunctionalInterface
public interface LoadBalance {
    /**
     * This method is used to select a broker address from the broker list.
     * 此方法用于从代理列表中选择一个代理对象
     *
     * @param client zookeeper client
     * @param num    the number of brokers to select
     * @return broker address path like /address/broker/127.0.0.1:5432
     */
    Optional<String[]> selectBroker(CuratorFramework client, int num);
}
