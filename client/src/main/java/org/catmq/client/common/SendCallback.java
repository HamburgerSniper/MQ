package org.catmq.client.common;

/**
 * 在Producer发送Message后，Broker对Producer的回应
 */
public interface SendCallback {
    void onSuccess(final SendResult sendResult);

    void onException(final Throwable e);
}
