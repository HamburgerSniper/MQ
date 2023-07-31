package org.catmq.util;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Enumeration;

/**
 * 配置文件工具类
 */
@Slf4j
public class ConfigUtil {

    /**
     * Runtime.getRuntime().availableProcessors() —— 返回可用处理器的Java虚拟机数量
     */
    public static final int PROCESSOR_NUMBER = Runtime.getRuntime().availableProcessors();
    /**
     * 操作系统名称
     */
    public static final String OS_NAME = System.getProperty("os.name");
    /**
     * 是否为 Linux平台
     */
    private static boolean isLinuxPlatform = false;
    /**
     * 是否为 windows平台
     */
    private static boolean isWindowsPlatform = false;
    /* 检查配置文件中是哪个平台的文件 */
    static {
        if (OS_NAME != null && OS_NAME.toLowerCase().contains("linux")) {
            isLinuxPlatform = true;
        }

        if (OS_NAME != null && OS_NAME.toLowerCase().contains("windows")) {
            isWindowsPlatform = true;
        }
    }

    public static boolean isWindowsPlatform() {
        return isWindowsPlatform;
    }

    public static boolean isLinuxPlatform() {
        return isLinuxPlatform;
    }

    /**
     * 获取本地ip地址
     *
     * @return
     */
    public static String getLocalAddress() {
        try {
            // Traversal Network interface to get the first non-loopback and non-private address
            Enumeration<NetworkInterface> enumeration = NetworkInterface.getNetworkInterfaces();
            ArrayList<String> ipv4Result = new ArrayList<String>();
            ArrayList<String> ipv6Result = new ArrayList<String>();
            while (enumeration.hasMoreElements()) {
                final NetworkInterface networkInterface = enumeration.nextElement();
                if (isBridge(networkInterface)) {
                    continue;
                }

                final Enumeration<InetAddress> en = networkInterface.getInetAddresses();
                while (en.hasMoreElements()) {
                    final InetAddress address = en.nextElement();
                    if (!address.isLoopbackAddress()) {
                        if (address instanceof Inet6Address) {
                            ipv6Result.add(normalizeHostAddress(address));
                        } else {
                            ipv4Result.add(normalizeHostAddress(address));
                        }
                    }
                }
            }

            // prefer ipv4
            if (!ipv4Result.isEmpty()) {
                for (String ip : ipv4Result) {
                    if (ip.startsWith("127.0") || ip.startsWith("192.168")) {
                        continue;
                    }

                    return ip;
                }

                return ipv4Result.get(ipv4Result.size() - 1);
            } else if (!ipv6Result.isEmpty()) {
                return ipv6Result.get(0);
            }
            //If failed to find,fall back to localhost
            final InetAddress localHost = InetAddress.getLocalHost();
            return normalizeHostAddress(localHost);
        } catch (Exception e) {
            log.error("Failed to obtain local address", e);
        }

        return null;
    }

    /**
     * ipv4地址 / ipv6地址 规范化
     *
     * @param localHost
     * @return
     */
    public static String normalizeHostAddress(final InetAddress localHost) {
        // ipv6地址
        if (localHost instanceof Inet6Address) {
            return "[" + localHost.getHostAddress() + "]";
        } else {
            // ipv4地址
            return localHost.getHostAddress();
        }
    }

    /**
     * ---
     * @param networkInterface
     * @return
     */
    private static boolean isBridge(NetworkInterface networkInterface) {
        try {
            if (isLinuxPlatform()) {
                String interfaceName = networkInterface.getName();
                File file = new File("/sys/class/net/" + interfaceName + "/bridge");
                return file.exists();
            }
        } catch (SecurityException e) {
            // Ignore
        }
        return false;
    }

}
