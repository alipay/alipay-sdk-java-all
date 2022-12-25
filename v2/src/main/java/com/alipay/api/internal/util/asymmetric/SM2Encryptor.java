/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.api.internal.util.asymmetric;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayConstants;
import com.alipay.api.internal.util.AlipayLogger;
import com.alipay.api.internal.util.StringUtils;
import com.alipay.api.internal.util.codec.Base64;
import org.bouncycastle.jcajce.spec.SM2ParameterSpec;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.Strings;

import javax.crypto.Cipher;
import java.io.UnsupportedEncodingException;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/**
 * 国密SM2算法（ECC算法）加密器
 * 签名部分采用SM3算法进行摘要计算
 */
public class SM2Encryptor extends BaseAsymmetricEncryptor {

    //SM2算法默认用户ID，目前开放平台不会使用非默认用户ID
    public String DEFAULT_USER_ID = "1234567812345678";


    private static BouncyCastleProvider provider;

    static {
        provider = new BouncyCastleProvider();
        Security.addProvider(provider);
    }

    protected String getAsymmetricType() {
        return AlipayConstants.SIGN_TYPE_SM2;
    }

    protected String doDecrypt(String cipherTextBase64, String charset, String privateKey) throws Exception {
        //加载私钥参数
        byte[] cipher = Base64.decodeBase64String(cipherTextBase64);
        byte[] privateKeyByte = Base64.decodeBase64String(privateKey);
        // 解析X509格式SM2私钥
        PrivateKey sm2PrivateKey = parsePKCS8PrivateKey(privateKeyByte);
        // 使用SM2私钥解密
        byte[] buf = sm2Decrypt(cipher, sm2PrivateKey);
        //将解密后的明文按指定字符集编码后返回
        try {
            String strContent = new String(buf, charset);
            return strContent;
        } catch (UnsupportedEncodingException e) {
            AlipayLogger.logBizError(e);
            throw new AlipayApiException(e);
        }
    }

    protected String doEncrypt(String plainText, String charset, String publicKey) throws Exception {
        // 解析PKCS8格式SM2私钥
        byte[] publicKeyByte = Base64.decodeBase64String(publicKey);
        PublicKey sm2PublicKey = parseX509PublicKey(publicKeyByte);
        byte[] plain = plainText.getBytes(charset);
        byte[] cipher = sm2Encrypt(plain, sm2PublicKey);
        //将密文Base64编码后返回
        String strContent = Base64.encodeBase64String(cipher);
        return strContent;

    }

    protected String doSign(String content, String charset, String privateKey) throws Exception {
        byte[] privateKeyByte = Base64.decodeBase64String(privateKey);
        PrivateKey sm2PrivateKey = parsePKCS8PrivateKey(privateKeyByte);
        byte[] message = content.getBytes(charset);
        byte[] signature = sm2Sign(message, sm2PrivateKey, null);

        //将签名结果转换为Base64
        String sign = Base64.encodeBase64String(signature);
        return sign;
    }

    protected boolean doVerify(String content, String charset, String publicKey, String sign) throws Exception {
        // 使用SM2公钥验签
        byte[] signature = Base64.decodeBase64String(sign);
        byte[] message = content.getBytes(charset);
        byte[] publicKeyByte = Base64.decodeBase64String(publicKey);
        PublicKey sm2PublicKey = parseX509PublicKey(publicKeyByte);
        boolean valid = sm2Verify(signature, message, sm2PublicKey, null);
        if (!valid) {
            AlipayLogger.logBizError("验签失败");
        }
        return valid;
    }


    private static byte[] sm2Encrypt(byte[] plain, PublicKey sm2PublicKey) throws AlipayApiException {
        try {
            Cipher sm2CipherEngine = Cipher.getInstance("SM2", "BC");
            sm2CipherEngine.init(Cipher.ENCRYPT_MODE, sm2PublicKey);
            return sm2CipherEngine.doFinal(plain);
        } catch (Exception e) {
            AlipayLogger.logBizError(e);
            throw new AlipayApiException(e);
        }
    }

    private static byte[] sm2Decrypt(byte[] cipher, PrivateKey sm2PrivateKey) throws AlipayApiException {
        try {
            Cipher sm2CipherEngine = Cipher.getInstance("SM2", "BC");
            sm2CipherEngine.init(Cipher.DECRYPT_MODE, sm2PrivateKey);
            return sm2CipherEngine.doFinal(cipher);
        } catch (Exception e) {
            AlipayLogger.logBizError(e);
            throw new AlipayApiException(e);
        }
    }

    private static byte[] sm2Sign(byte[] message, PrivateKey sm2PrivateKey, String sm2UserId) throws AlipayApiException {
        try {
            String userId = "1234567812345678";
            if (!StringUtils.isEmpty(sm2UserId)) {
                userId = sm2UserId;
            }
            Signature sm2SignEngine = Signature.getInstance("SM3withSM2");
            sm2SignEngine.setParameter(new SM2ParameterSpec(
                    Strings.toByteArray(userId)));
            sm2SignEngine.initSign(sm2PrivateKey);
            sm2SignEngine.update(message);
            return sm2SignEngine.sign();
        } catch (Exception e) {
            AlipayLogger.logBizError(e);
            throw new AlipayApiException(e);
        }
    }

    private static boolean sm2Verify(byte[] signature, byte[] message, PublicKey publicKey, String sm2UserId) {
        try {
            String userId = "1234567812345678";
            if (!StringUtils.isEmpty(sm2UserId)) {
                userId = sm2UserId;
            }
            Signature sm2SignEngine = Signature.getInstance("SM3withSM2");
            sm2SignEngine.setParameter(new SM2ParameterSpec(Strings.toByteArray(userId)));
            sm2SignEngine.initVerify(publicKey);
            sm2SignEngine.update(message);
            return sm2SignEngine.verify(signature);
        } catch (Exception e) {
            AlipayLogger.logBizError(e);
            return false;
        }
    }

    private static PublicKey parseX509PublicKey(byte[] x509PublicKey) throws AlipayApiException {
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("EC");
            X509EncodedKeySpec keySpec = new X509EncodedKeySpec(x509PublicKey);
            return keyFactory.generatePublic(keySpec);
        } catch (NoSuchAlgorithmException e) {
            AlipayLogger.logBizError(e);
            throw new AlipayApiException(e);
        } catch (InvalidKeySpecException e) {
            AlipayLogger.logBizError(e);
            throw new AlipayApiException(e);
        }
    }

    private static PrivateKey parsePKCS8PrivateKey(byte[] pkcs8PriateKey) throws AlipayApiException {
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("EC");
            PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(pkcs8PriateKey);
            return keyFactory.generatePrivate(keySpec);
        } catch (NoSuchAlgorithmException e) {
            AlipayLogger.logBizError(e);
            throw new AlipayApiException(e);
        } catch (InvalidKeySpecException e) {
            AlipayLogger.logBizError(e);
            throw new AlipayApiException(e);
        }
    }
}