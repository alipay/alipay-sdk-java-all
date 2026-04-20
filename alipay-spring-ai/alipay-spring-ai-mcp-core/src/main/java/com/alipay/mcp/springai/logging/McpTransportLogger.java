package com.alipay.mcp.springai.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * MCP 传输层日志记录器
 */
public class McpTransportLogger {

    private static final Logger logger = LoggerFactory.getLogger("com.alipay.mcp.springai.transport");
    private static final Logger httpLogger = LoggerFactory.getLogger("com.alipay.mcp.springai.transport.http");

    // SSE 连接日志
    public static void logSseConnect(String endpoint) {
        logger.info("[SSE] 连接到端点: {}", endpoint);
    }

    public static void logSseConnected(String endpoint) {
        logger.info("[SSE] 连接成功: {}", endpoint);
    }

    public static void logSseDisconnected(String endpoint, String reason) {
        logger.info("[SSE] 连接断开: {}, 原因: {}", endpoint, reason);
    }

    public static void logSseError(Throwable error) {
        logger.error("[SSE] 连接错误", error);
    }

    // HTTP 请求/响应日志
    public static void logHttpRequest(String method, String url, String body) {
        if (httpLogger.isTraceEnabled()) {
            httpLogger.trace("[HTTP REQUEST] {} {}\nBody: {}", method, url, body);
        }
    }

    public static void logHttpResponse(String method, String url, int status, String body) {
        if (httpLogger.isTraceEnabled()) {
            httpLogger.trace("[HTTP RESPONSE] {} {} | Status: {}\nBody: {}",
                method, url, status, body);
        }
    }

    // 签名日志（脱敏）
    public static void logSigning(String authString) {
        logger.debug("[SIGN] 构建认证字符串: {}", maskSensitive(authString));
    }

    private static String maskSensitive(String input) {
        // 脱敏处理，隐藏签名值
        if (input == null) return "";
        return input.replaceAll("sign=[^,]+", "sign=***");
    }
}
