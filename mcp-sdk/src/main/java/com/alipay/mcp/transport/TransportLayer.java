package com.alipay.mcp.transport;

import com.alipay.mcp.interceptor.Interceptor;

import java.util.concurrent.CompletableFuture;

/**
 * 传输层接口
 */
public interface TransportLayer {

    /**
     * 建立 SSE 连接
     *
     * @param listener 事件监听器
     */
    void connect(McpEventListener listener);

    /**
     * 发送请求
     *
     * @param method 方法名
     * @param params 参数
     * @return 响应 Future
     */
    CompletableFuture<Object> sendRequest(String method, Object params);

    /**
     * 发送异步通知
     *
     * @param method 方法名
     * @param params 参数
     */
    void sendNotification(String method, Object params);

    /**
     * 关闭连接
     */
    void close();

    /**
     * 获取消息端点
     */
    String getMessageEndpoint();
}