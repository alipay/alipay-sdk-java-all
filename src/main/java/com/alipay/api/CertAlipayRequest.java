package com.alipay.api;

/**
 * @author junying.wjy
 * @version $Id: CertAlipayRequest.java, v 0.1 2019-08-09 上午11:01 junying.wjy Exp $
 */
public class CertAlipayRequest {

    private String serverUrl;
    private String appId;
    private String privateKey;
    private String format;
    private String charset;
    private String signType;
    private String certPath;
    private String alipayPublicCertPath;
    private String rootCertPath;
    private String encryptor;
    private String encryptType;
    private String proxyHost;
    private int    proxyPort;

    /**
     * 指定商户证书内容字符串，该字段与certPath只需指定一个，优先以该字段的值为准
     */
    private String certContent;

    /**
     * 指定支付宝公钥证书内容字符串，该字段与alipayPublicCertPath只需指定一个，优先以该字段的值为准
     */
    private String alipayPublicCertContent;

    /**
     * 指定根证书内容字符串，该字段与rootCertPath只需指定一个，优先以该字段的值为准
     */
    private String rootCertContent;

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getCertPath() {
        return certPath;
    }

    public void setCertPath(String certPath) {
        this.certPath = certPath;
    }

    public String getAlipayPublicCertPath() {
        return alipayPublicCertPath;
    }

    public void setAlipayPublicCertPath(String alipayPublicCertPath) {
        this.alipayPublicCertPath = alipayPublicCertPath;
    }

    public String getRootCertPath() {
        return rootCertPath;
    }

    public void setRootCertPath(String rootCertPath) {
        this.rootCertPath = rootCertPath;
    }

    public String getEncryptor() {
        return encryptor;
    }

    public void setEncryptor(String encryptor) {
        this.encryptor = encryptor;
    }

    public String getEncryptType() {
        return encryptType;
    }

    public void setEncryptType(String encryptType) {
        this.encryptType = encryptType;
    }

    public String getProxyHost() {
        return proxyHost;
    }

    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    public int getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(int proxyPort) {
        this.proxyPort = proxyPort;
    }

    /**
     * Getter method for property <tt>certContent</tt>.
     *
     * @return property value of certContent
     */
    public String getCertContent() {
        return certContent;
    }

    /**
     * Setter method for property <tt>certContent</tt>.
     *
     * @param certContent value to be assigned to property certContent
     */
    public void setCertContent(String certContent) {
        this.certContent = certContent;
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
