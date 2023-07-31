package org.catmq.util;

import java.util.concurrent.CompletionException;
import java.util.concurrent.ExecutionException;

/**
 * ExceptionUtil：异常工具类
 */
public class ExceptionUtil {
    /**
     * 获取异常的真实信息
     *
     * @param throwable
     * @return
     */
    public static Throwable getRealException(Throwable throwable) {
        if (throwable instanceof CompletionException || throwable instanceof ExecutionException) {
            if (throwable.getCause() != null) {
                throwable = throwable.getCause();
            }
        }
        return throwable;
    }

    /**
     * 获取错误详细信息
     *
     * @param t
     * @return
     */
    public static String getErrorDetailMessage(Throwable t) {
        if (t == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(t.getMessage()).append(". ").append(t.getClass().getSimpleName());

        if (t.getStackTrace().length > 0) {
            sb.append(". ").append(t.getStackTrace()[0]);
        }
        return sb.toString();
    }
}
