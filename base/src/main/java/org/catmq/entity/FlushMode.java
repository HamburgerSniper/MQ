package org.catmq.entity;

import lombok.Getter;

/**
 * FlushMode
 * 对于普通消息，采取同步传输
 * 对于异步消息，采取异步传输
 */
public enum FlushMode {
    /**
     * normal topic mode
     */
    SYNC("sync"),
    /**
     * ordered topic mode
     */
    ASYNC("async");

    @Getter
    private final String name;

    public static FlushMode fromString(String name) {
        for (FlushMode mode : FlushMode.values()) {
            if (mode.getName().equals(name)) {
                return mode;
            }
        }
        throw new IllegalArgumentException("Unknown flush mode: " + name);
    }

    FlushMode(String name) {
        this.name = name;
    }
}
