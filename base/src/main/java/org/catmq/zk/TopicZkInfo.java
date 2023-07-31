package org.catmq.zk;

import com.alibaba.fastjson2.JSON;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.catmq.entity.JsonSerializable;

import java.util.HashMap;

/**
 * TopicZkInfo：zookeeper中保存的topic信息
 * 在zk中注册的topic信息会序列化为Json字符串
 */
@Data
@NoArgsConstructor
public class TopicZkInfo implements JsonSerializable {
    private String simpleName;
    private String type;
    private String mode;
    private int partitionNum;
    /**
     * topic对应的broker在zookeeper中对应的路径
     * 一个topic可能对应多个broker，因此采用HashMap存储
     */
    private HashMap<Integer, String> brokerZkPaths;

    public TopicZkInfo(String simpleName, String type, String mode, int partitionNum, HashMap<Integer, String> brokerZkPaths) {
        this.simpleName = simpleName;
        this.type = type;
        this.mode = mode;
        this.partitionNum = partitionNum;
        this.brokerZkPaths = brokerZkPaths;
    }

    @Override
    public byte[] toBytes() {
        return JSON.toJSONBytes(this);
    }

}
