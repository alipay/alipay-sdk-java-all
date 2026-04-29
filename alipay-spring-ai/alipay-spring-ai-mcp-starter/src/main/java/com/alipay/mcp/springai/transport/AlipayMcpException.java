package com.alipay.mcp.springai.transport;

/**
 * 支付宝 MCP 异常
 */
public class AlipayMcpException extends RuntimeException {

    private final String errorCode;

    public AlipayMcpException(String message) {
        super(message);
        this.errorCode = null;
    }

    public AlipayMcpException(String message, Throwable cause) {
        super(message, cause);
        this.errorCode = null;
    }

    public AlipayMcpException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public AlipayMcpException(String errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
