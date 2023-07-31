package org.catmq.thread;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * 线程池状态监视器
 */
public interface ThreadPoolStatusMonitor {

    String describe();

    double value(ThreadPoolExecutor executor);

    boolean needPrintJstack(ThreadPoolExecutor executor, double value);
}
