package org.catmq.entity;

import com.alibaba.fastjson2.JSON;

/**
 * Json序列化接口
 */
public interface JsonSerializable {

    /**
     * Serialize object to byte array
     * 将对象序列化为字节数组
     *
     * @return byte array from object
     */
    byte[] toBytes();

    /**
     * Deserialize byte array to object
     * 将字节数组反序列化为对象，接口中的static方法，在实现类中不需要重写即可直接使用
     *
     * @param bytes byte array
     * @param clazz class type
     * @return object
     */
    static <T> T fromBytes(byte[] bytes, Class<T> clazz) {
        return JSON.parseObject(bytes, clazz);
    }
}
