package org.catmq.entity;

import lombok.Getter;

/**
 * TopicType：表示消息Message所对应的Topic的类型
 * NON_PERSISTENT：非持久性topic
 * PERSISTENT：持久性消息
 */
public enum TopicType {
    /**
     * Non-persistent topic type 非持久性topic
     */
    NON_PERSISTENT("non-persistent"),
    /**
     * Persistent topic type 持久性topic
     */
    PERSISTENT("persistent");
    /**
     * name：TopicName 该Topic的名称
     */
    @Getter
    private final String name;

    public static TopicType fromString(String name) {
        // 枚举类的values()方法：以数组形式返回枚举类型的所有成员
        for (TopicType type : TopicType.values()) {
            if (type.getName().equals(name)) {
                return type;
            }
        }
        // 未知topic类型，抛出异常
        throw new IllegalArgumentException("Unknown topic type: " + name);
    }

    TopicType(String name) {
        this.name = name;
    }
}
