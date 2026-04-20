package com.alipay.mcp.transport;

import com.alipay.mcp.McpException;
import com.alipay.mcp.protocol.JsonRpcMessage;

/**
 * MCP 事件监听器
 *
 * @author alipay
 */
public interface McpEventListener {

    /**
     * SSE 连接建立
     */
    default void onConnected() {}

    /**
     * Endpoint 就绪
     * @param endpoint 消息端点 URL
     */
    default void onEndpointReady(String endpoint) {}

    /**
     * 接收到 JSON-RPC 消息
     * @param message JSON-RPC 消息
     */
    default void onMessage(JsonRpcMessage message) {}

    /**
     * 接收到通知（无 id 的消息）
     * @param notification JSON-RPC 通知
     */
    default void onNotification(JsonRpcMessage notification) {}

    /**
     * 进度更新
     * @param progress 进度信息
     */
    default void onProgress(ProgressUpdate progress) {}

    /**
     * 日志输出
     * @param log 日志信息
     */
    default void onLog(LogMessage log) {}

    /**
     * 连接断开
     */
    default void onDisconnected() {}

    /**
     * 发生错误
     * @param e 异常信息
     */
    default void onError(McpException e) {}
}