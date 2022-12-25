package com.alipay.api.kms.aliyun.models;

import com.alipay.api.kms.aliyun.AliyunRequest;
import com.alipay.api.kms.aliyun.http.MethodType;
import com.alipay.api.kms.aliyun.http.ProtocolType;

public class AsymmetricSignRequest extends AliyunRequest<AsymmetricSignResponse> {
    private String keyVersionId;
    private String digest;
    private String keyId;
    private String algorithm;

    public AsymmetricSignRequest() {
        super("2016-01-20", "AsymmetricSign");
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

    public String getDigest() {
        return this.digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
        if (digest != null) {
            putQueryParameter("Digest", digest);
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

    public String getAlgorithm() {
        return this.algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        if (algorithm != null) {
            putQueryParameter("Algorithm", algorithm);
        }
    }

    @Override
    public Class<AsymmetricSignResponse> getResponseClass() {
        return AsymmetricSignResponse.class;
    }
}
