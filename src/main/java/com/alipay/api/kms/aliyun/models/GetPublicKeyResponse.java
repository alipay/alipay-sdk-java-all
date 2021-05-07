package com.alipay.api.kms.aliyun.models;

import com.alipay.api.kms.aliyun.AliyunResponse;
import com.alipay.api.kms.aliyun.http.UnmarshallerContext;

public class GetPublicKeyResponse extends AliyunResponse {
    private String publicKey;
    private String keyId;
    private String requestId;
    private String keyVersionId;

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getKeyVersionId() {
        return keyVersionId;
    }

    public void setKeyVersionId(String keyVersionId) {
        this.keyVersionId = keyVersionId;
    }

    @Override
    public GetPublicKeyResponse getInstance(UnmarshallerContext context) {
        this.setRequestId(context.stringValue("RequestId"));
        this.setPublicKey(context.stringValue("PublicKey"));
        this.setKeyId(context.stringValue("KeyId"));
        this.setKeyVersionId(context.stringValue("KeyVersionId"));
        return this;
    }
}
