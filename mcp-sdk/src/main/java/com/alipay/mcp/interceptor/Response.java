package com.alipay.mcp.interceptor;

import java.util.HashMap;
import java.util.Map;

/**
 * 响应对象
 */
public class Response {

    private int code;
    private String body;
    private Map<String, String> headers = new HashMap<>();

    public Response() {
    }

    public Response(int code, String body) {
        this.code = code;
        this.body = body;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public boolean isSuccessful() {
        return code >= 200 && code < 300;
    }

    @Override
    public String toString() {
        return "Response{" +
                "code=" + code +
                ", body='" + body + '\'' +
                ", headers=" + headers +
                '}';
    }
}