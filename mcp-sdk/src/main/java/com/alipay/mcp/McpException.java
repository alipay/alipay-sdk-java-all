package com.alipay.mcp;

/**
 * MCP 客户端异常
 *
 * @author alipay
 */
public class McpException extends Exception {

    public McpException(String message) {
        super(message);
    }

    public McpException(String message, Throwable cause) {
        super(message, cause);
    }
}