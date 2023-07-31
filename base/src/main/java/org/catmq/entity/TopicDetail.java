package org.catmq.entity;

import com.google.common.base.Splitter;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.catmq.util.Concat2String;
import org.catmq.util.StringUtil;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

@Getter
@Slf4j
public class TopicDetail {
    public static final String PUBLIC_TENANT = "public";

    /**
     * "#" : 分区索引分隔符
     */
    public static final String PARTITIONED_INDEX_SEPARATOR = "#";
    /**
     * ":$" : topic域分隔符
     */
    private static final String TOPIC_DOMAIN_SEPARATOR = ":$";
    /**
     * ":" : topic内部分隔符
     */
    private static final String TOPIC_INNER_SEPARATOR = ":";


    // full name of topic , 表示topic的全名
    // <topicType>:<topicMode>:$<tenant>:<topic>#<partitionIndex>
    private final String completeTopicName;
    /**
     * 持久消息 or 非持久消息
     */
    private final TopicType type;
    /**
     * 普通消息 or 有序消息
     */
    private final TopicMode mode;
    /**
     * tenant：规则
     */
    private final String tenant;
    private final String simpleName;
    /**
     * 分区索引
     */
    private final int partitionIndex;

    /**
     * Broker在Zookeeper(NameServer)中路径
     */
    @Setter
    private String brokerZkPath;
    /**
     * 最多读100条，超时时间30分钟
     */
    private static final LoadingCache<String, TopicDetail> CACHE = CacheBuilder
            .newBuilder()
            .maximumSize(100)
            .expireAfterAccess(30, TimeUnit.MINUTES)
            .build(new CacheLoader<>() {
                @Override
                public @NonNull TopicDetail load(@NonNull String name) {
                    return new TopicDetail(name);
                }
            });

    public static TopicDetail get(String topic) {
        try {
            return CACHE.get(topic);
        } catch (ExecutionException e) {
            log.warn("exception");
            throw new RuntimeException(e);
        }
    }

    /**
     * 以下三个构造器重载，本质上是拼接更完整的topic信息
     *
     * @param domain
     * @param topic
     * @return
     */
    public static TopicDetail get(String domain, String topic) {
        String name = StringUtil.concatString(domain, TOPIC_DOMAIN_SEPARATOR, PUBLIC_TENANT,
                TOPIC_INNER_SEPARATOR, topic);
        return TopicDetail.get(name);
    }

    public static TopicDetail get(String domain, String tenant, String topic) {
        String name = StringUtil.concatString(domain, TOPIC_DOMAIN_SEPARATOR, tenant,
                TOPIC_INNER_SEPARATOR, topic);
        return TopicDetail.get(name);
    }

    public static TopicDetail get(String type, String mode, String tenant, String topic) {
        String name = StringUtil.concatString(type, TOPIC_INNER_SEPARATOR, mode, TOPIC_DOMAIN_SEPARATOR, tenant,
                TOPIC_INNER_SEPARATOR, topic);
        return TopicDetail.get(name);
    }


    /**
     * Whether the basic topic name is valid.
     * Should be updated to delete outdated keys.
     * <p>
     * 查看topic是否有效，如果过期则进行删除
     *
     * @param topic basic topic name
     * @return true if valid
     */
    public static boolean containsKey(String topic) {
        return Optional.of(topic).map(CACHE::getIfPresent).isPresent();
    }

    /**
     * 返回topic的分区索引
     *
     * @return partition index of the completeTopicName.
     * It returns -1 if the completeTopicName (topic) is not partitioned.
     */
    public static int getPartitionIndex(String topic) {
        int partitionIndex = -1;
        if (topic.contains(PARTITIONED_INDEX_SEPARATOR)) {
            try {
                String idx = StringUtil.substringAfterLast(topic, PARTITIONED_INDEX_SEPARATOR);
                partitionIndex = Integer.parseInt(idx);
                if (partitionIndex < 0) {
                    // for the "topic-partition--1"
                    partitionIndex = -1;
                } else if (idx.length() != String.valueOf(partitionIndex).length()) {
                    // for the "topic-partition-01"
                    partitionIndex = -1;
                }
            } catch (NumberFormatException e) {
                // ignore exception
                log.debug("ignored exception");
            }
        }
        return partitionIndex;
    }

    /**
     * @return partition index of the completeTopicName.
     * It returns -1 if the completeTopicName (topic) is not partitioned.
     */
    public int getPartitionIndex() {
        return partitionIndex;
    }

    /**
     * topic是否进行了分区
     *
     * @return
     */
    public boolean isPartitioned() {
        return partitionIndex != -1;
    }

    /**
     * @return the topic name without partition index.
     */
    public String getTopicNameWithoutIndex() {
        if (isPartitioned()) {
            return completeTopicName.substring(0, completeTopicName.lastIndexOf("#"));
        } else {
            return completeTopicName;
        }

    }

    /**
     * topic是否为持久消息
     *
     * @return
     */
    public boolean isPersistent() {
        return type == TopicType.PERSISTENT;
    }

    /**
     * Create a topic name from a string.
     */
    protected TopicDetail(String name) {
        log.info("create a new topic named {}", name);
        // 不含有域分隔符，则说明是普通的短消息
        if (!name.contains(TOPIC_DOMAIN_SEPARATOR)) {
            // short name like <topic> with default TopicType.NON_PERSISTENT, TopicMode.NORMAL and default tenant
            this.type = TopicType.NON_PERSISTENT;
            this.mode = TopicMode.NORMAL;
            this.tenant = PUBLIC_TENANT;
            this.simpleName = name;
            // 完整的completeTopicName就是对各个部分的拼接
            this.completeTopicName = Concat2String.builder()
                    .concat(this.type.getName())
                    .concat(TOPIC_INNER_SEPARATOR)
                    .concat(this.mode.getName())
                    .concat(TOPIC_DOMAIN_SEPARATOR)
                    .concat(PUBLIC_TENANT)
                    .concat(TOPIC_INNER_SEPARATOR)
                    .concat(name)
                    .build();
            this.partitionIndex = getPartitionIndex(name);

        } else {
            // 含有 $ ，表示不为短消息
            // long name like "persistent:normal:$tenant:topic"
            List<String> parts = Splitter.on(TOPIC_DOMAIN_SEPARATOR).limit(2).splitToList(name);
            String header = parts.get(0);
            // The header is like: persistent:normal
            List<String> headers = Splitter.on(TOPIC_INNER_SEPARATOR).limit(2).splitToList(header);
            if (headers.size() == 2) {
                this.type = TopicType.fromString(headers.get(0));
                this.mode = TopicMode.fromString(headers.get(1));
            } else {
                throw new IllegalArgumentException("Invalid topic name: " + name);
            }

            String rest = parts.get(1);
            // The rest of the name is like:
            // new:    <tenant>:<topic>#<partitionIndex>
            parts = Splitter.on(TOPIC_INNER_SEPARATOR).limit(2).splitToList(rest);
            if (parts.size() == 2) {
                this.tenant = parts.get(0);
                this.simpleName = parts.get(1);
                this.completeTopicName = name;
                this.partitionIndex = getPartitionIndex(name);

            } else {
                throw new IllegalArgumentException("Invalid topic name: " + name);
            }
        }
        if (StringUtil.isEmpty(this.simpleName)) {
            throw new IllegalArgumentException("Invalid topic name: " + completeTopicName);
        }
    }

    @Override
    public String toString() {
        return this.completeTopicName;
    }
}
