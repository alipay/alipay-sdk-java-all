package com.alipay.mcp.transport;

/**
 * SSE endpoint 事件响应
 *
 * @author alipay
 */
public class EndpointResponse {

    /** 消息端点 URL */
    private String endpoint;

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
}