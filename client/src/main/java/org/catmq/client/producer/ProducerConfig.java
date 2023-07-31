package org.catmq.client.producer;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.catmq.constant.ConfigConstant;
import org.catmq.constant.ZkConstant;

import java.io.FileInputStream;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.nio.file.Path;
import java.util.Properties;

/**
 * Producer的配置信息
 */
@Setter
@Getter
@Slf4j
public class ProducerConfig {
    /**
     * zkAddress：Producer在zookeeper(NameServer)上的注册地址
     */
    private String zkAddress;
    /**
     * broker ip and port without clusters which <strong>should be specified manually</strong>
     * 没有集群的代理IP和端口，应该<strong>手动指定</strong>
     */
    private InetSocketAddress brokerAddress;

    private ProducerConfig() {
        // 读取系统中的Producer配置文件
        String filePath = Path.of(ConfigConstant.PRODUCER_CONFIG_PATH).toAbsolutePath().normalize().toString();
        Properties properties = new Properties();
        try (InputStream inputStream = new FileInputStream(filePath)) {
            // 配置文件加载
            properties.load(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
            // 读取失败
            log.warn("read config failed, use default config");
        }
        // Producer默认地址端口号为127.0.0.1:2181
        zkAddress = properties.getProperty(ConfigConstant.ZK_ADDRESS, ZkConstant.ZK_DEFAULT_ADDRESS);
    }

    public enum ProducerConfigEnum {
        /**
         * Singleton 定义一个单例对象
         */
        INSTANCE;
        private final ProducerConfig producerConfig;

        ProducerConfigEnum() {
            producerConfig = new ProducerConfig();
        }

        /**
         * 获取单例对象的方法
         */
        public ProducerConfig getInstance() {
            return producerConfig;
        }
    }
}
