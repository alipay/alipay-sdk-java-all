/**
 * Alipay.com Inc. Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.alipay.api;

import java.security.cert.X509Certificate;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author runzhi
 * @version $Id: DefaultAlipayClient.java, v 0.1 2012-11-49:45:21 runzhi Exp $
 */
public class DefaultAlipayClient extends AbstractAlipayClient {

    private String                                     privateKey;
    private String                                     encryptKey;
    private String                                     alipayPublicKey;
    private Signer                                     signer;
    private SignChecker                                signChecker;
    private Encryptor                                  encryptor;
    private Decryptor                                  decryptor;
    private X509Certificate                            cert;
    private ConcurrentHashMap<String, X509Certificate> alipayPublicCertMap;

    public DefaultAlipayClient(String serverUrl, String appId, String privateKey) {
        super(serverUrl, appId, null, null, null);
        this.privateKey = privateKey;
        this.signer = new DefaultSigner(privateKey);
    }

    public DefaultAlipayClient(String serverUrl, String appId, String privateKey, String format) {
        super(serverUrl, appId, format, null, null);
        this.privateKey = privateKey;
        this.signer = new DefaultSigner(privateKey);
    }

    public DefaultAlipayClient(String serverUrl, String appId, String privateKey, String format,
                               String charset) {
        super(serverUrl, appId, format, charset, null);
        this.privateKey = privateKey;
        this.signer = new DefaultSigner(privateKey);
    }

    public DefaultAlipayClient(String serverUrl, String appId, String privateKey, String format,
                               String charset, String alipayPublicKey) {
        super(serverUrl, appId, format, charset, null);
        this.privateKey = privateKey;
        this.signer = new DefaultSigner(privateKey);
        this.alipayPublicKey = alipayPublicKey;
        this.signChecker = new DefaultSignChecker(alipayPublicKey);
    }

    public DefaultAlipayClient(String serverUrl, String appId, String privateKey, String format,
                               String charset, String alipayPublicKey, String signType) {
        super(serverUrl, appId, format, charset, signType);
        this.privateKey = privateKey;
        this.signer = new DefaultSigner(privateKey);
        this.alipayPublicKey = alipayPublicKey;
        this.signChecker = new DefaultSignChecker(alipayPublicKey);
    }

    public DefaultAlipayClient(String serverUrl, String appId, String privateKey, String format,
                               String charset, String alipayPublicKey, String signType,
                               String proxyHost, int proxyPort) {
        super(serverUrl, appId, format, charset, signType, proxyHost, proxyPort);
        this.privateKey = privateKey;
        this.signer = new DefaultSigner(privateKey);
        this.alipayPublicKey = alipayPublicKey;
        this.signChecker = new DefaultSignChecker(alipayPublicKey);
    }

    public DefaultAlipayClient(String serverUrl, String appId, String privateKey, String format,
                               String charset, String alipayPublicKey, String signType,
                               String encryptKey, String encryptType) {
        super(serverUrl, appId, format, charset, signType, encryptType);
        this.privateKey = privateKey;
        this.signer = new DefaultSigner(privateKey);
        this.alipayPublicKey = alipayPublicKey;
        this.signChecker = new DefaultSignChecker(alipayPublicKey);
        this.encryptor = new DefaultEncryptor(encryptKey);
        this.decryptor = new DefaultDecryptor(encryptKey);
    }

    public DefaultAlipayClient(CertAlipayRequest certAlipayRequest) throws AlipayApiException {
        super(certAlipayRequest.getServerUrl(), certAlipayRequest.getAppId(), certAlipayRequest.getFormat(),
                certAlipayRequest.getCharset(), certAlipayRequest.getSignType(), certAlipayRequest.getCertPath(),
                certAlipayRequest.getAlipayPublicCertPath(), certAlipayRequest.getRootCertPath(),
                certAlipayRequest.getProxyHost(), certAlipayRequest.getProxyPort(), certAlipayRequest.getEncryptType());
        this.privateKey = certAlipayRequest.getPrivateKey();
        this.signer = new DefaultSigner(certAlipayRequest.getPrivateKey());
        this.encryptor = new DefaultEncryptor(certAlipayRequest.getEncryptor());
        this.decryptor = new DefaultDecryptor(certAlipayRequest.getEncryptor());
    }

    public Signer getSigner() {
        return signer;
    }

    public SignChecker getSignChecker() {
        return signChecker;
    }

    public Encryptor getEncryptor() {
        return encryptor;
    }

    public Decryptor getDecryptor() {
        return decryptor;
    }

    public X509Certificate getCert() {
        return cert;
    }

    public ConcurrentHashMap<String, X509Certificate> getAlipayPublicCertMap() {
        return alipayPublicCertMap;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        if (this.signer == null) {
            this.signer = new DefaultSigner(privateKey);
        }
    }

    public void setEncryptKey(String encryptKey) {
        this.encryptKey = encryptKey;
        if (this.encryptor == null) {
            this.encryptor = new DefaultEncryptor(encryptKey);
        }
        if (this.decryptor == null) {
            this.decryptor = new DefaultDecryptor(encryptKey);
        }
    }

    public void setAlipayPublicKey(String alipayPublicKey) {
        this.alipayPublicKey = alipayPublicKey;
        if (this.signChecker == null) {
            this.signChecker = new DefaultSignChecker(alipayPublicKey);
        }
    }

    public static Builder builder(String serverUrl, String appId, String privateKey) {
        return new Builder(serverUrl, appId, privateKey);
    }

    public static class Builder {
        private DefaultAlipayClient client;

        Builder(String serverUrl, String appId, String privateKey) {
            client = new DefaultAlipayClient(serverUrl, appId, privateKey);
        }

        public DefaultAlipayClient build() {
            return client;
        }

        public Builder prodCode(String prodCode) {
            client.setProdCode(prodCode);
            return this;
        }

        public Builder format(String format) {
            client.setFormat(format);
            return this;
        }

        public Builder signType(String signType) {
            client.setSignType(signType);
            return this;
        }

        public Builder encryptType(String encryptType) {
            client.setEncryptType(encryptType);
            return this;
        }

        public Builder encryptKey(String encryptKey) {
            client.setEncryptKey(encryptKey);
            return this;
        }

        public Builder alipayPublicKey(String alipayPublicKey) {
            client.setAlipayPublicKey(alipayPublicKey);
            return this;
        }

        public Builder charset(String charset) {
            client.setCharset(charset);
            return this;
        }

        public Builder connectTimeout(int connectTimeout) {
            client.setConnectTimeout(connectTimeout);
            return this;
        }

        public Builder readTimeout(int readTimeout) {
            client.setReadTimeout(readTimeout);
            return this;
        }

        public Builder proxyHost(String proxyHost) {
            client.setProxyHost(proxyHost);
            return this;
        }

        public Builder proxyPort(int proxyPort) {
            client.setProxyPort(proxyPort);
            return this;
        }

        public Builder cert(X509Certificate cert) {
            client.setCert(cert);
            return this;
        }

        public Builder alipayPublicCertMap(ConcurrentHashMap<String, X509Certificate> alipayPublicCertMap) {
            client.setAlipayPublicCertMap(alipayPublicCertMap);
            return this;
        }
    }
}
