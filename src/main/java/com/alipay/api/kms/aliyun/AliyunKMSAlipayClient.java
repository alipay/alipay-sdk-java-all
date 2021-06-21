package com.alipay.api.kms.aliyun;

import com.alipay.api.*;
import com.alipay.api.internal.util.codec.Base64;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.PublicKey;
import java.security.Security;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

public class AliyunKMSAlipayClient extends AbstractAlipayClient {
    private Signer signer;
    private SignChecker signChecker;
    private Encryptor encryptor;
    private Decryptor decryptor;

    public AliyunKMSAlipayClient(String serverUrl, String appId, AliyunKMSClient kmsClient, String keyId, String keyVersionId) {
        super(serverUrl, appId, (String) null, (String) null, (String) null);
        this.signer = new AliyunKMSSigner(kmsClient, keyId, keyVersionId);
    }

    public AliyunKMSAlipayClient(String serverUrl, String appId, String format, AliyunKMSClient kmsClient, String keyId, String keyVersionId) {
        super(serverUrl, appId, format, (String) null, (String) null);
        this.signer = new AliyunKMSSigner(kmsClient, keyId, keyVersionId);
    }

    public AliyunKMSAlipayClient(String serverUrl, String appId, String format, String charset, AliyunKMSClient kmsClient, String keyId, String keyVersionId) {
        super(serverUrl, appId, format, charset, (String) null);
        this.signer = new AliyunKMSSigner(kmsClient, keyId, keyVersionId);
    }

    public AliyunKMSAlipayClient(String serverUrl, String appId, String format, String charset, String alipayPublicKey, AliyunKMSClient kmsClient, String keyId, String keyVersionId) {
        super(serverUrl, appId, format, charset, (String) null);
        this.signer = new AliyunKMSSigner(kmsClient, keyId, keyVersionId);
        this.signChecker = new DefaultSignChecker(alipayPublicKey);
    }

    public AliyunKMSAlipayClient(String serverUrl, String appId, String format, String charset, String alipayPublicKey, String signType, AliyunKMSClient kmsClient, String keyId, String keyVersionId) {
        super(serverUrl, appId, format, charset, signType);
        this.signer = new AliyunKMSSigner(kmsClient, keyId, keyVersionId);
        this.signChecker = new DefaultSignChecker(alipayPublicKey);
    }

    public AliyunKMSAlipayClient(String serverUrl, String appId, String format, String charset, String alipayPublicKey, String signType, String proxyHost, int proxyPort, AliyunKMSClient kmsClient, String keyId, String keyVersionId) {
        super(serverUrl, appId, format, charset, signType, proxyHost, proxyPort);
        this.signer = new AliyunKMSSigner(kmsClient, keyId, keyVersionId);
        this.signChecker = new DefaultSignChecker(alipayPublicKey);
    }

    public AliyunKMSAlipayClient(String serverUrl, String appId, String format, String charset, String alipayPublicKey, String signType, String encryptKey, String encryptType, AliyunKMSClient kmsClient, String keyId, String keyVersionId) {
        super(serverUrl, appId, format, charset, signType, encryptType);
        this.signer = new AliyunKMSSigner(kmsClient, keyId, keyVersionId);
        this.signChecker = new DefaultSignChecker(alipayPublicKey);
        this.encryptor = new DefaultEncryptor(encryptKey);
        this.decryptor = new DefaultDecryptor(encryptKey);
    }

    public AliyunKMSAlipayClient(AliyunKMSCertAlipayRequest request) throws AlipayApiException {
        super(request.getServerUrl(), request.getAppId(), request.getFormat(),
                request.getCharset(), request.getSignType(),
                request.getCertPath(), request.getCertContent(),
                request.getAlipayPublicCertPath(), request.getAlipayPublicCertContent(),
                request.getRootCertPath(), request.getRootCertContent(),
                request.getProxyHost(), request.getProxyPort(), request.getEncryptType());
        this.signer = new AliyunKMSSigner(request.getClient(), request.getKeyId(), request.getKeyVersionId());
        this.encryptor = new DefaultEncryptor(request.getEncryptor());
        this.decryptor = new DefaultDecryptor(request.getEncryptor());
        X509Certificate alipayPublicCert = this.getCert(request.getAlipayPublicCertPath());
        PublicKey publicKey = alipayPublicCert.getPublicKey();
        this.signChecker = new DefaultSignChecker(Base64.encodeBase64String(publicKey.getEncoded()));
    }

    private X509Certificate getCert(String certPath) throws AlipayApiException {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(certPath);
            Security.addProvider(new BouncyCastleProvider());
            return (X509Certificate) CertificateFactory.getInstance("X.509", "BC").generateCertificate(inputStream);
        } catch (Exception e) {
            throw new AlipayApiException(e);
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new AlipayApiException(e);
            }
        }
    }

    public void setSigner(AliyunKMSClient kmsClient, String keyId, String keyVersionId) {
        if (this.signer == null) {
            this.signer = new AliyunKMSSigner(kmsClient, keyId, keyVersionId);
        }
    }

    public void setSignChecker(String alipayPublicKey) {
        if (this.signChecker == null) {
            this.signChecker = new DefaultSignChecker(alipayPublicKey);
        }
    }

    public void setEncryptor(String encryptKey) {
        if (this.encryptor == null) {
            this.encryptor = new DefaultEncryptor(encryptKey);
        }
    }

    public void setDecryptor(String encryptKey) {
        if (this.decryptor == null) {
            this.decryptor = new DefaultDecryptor(encryptKey);
        }
    }

    public Signer getSigner() {
        return this.signer;
    }

    public SignChecker getSignChecker() {
        return this.signChecker;
    }

    public Encryptor getEncryptor() {
        return this.encryptor;
    }

    public Decryptor getDecryptor() {
        return this.decryptor;
    }
}
