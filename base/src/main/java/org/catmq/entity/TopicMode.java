package org.catmq.entity;

import lombok.Getter;

/**
 * TopicMode：消息类型
 * NORMAL:  普通消息
 * ORDERED: 有序消息
 */
public enum TopicMode {
    /**
     * normal topic mode
     */
    NORMAL("normal"),
    /**
     * ordered topic mode
     */
    ORDERED("ordered");

    @Getter
    private final String name;

    public static TopicMode fromString(String name) {
        for (TopicMode mode : TopicMode.values()) {
            if (mode.getName().equals(name)) {
                return mode;
            }
        }
        throw new IllegalArgumentException("Unknown topic mode: " + name);
    }

    TopicMode(String name) {
        this.name = name;
    }
}
