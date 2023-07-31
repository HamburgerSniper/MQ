package org.catmq.client.producer;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.apache.curator.framework.CuratorFramework;
import org.catmq.client.producer.balance.LeastUsedStrategy;
import org.catmq.client.producer.balance.LoadBalance;
import org.catmq.client.producer.balance.RoundRobinStrategy;

import java.util.Optional;

/**
 * 代理类：创造Producer代理对象
 */
@Slf4j
public class ProducerProxy {
    /**
     * loadBalance：表示这个Producer使用的是哪种负载均衡算法
     */
    @Getter
    private final LoadBalance loadBalance;

    /**
     * Get optimal broker address from zookeeper using the specified algorithm
     * 使用指定的算法从zookeeper获取最优代理地址
     *
     * @param client zookeeper client
     * @param num    the number of brokers to select
     * @return broker address path like /address/broker/127.0.0.1:5432 返回的是选择后最合适的broker的地址
     */
    public Optional<String[]> selectBrokers(CuratorFramework client, int num) {
        return loadBalance.selectBroker(client, num);
    }

    /**
     * 获取Producer代理类对象，该代理类默认采用LRU算法获取所选择的Broker对象
     *
     * @param loadBalanceEnum 单例LoadBalance对象
     */
    public ProducerProxy(LoadBalanceEnum loadBalanceEnum) {
        switch (loadBalanceEnum) {
            case LEAST_USED -> this.loadBalance = LeastUsedStrategy.LeastUsedStrategyEnum.INSTANCE.getStrategy();
            case ROUND_ROBIN -> this.loadBalance = RoundRobinStrategy.RoundRobinStrategyEnum.INSTANCE.getStrategy();
            default -> {
                log.warn("Load balance strategy not found, use default strategy: Least Used Strategy");
                this.loadBalance = LeastUsedStrategy.LeastUsedStrategyEnum.INSTANCE.getStrategy();
            }
        }
    }

    /**
     * 枚举负载均衡实现方法：LRU/轮询
     */
    public enum LoadBalanceEnum {
        /**
         * least used
         * LRU最近最少使用算法
         */
        LEAST_USED,
        /**
         * round robin
         * 负载均衡算法——轮询法
         */
        ROUND_ROBIN;
    }
}
