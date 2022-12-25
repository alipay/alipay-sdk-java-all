package com.alipay.api.kms.aliyun;

import com.alipay.api.CertAlipayRequest;

public class AliyunKMSCertAlipayRequest extends CertAlipayRequest {
    private String keyId;
    private String keyVersionId;
    private AliyunKMSClient client;

    public String getKeyId() {
        return this.keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getKeyVersionId() {
        return this.keyVersionId;
    }

    public void setKeyVersionId(String keyVersionId) {
        this.keyVersionId = keyVersionId;
    }

    public AliyunKMSClient getClient() {
        return this.client;
    }

    public void setClient(AliyunKMSClient client) {
        this.client = client;
    }
}
