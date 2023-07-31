package org.catmq.entity;

import com.alibaba.fastjson2.JSON;
import lombok.Getter;
import lombok.NonNull;

/**
 * 在zk中注册的storer会被序列化为Json字符串，其实是在zk中所有注册信息均会被Json序列化
 * 通过Concat2String工具类进行处理
 */
@Getter
public class StorerInfo implements JsonSerializable {

    @NonNull
    private String storerId;
    private String storerName;
    @NonNull
    private String storerIp;
    private int storerPort;
    private String storerAddress;
    private String zkAddress;
    private int messageLogNum;


    public StorerInfo() {
        storerId = "1";
        storerIp = "127.0.0.1";
        storerName = "first";
        storerPort = 4321;
        zkAddress = "127.0.0.1:2181";
        messageLogNum = 0;
        storerAddress = storerIp + ":" + storerPort;
    }

    public byte[] toBytes() {
        return JSON.toJSONBytes(this);
    }

    public void addMessageLogNum() {
        messageLogNum++;
    }
}
