package org.catmq.client.common;

/**
 * Consumer 应答消息
 * @param <T>
 */
public interface ConsumeCallback<T> {
    void onSuccess(final T consumeValue);

    void onException(final Throwable e);
}
