package com.alipay.mcp.interceptor;

import com.alipay.mcp.config.McpClientConfig;

import java.io.IOException;
import java.util.List;

/**
 * 拦截器链实现
 */
public class InterceptorChain implements Interceptor.Chain {

    private final List<Interceptor> interceptors;
    private final int index;
    private final Request request;
    private final McpClientConfig config;

    /**
     * 构造拦截器链（从头开始）
     */
    public InterceptorChain(List<Interceptor> interceptors, Request request, McpClientConfig config) {
        this(interceptors, 0, request, config);
    }

    /**
     * 构造拦截器链（指定索引）
     */
    private InterceptorChain(List<Interceptor> interceptors, int index, Request request, McpClientConfig config) {
        this.interceptors = interceptors;
        this.index = index;
        this.request = request;
        this.config = config;
    }

    @Override
    public Request request() {
        return request;
    }

    @Override
    public Response proceed(Request request) throws IOException {
        if (index >= interceptors.size()) {
            throw new IllegalStateException("拦截器链已执行完毕");
        }

        InterceptorChain next = new InterceptorChain(interceptors, index + 1, request, config);
        Interceptor interceptor = interceptors.get(index);
        return interceptor.intercept(next);
    }

    @Override
    public McpClientConfig config() {
        return config;
    }
}