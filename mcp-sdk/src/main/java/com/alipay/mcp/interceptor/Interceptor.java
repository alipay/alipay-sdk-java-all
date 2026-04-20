package com.alipay.mcp.interceptor;

import com.alipay.mcp.config.McpClientConfig;

import java.io.IOException;

/**
 * 拦截器接口
 */
public interface Interceptor {

    /**
     * 拦截请求
     *
     * @param chain 拦截器链
     * @return 响应结果
     * @throws IOException IO 异常
     */
    Response intercept(Chain chain) throws IOException;

    /**
     * 拦截器链接口
     */
    interface Chain {
        /**
         * 获取当前请求
         */
        Request request();

        /**
         * 继续执行链
         *
         * @param request 请求
         * @return 响应
         * @throws IOException IO 异常
         */
        Response proceed(Request request) throws IOException;

        /**
         * 获取配置
         */
        McpClientConfig config();
    }
}