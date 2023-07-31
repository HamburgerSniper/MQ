package org.catmq.entity;

import com.alibaba.fastjson2.JSON;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * Broker的详细信息，Broker在zookeeper中的注册信息会被序列化成Json字符串
 */
@Data
@NoArgsConstructor
public class BrokerInfo implements JsonSerializable {
    /**
     * id标识
     */
    private long brokerId;
    /**
     * 名称
     */
    private String brokerName;
    /**
     * ip地址，要求非空
     */
    @NonNull
    private String brokerIp;
    /**
     * 端口号
     */
    private int brokerPort;
    /**
     * 对应的NameServer(zookeeper)的地址，要求非空
     */
    @NonNull
    private String zkAddress;
    /**
     * broker本身的地址
     */
    private String brokerAddress;


    /**
     * The number of connections on this broker.
     * 连接数
     */
    private int load;

    /**
     * 序列化成json字符串
     * @return
     */
    @Override
    public byte[] toBytes() {
        return JSON.toJSONBytes(this);
    }

    public BrokerInfo(BrokerConfig config) {
        this.brokerName = config.getBrokerName();
        this.brokerIp = config.getBrokerIp();
        this.brokerPort = config.getBrokerPort();
        this.zkAddress = config.getZkAddress();
        this.load = 0;
        // TODO concat
        this.brokerAddress = brokerIp + ":" + brokerPort;
    }
}
