/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.alipay.v3.util;

import com.alipay.v3.ApiException;
import com.google.common.base.Strings;
import org.bouncycastle.util.encoders.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.ByteArrayOutputStream;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author jishupei.jsp
 * @version : AlipayConfigUtil, v0.1 2022年06月17日 11:21 上午 jishupei.jsp Exp $
 */
public class AlipayConfigUtil {

    /**
     * 开放平台上创建的应用的ID
     */
    private String appId;

    /**
     * 字符串编码，推荐：utf-8
     */
    private String charset = "utf-8";

    /**
     * 商户私钥
     */
    private String privateKey;

    /**
     * 支付宝公钥字符串（公钥模式下设置，证书模式下无需设置）
     */
    private String alipayPublicKey;

    /**
     * 支付宝根证书内容
     */
    private String rootCertContent;

    /**
     * 支付宝根证书序列号
     */
    private String rootCertSN;

    /**
     * 商户应用公钥证书序列号
     */
    private String appCertSN;

    /**
     * 缓存的不同支付宝公钥证书序列号对应的支付宝公钥
     */
    private ConcurrentHashMap<String, String> cachedAlipayPublicKey = new ConcurrentHashMap<String, String>();

    /**
     * 敏感信息对称加密算法类型，推荐：AES
     */
    private String encryptType = "AES";

    /**
     * 敏感信息对称加密算法密钥
     */
    private String encryptKey;

    /**
     * RSA2对应的真实非对称加密算法名称
     */
    public static final String RSA = "RSA";

    /**
     * RSA2对应的真实签名算法名称
     */
    public static final String SHA_256_WITH_RSA = "SHA256WithRSA";

    public static final String ALIPAY_SHA_256_WITH_RSA = "ALIPAY-SHA256withRSA";

    private static final String AES_ALG = "AES";
    private static final String AES_CBC_PCK_ALG = "AES/CBC/PKCS5Padding";
    private static final byte[] AES_IV = initIV();

    /**
     * RSA2最大加密明文大小(2048/8-11=244)
     */
    private static final int MAX_ENCRYPT_BLOCK_SIZE = 244;
    /**
     * RSA2最大解密密文大小(2048/8=256)
     */
    private static final int MAX_DECRYPT_BLOCK_SIZE = 256;

    /**
     * 计算签名并添加header
     *
     * @param httpMethod      本次请求的http方法
     * @param httpRequestUri  本次请求的uri信息（不包括域名）
     * @param httpRequestBody 本次请求的body内容，body为空时按空字符串处理，即""
     * @param headerParams    header
     */
    public void sign(String httpMethod, String httpRequestUri, String httpRequestBody, Map<String, String> headerParams) throws ApiException {
        /*if (Strings.isNullOrEmpty(this.privateKey)) {
            throw new ApiException("私钥[privateKey]不可为空");
        }*/
        String appAuthToken = headerParams.get("alipay-app-auth-token");
        String nonce = UUID.randomUUID().toString();
        String timestamp = String.valueOf(System.currentTimeMillis());
        String authString = "app_id=" + this.appId
                + (Strings.isNullOrEmpty(this.appCertSN) ? "" : ",app_cert_sn=" + this.appCertSN)
                + ",nonce=" + nonce
                + ",timestamp=" + timestamp;
        String content = authString + "\n"
                + httpMethod + "\n"
                + httpRequestUri + "\n"
                + (Strings.isNullOrEmpty(httpRequestBody) ? "" : httpRequestBody) + "\n"
                + (Strings.isNullOrEmpty(appAuthToken) ? "" : appAuthToken + "\n");
        if (Strings.isNullOrEmpty(this.privateKey)) {
            headerParams.put("Authorization", ALIPAY_SHA_256_WITH_RSA + " " + authString);
        } else {
            headerParams.put("Authorization", ALIPAY_SHA_256_WITH_RSA + " " + authString
                    + ",sign=" + generateSign(content));
        }
        if (!Strings.isNullOrEmpty(this.rootCertSN)) {
            headerParams.put("alipay-root-cert-sn", this.rootCertSN);
        }
    }

    public String generateSign(String content) throws ApiException {
        try {
            byte[] encodedKey = this.privateKey.getBytes();
            encodedKey = Base64.decode(encodedKey);
            PrivateKey priKey = KeyFactory.getInstance(RSA).generatePrivate(new PKCS8EncodedKeySpec(encodedKey));

            Signature signature = Signature.getInstance(SHA_256_WITH_RSA);
            signature.initSign(priKey);
            signature.update(content.getBytes(this.charset));
            byte[] signed = signature.sign();
            return new String(Base64.encode(signed));
        } catch (Exception e) {
            String errorMessage = "签名遭遇异常，请检查私钥格式是否正确。content=" + content + " privateKeySize=" + this.privateKey.length() + " reason=" + e.getMessage();
            throw new ApiException(errorMessage);
        }
    }

    /**
     * 验证签名
     *
     * @param content      待验签的内容
     * @param sign         签名值的Base64串
     * @param alipayCertSN 支付宝公钥证书序列号
     * @param timestamp    时间戳
     * @param nonce        nonce
     * @return true：验证成功；false：验证失败
     */
    public boolean verify(String content, String sign, String alipayCertSN, String timestamp, String nonce) throws ApiException {
        String alipayPublicKey = this.alipayPublicKey;
        if (!Strings.isNullOrEmpty(this.appCertSN)) {//证书模式
            alipayPublicKey = getAlipayPublicKey(alipayCertSN);
        }
        if (Strings.isNullOrEmpty(alipayPublicKey)) {
            if (Strings.isNullOrEmpty(this.privateKey)) {
                return true;
            }
            throw new ApiException("公钥不可为空");
        }
//        if (Strings.isNullOrEmpty(content)) {
//            throw new ApiException("sign check fail: Body is Empty!");
//        }
        content = timestamp + "\n"
                + nonce + "\n"
                + (content == null ? "" : content) + "\n";
        return generateVerify(content, sign, alipayPublicKey);
    }

    public boolean generateVerify(String content, String sign, String alipayPublicKey) throws ApiException {
        try {
            KeyFactory keyFactory = KeyFactory.getInstance(RSA);
            byte[] encodedKey = alipayPublicKey.getBytes();
            encodedKey = Base64.decode(encodedKey);
            PublicKey publicKey = keyFactory.generatePublic(new X509EncodedKeySpec(encodedKey));

            Signature signature = Signature.getInstance(SHA_256_WITH_RSA);
            signature.initVerify(publicKey);
            signature.update(content.getBytes(this.charset));
            return signature.verify(Base64.decode(sign.getBytes()));
        } catch (Exception e) {
            String errorMessage = "验签遭遇异常，请检查公钥格式或签名是否正确。content=" + content + " sign=" + sign +
                    " publicKey=" + alipayPublicKey + " reason=" + e.getMessage();
            throw new ApiException(errorMessage);
        }
    }

    private String getAlipayPublicKey(String sn) throws ApiException {
        //如果没有指定sn，则默认取缓存中的第一个值
        if (Strings.isNullOrEmpty(sn)) {
            return cachedAlipayPublicKey.values().iterator().next();
        }

        if (cachedAlipayPublicKey.containsKey(sn)) {
            return cachedAlipayPublicKey.get(sn);
        } else {
            //网关在支付宝公钥证书变更前，一定会确认通知到商户并在商户做出反馈后，才会更新该商户的支付宝公钥证书
            //TODO: 后续可以考虑加入自动升级支付宝公钥证书逻辑，注意并发更新冲突问题
            throw new ApiException("支付宝公钥证书[" + sn + "]已过期，请重新下载最新支付宝公钥证书并替换原证书文件");
        }
    }

    /**
     * AES加密
     *
     * @param plainText    明文
     * @param headerParams The header parameters
     * @return 密文
     */
    public String encrypt(String plainText, Map<String, String> headerParams) throws ApiException {
        if (Strings.isNullOrEmpty(this.encryptKey)) {
            return plainText;
        }
        if (!"AES".equals(this.encryptType)) {
            throw new ApiException("当前不支持该算法类型：encryptType=" + this.encryptType);
        }

        headerParams.put("alipay-encrypt-type", this.encryptType);
        //除文件上传接口，加密后Content-Type均为"text/plain"
        String contentType = headerParams.get("Content-Type");
        if (!"multipart/form-data".equals(contentType)) {
            headerParams.put("Content-Type", "text/plain");
        }
        if (Strings.isNullOrEmpty(plainText)) {
            return null;
        }
        try {
            Cipher cipher = Cipher.getInstance(AES_CBC_PCK_ALG);

            IvParameterSpec iv = new IvParameterSpec(AES_IV);
            cipher.init(Cipher.ENCRYPT_MODE,
                    new SecretKeySpec(Base64.decode(this.encryptKey.getBytes()), AES_ALG), iv);

            byte[] encryptBytes = cipher.doFinal(plainText.getBytes(this.charset));
            return new String(Base64.encode(encryptBytes));
        } catch (Exception e) {
            throw new ApiException("AES加密失败，plainText=" + plainText +
                    "，keySize=" + this.encryptKey.length() + "。" + e.getMessage());
        }
    }

    /**
     * 密文
     *
     * @param cipherText 密文
     * @return 明文
     */
    public String decrypt(String cipherText) throws ApiException {
        if (Strings.isNullOrEmpty(this.encryptKey)) {
            return cipherText;
        }
        if (!"AES".equals(this.encryptType)) {
            throw new ApiException("当前不支持该算法类型：encrypeType=" + this.encryptType);
        }
        if (Strings.isNullOrEmpty(cipherText)) {
            return null;
        }
        try {
            Cipher cipher = Cipher.getInstance(AES_CBC_PCK_ALG);
            IvParameterSpec iv = new IvParameterSpec(AES_IV);
            cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(Base64.decode(this.encryptKey.getBytes()), AES_ALG), iv);

            byte[] cleanBytes = cipher.doFinal(Base64.decode(cipherText.getBytes()));
            return new String(cleanBytes, this.charset);
        } catch (Exception e) {
            throw new ApiException("AES解密失败，cipherText=" + cipherText +
                    "，keySize=" + this.encryptKey.length() + "。" + e.getMessage());
        }
    }

    /**
     * 私钥解密
     *
     * @param cipherTextBase64
     * @return
     */
    public String doDecrypt(String cipherTextBase64) throws ApiException {
        try {
            byte[] encodedKey = this.privateKey.getBytes();
            encodedKey = Base64.decode(encodedKey);
            PrivateKey privateKey = KeyFactory.getInstance(RSA).generatePrivate(new PKCS8EncodedKeySpec(encodedKey));

            Cipher cipher = Cipher.getInstance(RSA);
            cipher.init(Cipher.DECRYPT_MODE, privateKey);
            byte[] encryptedData = Base64.decode(cipherTextBase64.getBytes(charset));
            int inputLen = encryptedData.length;
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            int offSet = 0;
            byte[] cache;
            int i = 0;
            // 对数据分段解密
            while (inputLen - offSet > 0) {
                if (inputLen - offSet > MAX_DECRYPT_BLOCK_SIZE) {
                    cache = cipher.doFinal(encryptedData, offSet, MAX_DECRYPT_BLOCK_SIZE);
                } else {
                    cache = cipher.doFinal(encryptedData, offSet, inputLen - offSet);
                }
                out.write(cache, 0, cache.length);
                i++;
                offSet = i * MAX_DECRYPT_BLOCK_SIZE;
            }
            byte[] decryptedData = out.toByteArray();
            out.close();

            return new String(decryptedData, charset);
        } catch (Exception e) {
            String errorMessage = "RSA2非对称解密遭遇异常，请检查私钥格式是否正确。cipherTextBase64=" + cipherTextBase64 + " privateKeySize=" + this.privateKey.length() + " reason=" + e.getMessage();
            throw new ApiException(errorMessage);
        }
    }

    /**
     * 公钥加密
     *
     * @param plainText
     * @return
     */
    public String doEncrypt(String plainText) throws ApiException {
        try {
            KeyFactory keyFactory = KeyFactory.getInstance(RSA);
            byte[] encodedKey = alipayPublicKey.getBytes();
            encodedKey = Base64.decode(encodedKey);
            PublicKey publicKey = keyFactory.generatePublic(new X509EncodedKeySpec(encodedKey));

            Cipher cipher = Cipher.getInstance(RSA);
            cipher.init(Cipher.ENCRYPT_MODE, publicKey);
            byte[] data = plainText.getBytes(charset);
            int inputLen = data.length;
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            int offSet = 0;
            byte[] cache;
            int i = 0;
            // 对数据分段加密
            while (inputLen - offSet > 0) {
                if (inputLen - offSet > MAX_ENCRYPT_BLOCK_SIZE) {
                    cache = cipher.doFinal(data, offSet, MAX_ENCRYPT_BLOCK_SIZE);
                } else {
                    cache = cipher.doFinal(data, offSet, inputLen - offSet);
                }
                out.write(cache, 0, cache.length);
                i++;
                offSet = i * MAX_ENCRYPT_BLOCK_SIZE;
            }
            byte[] encryptedData = Base64.encode(out.toByteArray());
            out.close();

            return new String(encryptedData, charset);
        } catch (Exception e) {
            String errorMessage = "RSA2非对称加密遭遇异常，请检查公钥格式是否正确。plainText=" + plainText +
                    " publicKey=" + alipayPublicKey + " reason=" + e.getMessage();
            throw new ApiException(errorMessage);
        }
    }

    /**
     * 初始向量的方法，全部为0
     * 这里的写法适合于其它算法，AES算法IV值一定是128位的(16字节)
     */
    private static byte[] initIV() {
        try {
            Cipher cipher = Cipher.getInstance(AES_CBC_PCK_ALG);
            int blockSize = cipher.getBlockSize();
            byte[] iv = new byte[blockSize];
            for (int i = 0; i < blockSize; ++i) {
                iv[i] = 0;
            }
            return iv;
        } catch (Exception e) {
            int blockSize = 16;
            byte[] iv = new byte[blockSize];
            for (int i = 0; i < blockSize; ++i) {
                iv[i] = 0;
            }
            return iv;
        }
    }

    /**
     * Getter method for property <tt>appId</tt>.
     *
     * @return property value of appId
     */
    public String getAppId() {
        return appId;
    }

    /**
     * Setter method for property <tt>appId</tt>.
     *
     * @param appId value to be assigned to property appId
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * Getter method for property <tt>charset</tt>.
     *
     * @return property value of charset
     */
    public String getCharset() {
        return charset;
    }

    /**
     * Setter method for property <tt>charset</tt>.
     *
     * @param charset value to be assigned to property charset
     */
    public void setCharset(String charset) {
        this.charset = charset;
    }

    /**
     * Getter method for property <tt>privateKey</tt>.
     *
     * @return property value of privateKey
     */
    public String getPrivateKey() {
        return privateKey;
    }

    /**
     * Setter method for property <tt>privateKey</tt>.
     *
     * @param privateKey value to be assigned to property privateKey
     */
    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    /**
     * Getter method for property <tt>alipayPublicKey</tt>.
     *
     * @return property value of alipayPublicKey
     */
    public String getAlipayPublicKey() {
        return alipayPublicKey;
    }

    /**
     * Setter method for property <tt>alipayPublicKey</tt>.
     *
     * @param alipayPublicKey value to be assigned to property alipayPublicKey
     */
    public void setAlipayPublicKey(String alipayPublicKey) {
        this.alipayPublicKey = alipayPublicKey;
    }

    /**
     * Getter method for property <tt>rootCertContent</tt>.
     *
     * @return property value of rootCertContent
     */
    public String getRootCertContent() {
        return rootCertContent;
    }

    /**
     * Setter method for property <tt>rootCertContent</tt>.
     *
     * @param rootCertContent value to be assigned to property rootCertContent
     */
    public void setRootCertContent(String rootCertContent) {
        this.rootCertContent = rootCertContent;
    }

    /**
     * Getter method for property <tt>rootCertSN</tt>.
     *
     * @return property value of rootCertSN
     */
    public String getRootCertSN() {
        return rootCertSN;
    }

    /**
     * Setter method for property <tt>rootCertSN</tt>.
     *
     * @param rootCertSN value to be assigned to property rootCertSN
     */
    public void setRootCertSN(String rootCertSN) {
        this.rootCertSN = rootCertSN;
    }

    /**
     * Getter method for property <tt>appCertSN</tt>.
     *
     * @return property value of appCertSN
     */
    public String getAppCertSN() {
        return appCertSN;
    }

    /**
     * Setter method for property <tt>appCertSN</tt>.
     *
     * @param appCertSN value to be assigned to property appCertSN
     */
    public void setAppCertSN(String appCertSN) {
        this.appCertSN = appCertSN;
    }

    /**
     * Getter method for property <tt>cachedAlipayPublicKey</tt>.
     *
     * @return property value of cachedAlipayPublicKey
     */
    public ConcurrentHashMap<String, String> getCachedAlipayPublicKey() {
        return cachedAlipayPublicKey;
    }

    /**
     * Setter method for property <tt>cachedAlipayPublicKey</tt>.
     *
     * @param cachedAlipayPublicKey value to be assigned to property cachedAlipayPublicKey
     */
    public void setCachedAlipayPublicKey(ConcurrentHashMap<String, String> cachedAlipayPublicKey) {
        this.cachedAlipayPublicKey = cachedAlipayPublicKey;
    }

    /**
     * Getter method for property <tt>encryptType</tt>.
     *
     * @return property value of encryptType
     */
    public String getEncryptType() {
        return encryptType;
    }

    /**
     * Setter method for property <tt>encryptType</tt>.
     *
     * @param encryptType value to be assigned to property encryptType
     */
    public void setEncryptType(String encryptType) {
        this.encryptType = encryptType;
    }

    /**
     * Getter method for property <tt>encryptKey</tt>.
     *
     * @return property value of encryptKey
     */
    public String getEncryptKey() {
        return encryptKey;
    }

    /**
     * Setter method for property <tt>encryptKey</tt>.
     *
     * @param encryptKey value to be assigned to property encryptKey
     */
    public void setEncryptKey(String encryptKey) {
        this.encryptKey = encryptKey;
    }

}
