package org.catmq.util;

import org.slf4j.MDC;

import java.util.Map;

/**
 * 上下文工具类ContextMap
 */
public class ContextUtil {
    /**
     *
     * @param mdcContextMap
     */
    public static void restoreContext(Map<String, String> mdcContextMap) {
        if (mdcContextMap == null || mdcContextMap.isEmpty()) {
            MDC.clear();
        } else {
            MDC.setContextMap(mdcContextMap);
        }
    }
}
