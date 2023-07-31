package org.catmq.client.common;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * MessageEntry
 * 队列中每一个消息都是一个Entry，每种消息包括三种状态：publish / deliver / ack
 * 一旦Message被确认，则消息可以不在队列索引中存储
 */
@Getter
public class MessageEntry {
    /**
     * 扩展性
     */
    private Map<String, String> properties;
    /**
     * 消息体
     */
    private byte[] body;
    /**
     * 过期时间
     */
    private long expireTime;

    public MessageEntry() {
    }

    public MessageEntry(byte[] body, long expireTime) {
        this.properties = new HashMap<>();
        this.body = body;
        this.expireTime = expireTime;
    }

    public static MessageEntryBuilder builder() {
        return new MessageEntryBuilder();
    }

    public static class MessageEntryBuilder {

        private Map<String, String> properties;
        private byte[] body;

        private long expireTime;

        public MessageEntryBuilder() {
            this.properties = new HashMap<>();
        }

        public MessageEntryBuilder setProperties(String key, String value) {
            this.properties.put(key, value);
            return this;
        }

        public MessageEntryBuilder setBody(byte[] body) {
            this.body = body;
            return this;
        }

        public MessageEntryBuilder setExpireTime(long expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        public MessageEntry build() {
            MessageEntry messageEntry = new MessageEntry(body, expireTime);
            messageEntry.properties = this.properties;
            return messageEntry;
        }
    }


}
