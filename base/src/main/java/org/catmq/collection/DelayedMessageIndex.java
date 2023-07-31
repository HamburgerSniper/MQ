package org.catmq.collection;

import lombok.Getter;

/**
 * 延迟消息的索引
 */
@Getter
public class DelayedMessageIndex {

    private final long expireTimeMs;
    private final String completeTopic;
    private final long segmentId;
    private final long entryId;

    public DelayedMessageIndex(long expireTimeMs, String completeTopic, long segmentId, long entryId) {
        this.expireTimeMs = expireTimeMs;
        this.completeTopic = completeTopic;
        this.segmentId = segmentId;
        this.entryId = entryId;
    }

    private TimerTaskList.TimerTaskEntry timerTaskEntry = null;

    public synchronized void cancel() {
        if (timerTaskEntry != null) {
            timerTaskEntry.remove();
        }
        timerTaskEntry = null;
    }

    public synchronized void setTimerTaskEntry(TimerTaskList.TimerTaskEntry entry) {
        if (timerTaskEntry != null && timerTaskEntry != entry) {
            timerTaskEntry.remove();
        }
        timerTaskEntry = entry;
    }

    public TimerTaskList.TimerTaskEntry getTimerTaskEntry() {
        return timerTaskEntry;
    }
}