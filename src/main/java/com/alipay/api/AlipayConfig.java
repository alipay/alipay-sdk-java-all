/*
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.alipay.api;

import java.util.Map;

/**
 * @author zhongyu
 * @version AlipayConfig.java, v 0.1 2021年06月09日 8:07 下午 zhongyu
 */
public class AlipayConfig {
    /**
     * 网关地址
     * 线上：https://openapi.alipay.com/gateway.do
     * 沙箱：https://openapi.alipaydev.com/gateway.do
     */
    private String serverUrl = "https://openapi.alipay.com/gateway.do";

    /**
     * 开放平台上创建的应用的ID
     */
    private String appId;

    /**
     * 报文格式，推荐：json
     */
    private String format = "json";

    /**
     * 字符串编码，推荐：utf-8
     */
    private String charset = "utf-8";

    /**
     * 签名算法类型，推荐：RSA2
     */
    private String signType = "RSA2";

    /**
     * 商户私钥
     */
    private String privateKey;

    /**
     * 支付宝公钥字符串（公钥模式下设置，证书模式下无需设置）
     */
    private String alipayPublicKey;

    /**
     * 商户应用公钥证书路径（证书模式下设置，公钥模式下无需设置）
     */
    private String appCertPath;

    /**
     * 支付宝公钥证书路径（证书模式下设置，公钥模式下无需设置）
     */
    private String alipayPublicCertPath;

    /**
     * 支付宝根证书路径（证书模式下设置，公钥模式下无需设置）
     */
    private String rootCertPath;

    /**
     * 指定商户公钥应用证书内容字符串，该字段与appCertPath只需指定一个，优先以该字段的值为准（证书模式下设置，公钥模式下无需设置）
     */
    private String appCertContent;

    /**
     * 指定支付宝公钥证书内容字符串，该字段与alipayPublicCertPath只需指定一个，优先以该字段的值为准（证书模式下设置，公钥模式下无需设置）
     */
    private String alipayPublicCertContent;

    /**
     * 指定根证书内容字符串，该字段与rootCertPath只需指定一个，优先以该字段的值为准（证书模式下设置，公钥模式下无需设置）
     */
    private String rootCertContent;

    /**
     * 敏感信息对称加密算法类型，推荐：AES
     */
    private String encryptType = "AES";

    /**
     * 敏感信息对称加密算法密钥
     */
    private String encryptKey;

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
     * Getter method for property <tt>serverUrl</tt>.
     *
     * @return property value of serverUrl
     */
    public String getServerUrl() {
        return serverUrl;
    }

    /**
     * Setter method for property <tt>serverUrl</tt>.
     *
     * @param serverUrl value to be assigned to property serverUrl
     */
    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    /**
     * Getter method for property <tt>appId</tt>.
     *
     * @return property value of appId
     */
    public String getAppId() {
        return appId;
    }

    /**
     * Setter method for property <tt>appId</tt>.
     *
     * @param appId value to be assigned to property appId
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * Getter method for property <tt>format</tt>.
     *
     * @return property value of format
     */
    public String getFormat() {
        return format;
    }

    /**
     * Setter method for property <tt>format</tt>.
     *
     * @param format value to be assigned to property format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * Getter method for property <tt>charset</tt>.
     *
     * @return property value of charset
     */
    public String getCharset() {
        return charset;
    }

    /**
     * Setter method for property <tt>charset</tt>.
     *
     * @param charset value to be assigned to property charset
     */
    public void setCharset(String charset) {
        this.charset = charset;
    }

    /**
     * Getter method for property <tt>signType</tt>.
     *
     * @return property value of signType
     */
    public String getSignType() {
        return signType;
    }

    /**
     * Setter method for property <tt>signType</tt>.
     *
     * @param signType value to be assigned to property signType
     */
    public void setSignType(String signType) {
        this.signType = signType;
    }

    /**
     * Getter method for property <tt>encryptKey</tt>.
     *
     * @return property value of encryptKey
     */
    public String getEncryptKey() {
        return encryptKey;
    }

    /**
     * Setter method for property <tt>encryptKey</tt>.
     *
     * @param encryptKey value to be assigned to property encryptKey
     */
    public void setEncryptKey(String encryptKey) {
        this.encryptKey = encryptKey;
    }

    /**
     * Getter method for property <tt>encryptType</tt>.
     *
     * @return property value of encryptType
     */
    public String getEncryptType() {
        return encryptType;
    }

    /**
     * Setter method for property <tt>encryptType</tt>.
     *
     * @param encryptType value to be assigned to property encryptType
     */
    public void setEncryptType(String encryptType) {
        this.encryptType = encryptType;
    }

    /**
     * Getter method for property <tt>privateKey</tt>.
     *
     * @return property value of privateKey
     */
    public String getPrivateKey() {
        return privateKey;
    }

    /**
     * Setter method for property <tt>privateKey</tt>.
     *
     * @param privateKey value to be assigned to property privateKey
     */
    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    /**
     * Getter method for property <tt>alipayPublicKey</tt>.
     *
     * @return property value of alipayPublicKey
     */
    public String getAlipayPublicKey() {
        return alipayPublicKey;
    }

    /**
     * Setter method for property <tt>alipayPublicKey</tt>.
     *
     * @param alipayPublicKey value to be assigned to property alipayPublicKey
     */
    public void setAlipayPublicKey(String alipayPublicKey) {
        this.alipayPublicKey = alipayPublicKey;
    }

    /**
     * Getter method for property <tt>certPath</tt>.
     *
     * @return property value of certPath
     */
    public String getAppCertPath() {
        return appCertPath;
    }

    /**
     * Setter method for property <tt>certPath</tt>.
     *
     * @param appCertPath value to be assigned to property certPath
     */
    public void setAppCertPath(String appCertPath) {
        this.appCertPath = appCertPath;
    }

    /**
     * Getter method for property <tt>alipayPublicCertPath</tt>.
     *
     * @return property value of alipayPublicCertPath
     */
    public String getAlipayPublicCertPath() {
        return alipayPublicCertPath;
    }

    /**
     * Setter method for property <tt>alipayPublicCertPath</tt>.
     *
     * @param alipayPublicCertPath value to be assigned to property alipayPublicCertPath
     */
    public void setAlipayPublicCertPath(String alipayPublicCertPath) {
        this.alipayPublicCertPath = alipayPublicCertPath;
    }

    /**
     * Getter method for property <tt>rootCertPath</tt>.
     *
     * @return property value of rootCertPath
     */
    public String getRootCertPath() {
        return rootCertPath;
    }

    /**
     * Setter method for property <tt>rootCertPath</tt>.
     *
     * @param rootCertPath value to be assigned to property rootCertPath
     */
    public void setRootCertPath(String rootCertPath) {
        this.rootCertPath = rootCertPath;
    }

    /**
     * Getter method for property <tt>certContent</tt>.
     *
     * @return property value of certContent
     */
    public String getAppCertContent() {
        return appCertContent;
    }

    /**
     * Setter method for property <tt>certContent</tt>.
     *
     * @param appCertContent value to be assigned to property certContent
     */
    public void setAppCertContent(String appCertContent) {
        this.appCertContent = appCertContent;
    }

    /**
     * Getter method for property <tt>alipayPublicCertContent</tt>.
     *
     * @return property value of alipayPublicCertContent
     */
    public String getAlipayPublicCertContent() {
        return alipayPublicCertContent;
    }

    /**
     * Setter method for property <tt>alipayPublicCertContent</tt>.
     *
     * @param alipayPublicCertContent value to be assigned to property alipayPublicCertContent
     */
    public void setAlipayPublicCertContent(String alipayPublicCertContent) {
        this.alipayPublicCertContent = alipayPublicCertContent;
    }

    /**
     * Getter method for property <tt>rootCertContent</tt>.
     *
     * @return property value of rootCertContent
     */
    public String getRootCertContent() {
        return rootCertContent;
    }

    /**
     * Setter method for property <tt>rootCertContent</tt>.
     *
     * @param rootCertContent value to be assigned to property rootCertContent
     */
    public void setRootCertContent(String rootCertContent) {
        this.rootCertContent = rootCertContent;
    }

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
}