package org.catmq.zk;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.RetryOneTime;
import org.catmq.constant.FileConstant;
import org.catmq.constant.ZkConstant;
import org.catmq.util.Concat2String;

import java.net.InetSocketAddress;
import java.util.concurrent.TimeUnit;

/**
 * Zookeeper工具类
 */
public class ZkUtil {
    /**
     * 根据zkAddress创建zookeeper用户
     *
     * @param zkAddress zookeeper的ip地址
     * @return
     */
    public static CuratorFramework createClient(String zkAddress) {
        // 仅重试一次的重试策略：两次重试之间休息1000ms
        RetryPolicy policy = new RetryOneTime(1000);
        // 工厂模式创建对象
        CuratorFramework cf = CuratorFrameworkFactory.newClient(zkAddress, policy);
        cf.start();
        return cf;
    }

    /**
     * 根据zkAddress创建zookeeper用户，有条件限制
     *
     * @param zkAddress zookeeper的ip地址
     * @param timeout   最长等待时间
     * @param unit      等待时间的时间单位
     * @return
     * @throws InterruptedException
     */
    public static CuratorFramework createClient(String zkAddress, int timeout, TimeUnit unit) throws InterruptedException {
        RetryPolicy policy = new RetryOneTime(1000);
        CuratorFramework cf = CuratorFrameworkFactory.newClient(zkAddress, policy);
        cf.start();
        if (cf.blockUntilConnected(timeout, unit)) {
            return cf;
        }
        // 重试失败，则抛出异常
        throw new RuntimeException("Can not connect to zk server.");
    }

    /**
     * Get the full path of broker address on zk.
     * 获取zk中broker注册地址的全路径
     *
     * @param address the address of broker containing IP and Port.
     * @return /address/broker/ip:port
     */
    public static String getFullBrokerAddressPath(InetSocketAddress address) {
        return Concat2String.builder()
                .concat(ZkConstant.BROKER_ADDRESS_PATH)
                .concat(FileConstant.LEFT_SLASH)
                .concat(address.getHostName())
                .concat(FileConstant.COLON)
                .concat(address.getPort())
                .build();
    }

}
