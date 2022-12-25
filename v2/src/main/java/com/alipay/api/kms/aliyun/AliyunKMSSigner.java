package com.alipay.api.kms.aliyun;

import com.alipay.api.Signer;

import java.util.HashMap;
import java.util.Map;

public class AliyunKMSSigner implements Signer {
    private final AliyunKMSClient client;
    private String keyId;
    private String keyVersionId;
    private String algorithm;

    /**
     * 支付宝signType与KMS签名算法映射表
     * -----------------------------------------------------------------
     * | 支付宝signType  |     KMS签名算法    | KMS密钥类型 | KMS密钥用途 |
     * -----------------------------------------------------------------
     * |  RSA2          | RSA_PKCS1_SHA_256 |  RSA_2048  | SIGN/VERIFY |
     * -----------------------------------------------------------------
     * |  SM2           |      SM2DSA       |  EC_SM2    | SIGN/VERIFY |
     * -----------------------------------------------------------------
     */
    private static final Map<String, String> signAlgs = new HashMap<String, String>();

    public AliyunKMSSigner(AliyunKMSClient client, String keyId, String keyVersionId) {
        this.client = client;
        this.keyId = keyId;
        this.keyVersionId = keyVersionId;
        this.algorithm = null;
    }

    /**
     * 计算签名
     *
     * @param sourceContent 待签名的内容
     * @param signType      签名类型
     * @param charset       字符集
     * @return 签名值的Base64串
     */
    public String sign(String sourceContent, String signType, String charset) {
        try {
            if (this.algorithm == null || this.algorithm.isEmpty()) {
                if (!signType.equals("RSA")) {
                    this.algorithm = signAlgs.get(signType);
                } else {
                    throw new RuntimeException("KMS not supported signType: " + signType);
                }
            }
            return this.client.sign(this.keyId, this.keyVersionId, this.algorithm, sourceContent.getBytes(charset));
        } catch (Exception e) {
            throw new RuntimeException("exception obtaining KMS signature: " + e.getMessage(), e);
        }
    }

    public String getAlgorithm() {
        return this.algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

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

    static {
        signAlgs.put("RSA2", "RSA_PKCS1_SHA_256");
        signAlgs.put("SM2", "SM2DSA");
    }
}
