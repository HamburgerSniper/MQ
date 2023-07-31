package org.catmq.util;

import org.apache.curator.framework.CuratorFramework;

public interface IdGenerator {
    /**
     * generate id —— 给输入的client用户生成id
     *
     * @return id
     */
    long nextId(CuratorFramework client);
}
