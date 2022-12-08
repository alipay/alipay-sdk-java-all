/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.alipay.api.internal.util;

import com.alipay.api.FileItem;

import java.io.IOException;
import java.util.Map;

/**
 * @author jishupei.jsp
 * @version : AbstractHttpClient, v0.1 2022年05月25日 5:41 下午 jishupei.jsp Exp $
 */
public abstract class AbstractHttpClient {
    /**
     * HTTP代理服务器主机地址
     */
    private String proxyHost;

    /**
     * HTTP代理服务器端口
     */
    private int proxyPort;

    /**
     * 自定义HTTP Header
     */
    private Map<String, String> customHeaders;

    /**
     * 连接超时，单位：毫秒
     */
    private int connectTimeout = 3000;

    /**
     * 读取超时，单位：毫秒
     */
    private int readTimeout = 15000;

    /**
     * 连接池最大空闲连接数
     */
    private int maxIdleConnections = 0;

    /**
     * 存活时间，单位：毫秒
     */
    private long keepAliveDuration = 10000L;

    /**
     * 执行HTTP POST请求。
     */
    public abstract String doPost(String url, Map<String, String> params, String charset, Map<String, String> resHeaders) throws IOException;

    /**
     * 执行带文件上传的HTTP POST请求。
     */
    public abstract String doPost(String url, Map<String, String> params, Map<String, FileItem> fileParams, String charset, Map<String, String> resHeaders) throws IOException;

    /**
     * Getter method for property <tt>proxyHost</tt>.
     *
     * @return property value of proxyHost
     */
    public String getProxyHost() {
        return proxyHost;
    }

    /**
     * Setter method for property <tt>proxyHost</tt>.
     *
     * @param proxyHost value to be assigned to property proxyHost
     */
    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    /**
     * Getter method for property <tt>proxyPort</tt>.
     *
     * @return property value of proxyPort
     */
    public int getProxyPort() {
        return proxyPort;
    }

    /**
     * Setter method for property <tt>proxyPort</tt>.
     *
     * @param proxyPort value to be assigned to property proxyPort
     */
    public void setProxyPort(int proxyPort) {
        this.proxyPort = proxyPort;
    }

    /**
     * Getter method for property <tt>customHeaders</tt>.
     *
     * @return property value of customHeaders
     */
    public Map<String, String> getCustomHeaders() {
        return customHeaders;
    }

    /**
     * Setter method for property <tt>customHeaders</tt>.
     *
     * @param customHeaders value to be assigned to property customHeaders
     */
    public void setCustomHeaders(Map<String, String> customHeaders) {
        this.customHeaders = customHeaders;
    }

    /**
     * Getter method for property <tt>connectTimeout</tt>.
     *
     * @return property value of connectTimeout
     */
    public int getConnectTimeout() {
        return connectTimeout;
    }

    /**
     * Setter method for property <tt>connectTimeout</tt>.
     *
     * @param connectTimeout value to be assigned to property connectTimeout
     */
    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    /**
     * Getter method for property <tt>readTimeout</tt>.
     *
     * @return property value of readTimeout
     */
    public int getReadTimeout() {
        return readTimeout;
    }

    /**
     * Setter method for property <tt>readTimeout</tt>.
     *
     * @param readTimeout value to be assigned to property readTimeout
     */
    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }

    /**
     * Getter method for property <tt>maxIdleConnections</tt>.
     *
     * @return property value of maxIdleConnections
     */
    public int getMaxIdleConnections() {
        return maxIdleConnections;
    }

    /**
     * Setter method for property <tt>maxIdleConnections</tt>.
     *
     * @param maxIdleConnections value to be assigned to property maxIdleConnections
     */
    public void setMaxIdleConnections(int maxIdleConnections) {
        this.maxIdleConnections = maxIdleConnections;
    }

    /**
     * Getter method for property <tt>keepAliveDuration</tt>.
     *
     * @return property value of keepAliveDuration
     */
    public long getKeepAliveDuration() {
        return keepAliveDuration;
    }

    /**
     * Setter method for property <tt>keepAliveDuration</tt>.
     *
     * @param keepAliveDuration value to be assigned to property keepAliveDuration
     */
    public void setKeepAliveDuration(long keepAliveDuration) {
        this.keepAliveDuration = keepAliveDuration;
    }
}
