/*
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.alipay.v3.util.model;

/**
 * @author jishupei.jsp
 * @version : AlipayAuth, v0.1 2022年06月15日 8:04 下午 jishupei.jsp Exp $
 */
public class AlipayConfig {

    /**
     * 网关地址
     */
    private String serverUrl;

    /**
     * 开放平台上创建的应用的ID
     */
    private String appId;

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
}