package com.alipay.api.kms.aliyun;

import com.alipay.api.internal.util.codec.Base64;
import com.alipay.api.kms.aliyun.models.AsymmetricSignRequest;
import com.alipay.api.kms.aliyun.models.AsymmetricSignResponse;
import com.alipay.api.kms.aliyun.models.GetPublicKeyRequest;
import com.alipay.api.kms.aliyun.models.GetPublicKeyResponse;
import org.bouncycastle.asn1.gm.GMNamedCurves;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SM3Digest;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.math.ec.ECFieldElement;

import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.Security;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;

public class AliyunKMSClient extends AliyunRpcClient {
    private PublicKey publicKey = null;
    private static final Map<String, String> digestAlgs = new HashMap<String, String>();
    private static final Map<String, String> namedCurves = new HashMap<String, String>();

    public AliyunKMSClient(String endpoint, String accessKeyId, String accessKeySecret) {
        super(endpoint, accessKeyId, accessKeySecret);
    }

    public AliyunKMSClient(String endpoint, String accessKeyId, String accessKeySecret, String stsToken) {
        super(endpoint, accessKeyId, accessKeySecret, stsToken);
    }

    public AliyunKMSClient(String endpoint, String accessKeyId, String accessKeySecret, String roleArn, String roleSessionName) {
        super(endpoint, accessKeyId, accessKeySecret, roleArn, roleSessionName);
    }

    public AliyunKMSClient(String endpoint, String accessKeyId, String accessKeySecret, String roleArn, String roleSessionName, String policy) {
        super(endpoint, accessKeyId, accessKeySecret, roleArn, roleSessionName, policy);
    }

    public AliyunKMSClient(String endpoint, String roleName) {
        super(endpoint, roleName);
    }

    private PublicKey getPublicKey(String keyId, String keyVersionId) throws Exception {
        GetPublicKeyRequest request = new GetPublicKeyRequest();
        request.setKeyId(keyId);
        request.setKeyVersionId(keyVersionId);
        GetPublicKeyResponse response = getAcsResponse(request);

        String pemKey = String.valueOf(response.getPublicKey());
        pemKey = pemKey.replaceFirst("-----BEGIN PUBLIC KEY-----", "");
        pemKey = pemKey.replaceFirst("-----END PUBLIC KEY-----", "");
        pemKey = pemKey.replaceAll("\\s", "");
        byte[] derKey = Base64.decodeBase64String(pemKey);

        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(derKey);
        Security.addProvider(new BouncyCastleProvider());
        return KeyFactory.getInstance("EC", "BC").generatePublic(keySpec);
    }

    private byte[] getZ(ECPublicKeyParameters ecPublicKeyParameters, ECDomainParameters ecDomainParameters) {
        Digest digest = new SM3Digest();
        digest.reset();

        String userID = "1234567812345678";
        addUserID(digest, userID.getBytes());

        addFieldElement(digest, ecDomainParameters.getCurve().getA());
        addFieldElement(digest, ecDomainParameters.getCurve().getB());
        addFieldElement(digest, ecDomainParameters.getG().getAffineXCoord());
        addFieldElement(digest, ecDomainParameters.getG().getAffineYCoord());
        addFieldElement(digest, ecPublicKeyParameters.getQ().getAffineXCoord());
        addFieldElement(digest, ecPublicKeyParameters.getQ().getAffineYCoord());

        byte[] result = new byte[digest.getDigestSize()];
        digest.doFinal(result, 0);
        return result;
    }

    private void addUserID(Digest digest, byte[] userID) {
        int len = userID.length * 8;
        digest.update((byte) (len >> 8 & 0xFF));
        digest.update((byte) (len & 0xFF));
        digest.update(userID, 0, userID.length);
    }

    private void addFieldElement(Digest digest, ECFieldElement v) {
        byte[] p = v.getEncoded();
        digest.update(p, 0, p.length);
    }

    private byte[] calcSM3Digest(PublicKey pubKey, byte[] message, String algorithm) {
        X9ECParameters x9ECParameters = GMNamedCurves.getByName(namedCurves.get(algorithm));
        ECDomainParameters ecDomainParameters = new ECDomainParameters(x9ECParameters.getCurve(), x9ECParameters.getG(), x9ECParameters.getN());
        BCECPublicKey localECPublicKey = (BCECPublicKey) pubKey;
        ECPublicKeyParameters ecPublicKeyParameters = new ECPublicKeyParameters(localECPublicKey.getQ(), ecDomainParameters);
        byte[] z = getZ(ecPublicKeyParameters, ecDomainParameters);
        Digest digest = new SM3Digest();
        digest.update(z, 0, z.length);
        digest.update(message, 0, message.length);
        byte[] result = new byte[digest.getDigestSize()];
        digest.doFinal(result, 0);
        return result;
    }

    /**
     * 获取阿里云KMS签名
     * 阿里云KMS签名接口文档：
     * https://help.aliyun.com/document_detail/148132.html?spm=a2c4g.11186623.6.610.3fd17338c716si
     *
     * @param keyId        阿里云KMS非对称密钥ID
     * @param keyVersionId 阿里云KMS非对称密钥版本ID
     * @param algorithm    阿里云KMS签名算法
     * @param message      待签名的内容
     * @return 签名值的Base64串
     */
    private String asymmetricSign(String keyId, String keyVersionId, String algorithm, byte[] message) throws Exception {
        byte[] digest;
        if (algorithm.equals("SM2DSA")) {
            if (this.publicKey == null) {
                this.publicKey = getPublicKey(keyId, keyVersionId);
            }
            digest = calcSM3Digest(this.publicKey, message, algorithm);
        } else {
            digest = MessageDigest.getInstance(digestAlgs.get(algorithm)).digest(message);
        }
        AsymmetricSignRequest request = new AsymmetricSignRequest();
        request.setKeyId(keyId);
        request.setKeyVersionId(keyVersionId);
        request.setAlgorithm(algorithm);
        request.setDigest(Base64.encodeBase64String(digest));
        AsymmetricSignResponse response = getAcsResponse(request);
        return response.getValue();
    }

    /**
     * 计算签名
     *
     * @param keyId        阿里云KMS非对称密钥ID
     * @param keyVersionId 阿里云KMS非对称密钥版本ID
     * @param algorithm    阿里云KMS签名算法
     * @param message      待签名的内容
     * @return 签名值的Base64串
     */
    public String sign(String keyId, String keyVersionId, String algorithm, byte[] message) throws Exception {
        return asymmetricSign(keyId, keyVersionId, algorithm, message);
    }

    static {
        digestAlgs.put("RSA_PKCS1_SHA_256", "SHA-256");
        digestAlgs.put("RSA_PSS_SHA_256", "SHA-256");
        digestAlgs.put("ECDSA_SHA_256", "SHA-256");

        namedCurves.put("SM2DSA", "sm2p256v1");
    }
}
