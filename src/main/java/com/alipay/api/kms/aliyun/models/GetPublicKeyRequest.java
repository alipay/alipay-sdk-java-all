package com.alipay.api.kms.aliyun.models;

import com.alipay.api.kms.aliyun.AliyunRequest;
import com.alipay.api.kms.aliyun.http.MethodType;
import com.alipay.api.kms.aliyun.http.ProtocolType;

public class GetPublicKeyRequest extends AliyunRequest<GetPublicKeyResponse> {
    private String keyVersionId;
    private String keyId;

    public GetPublicKeyRequest() {
        super("2016-01-20", "GetPublicKey");
        setProtocol(ProtocolType.HTTPS);
        setMethod(MethodType.POST);
    }

    public String getKeyVersionId() {
        return this.keyVersionId;
    }

    public void setKeyVersionId(String keyVersionId) {
        this.keyVersionId = keyVersionId;
        if (keyVersionId != null) {
            putQueryParameter("KeyVersionId", keyVersionId);
        }
    }

    public String getKeyId() {
        return this.keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
        if (keyId != null) {
            putQueryParameter("KeyId", keyId);
        }
    }

    @Override
    public Class<GetPublicKeyResponse> getResponseClass() {
        return GetPublicKeyResponse.class;
    }
}
