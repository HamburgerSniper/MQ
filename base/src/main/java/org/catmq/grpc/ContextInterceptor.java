package org.catmq.grpc;

import io.grpc.*;
import io.grpc.Context;
import lombok.extern.slf4j.Slf4j;

/**
 * gRPC拦截器
 * 1. ClientInterceptor :客户端拦截器
 * 2. ServerInterceptor :服务端拦截器
 *
 * @author HamburgerSniper
 */
@Slf4j
public class ContextInterceptor implements ServerInterceptor {

    /**
     * @param call    ServerCall对象，包含客户端请求的MethodDescriptor
     * @param headers 请求头信息
     * @param next    处理链上的下一个处理
     * @param <R>
     * @param <W>
     * @return
     */
    @Override
    public <R, W> ServerCall.Listener<R> interceptCall(
            ServerCall<R, W> call,
            Metadata headers,
            ServerCallHandler<R, W> next
    ) {
        io.grpc.Context context = Context.current().withValue(InterceptorConstants.METADATA, headers);
        return Contexts.interceptCall(context, call, headers, next);
    }
}
