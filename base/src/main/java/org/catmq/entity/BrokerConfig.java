package org.catmq.entity;

import lombok.Getter;
import lombok.Setter;
import org.catmq.constant.ConfigConstant;
import org.catmq.constant.ZkConstant;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static org.catmq.util.ConfigUtil.PROCESSOR_NUMBER;

/**
 * Broker配置文件，所有有关于Broker的配置都需要从这里读取
 */
@Setter
@Getter
public class BrokerConfig {

    public static final BrokerConfig BROKER_CONFIG;
    // 使用代码块，在类加载的时候就创建BrokerConfig()
    // 而不是使用
    // public static final BrokerConfig BROKER_CONFIG = new BrokerConfig();
    static {
        BROKER_CONFIG = new BrokerConfig();
    }

    /**
     * id标识
     */
    private long brokerId;
    /**
     * 名称
     */
    private String brokerName;
    /**
     * ip地址，在BrokerInfo读取BrokerConfig时，BrokerInfo的brokerIp字段要求非空
     */
    private String brokerIp;
    /**
     * NameServer——zk注册地址
     */
    private String zkAddress;
    /**
     * broker的端口号
     */
    private int brokerPort = 5432;
    /**
     * Producer线程队列容量
     */
    private int grpcProducerThreadQueueCapacity = 10000;
    /**
     * Producer线程池的数量 = 可用的Java虚拟机数量
     */
    private int grpcProducerThreadPoolNums = PROCESSOR_NUMBER;
    /**
     *  ---
     */
    private int grpcAdminThreadPoolNums = 1;
    /**
     * Consumer线程队列容量
     */
    private int grpcConsumerThreadQueueCapacity = 10000;
    /**
     * Consumer线程池大小 --- ？
     */
    private int grpcConsumerThreadPoolNums = PROCESSOR_NUMBER;
    /**
     * 消息分段后的最大段编号
     */
    private int maxSegmentMessageNum;
    /**
     * 最大读取BatchSize
     */
    private int maxReadBatchSize = 100;
    /**
     * 最大读缓存池容量
     */
    private int maxReadCacheSize = 10 * 1024 * 1024;


    private BrokerConfig() {
        // 从对应路径BROKER_CONFIG_PATH读取BrokerConfig配置文件
        InputStream stream = this.getClass().getResourceAsStream(ConfigConstant.BROKER_CONFIG_PATH);
        if (stream == null) {
            throw new RuntimeException("broker.properties not found");
        }
        Properties properties = new Properties();
        try {
            properties.load(stream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // 从Properties中获取，获取不到则设置为默认值
        brokerName = properties.getProperty(ConfigConstant.BROKER_NAME, "default");
        brokerIp = properties.getProperty(ConfigConstant.BROKER_IP, "127.0.0.1");
        brokerPort = Integer.parseInt(properties.getProperty(ConfigConstant.BROKER_PORT, String.valueOf(brokerPort)));
        grpcProducerThreadQueueCapacity = Integer.parseInt(properties.getProperty(ConfigConstant.GRPC_PRODUCER_THREAD_QUEUE_CAPACITY, String.valueOf(grpcProducerThreadQueueCapacity)));
        grpcProducerThreadPoolNums = Integer.parseInt(properties.getProperty(ConfigConstant.GRPC_PRODUCER_THREAD_POOL_NUMS, String.valueOf(grpcProducerThreadPoolNums)));
        grpcAdminThreadPoolNums = Integer.parseInt(properties.getProperty(ConfigConstant.GRPC_ADMIN_THREAD_POOL_NUMS, String.valueOf(grpcAdminThreadPoolNums)));
        grpcConsumerThreadQueueCapacity = Integer.parseInt(properties.getProperty(ConfigConstant.GRPC_CONSUMER_THREAD_QUEUE_CAPACITY, String.valueOf(grpcConsumerThreadQueueCapacity)));
        grpcConsumerThreadPoolNums = Integer.parseInt(properties.getProperty(ConfigConstant.GRPC_CONSUMER_THREAD_POOL_NUMS, String.valueOf(grpcConsumerThreadPoolNums)));
        zkAddress = properties.getProperty(ConfigConstant.ZK_ADDRESS, ZkConstant.ZK_DEFAULT_ADDRESS);
        maxSegmentMessageNum = Integer.parseInt(properties.getProperty(ConfigConstant.TOPIC_MAX_SEGMENT_MESSAGE_NUM, String.valueOf(10000)));
        maxReadBatchSize = Integer.parseInt(properties.getProperty(ConfigConstant.TOPIC_MAX_READ_BATCH_SIZE, String.valueOf(maxReadBatchSize)));
        maxReadCacheSize = Integer.parseInt(properties.getProperty(ConfigConstant.TOPIC_MAX_READ_CACHE_SIZE, String.valueOf(maxReadCacheSize)));
    }
}
