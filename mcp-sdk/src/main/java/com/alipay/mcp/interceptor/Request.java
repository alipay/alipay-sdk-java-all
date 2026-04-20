package com.alipay.mcp.interceptor;

import java.util.HashMap;
import java.util.Map;

/**
 * 请求对象
 */
public class Request {

    private String url;
    private String method;
    private String body;
    private Map<String, String> headers = new HashMap<>();
    private Map<String, Object> properties = new HashMap<>();

    public Request() {
    }

    public Request(String url, String method, String body) {
        this.url = url;
        this.method = method;
        this.body = body;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
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

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    /**
     * 添加 header
     */
    public Request addHeader(String key, String value) {
        this.headers.put(key, value);
        return this;
    }

    /**
     * 获取 property
     */
    public Object getProperty(String key) {
        return properties.get(key);
    }

    /**
     * 设置 property
     */
    public Request setProperty(String key, Object value) {
        this.properties.put(key, value);
        return this;
    }

    @Override
    public String toString() {
        return "Request{" +
                "url='" + url + '\'' +
                ", method='" + method + '\'' +
                ", body='" + body + '\'' +
                ", headers=" + headers +
                '}';
    }
}