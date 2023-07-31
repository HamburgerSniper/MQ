package org.catmq.client.common;


import lombok.Data;
import org.catmq.util.ConfigUtil;

/**
 * client配置文件，有两个继承者：DefaultConsumer 和 DefaultProducer
 */
@Data
public class ClientConfig {
    /**
     * client的ip地址 -- 本地ip地址
     */
    public String clientIP = ConfigUtil.getLocalAddress();

}
