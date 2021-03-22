package com.alipay.api.kms.aliyun.models;

import com.alipay.api.kms.aliyun.AliyunResponse;
import com.alipay.api.kms.aliyun.http.UnmarshallerContext;

public class AsymmetricSignResponse extends AliyunResponse {
    private String value;
    private String keyId;
    private String requestId;
    private String keyVersionId;

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getKeyId() {
        return this.keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getKeyVersionId() {
        return this.keyVersionId;
    }

    public void setKeyVersionId(String keyVersionId) {
        this.keyVersionId = keyVersionId;
    }

    @Override
    public AsymmetricSignResponse getInstance(UnmarshallerContext context) {
        this.setRequestId(context.stringValue("RequestId"));
        this.setValue(context.stringValue("Value"));
        this.setKeyId(context.stringValue("KeyId"));
        this.setKeyVersionId(context.stringValue("KeyVersionId"));
        return this;
    }
}
