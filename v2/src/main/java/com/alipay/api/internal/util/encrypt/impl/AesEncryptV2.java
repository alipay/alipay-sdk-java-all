/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.alipay.api.internal.util.encrypt.impl;

import com.alipay.api.AlipayApiErrorEnum;
import com.alipay.api.AlipayApiException;
import com.alipay.api.internal.util.codec.Base64;
import com.alipay.api.internal.util.encrypt.Encrypt;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;

/**
 * @author zts
 * @version : AesEncryptV2.java, v 0.1 2021年06月23日 3:54 PM zts Exp $
 */
public class AesEncryptV2 implements Encrypt {

    private static final String SLASH = "/";
    private static final String alg = "AES";
    private static final String mode = "CBC";
    private static final String padding = "PKCS5Padding";
    private static final int ivSize = 16;

    private final String fullCipherName;

    /**
     * constructor
     */
    public AesEncryptV2() {
        this.fullCipherName = alg + SLASH + mode + SLASH + padding;
    }

    @Override
    public String encrypt(String content, String aesKey, String charset) throws AlipayApiException {
        try {
            Cipher cipher = Cipher.getInstance(fullCipherName);

            //init iv
            byte[] iv = new byte[ivSize];
            SecureRandom random = new SecureRandom();
            random.nextBytes(iv);
            IvParameterSpec ivParams = new IvParameterSpec(iv);

            cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(Base64.decodeBase64(aesKey.getBytes()), alg), ivParams);

            byte[] encryptedText = cipher.doFinal(content.getBytes(charset));
            byte[] ivAndEncryptedText = new byte[ivSize + encryptedText.length];

            System.arraycopy(iv, 0, ivAndEncryptedText, 0, ivSize);
            System.arraycopy(encryptedText, 0, ivAndEncryptedText, ivSize, encryptedText.length);
            return new String(Base64.encodeBase64(ivAndEncryptedText));
        } catch (Exception e) {
            throw new AlipayApiException(String.format(AlipayApiErrorEnum.ENCRYPT_ASE_V2_ERROR.getErrMsg(),
                    content, charset), e);
        }
    }

    @Override
    public String decrypt(String content, String key, String charset) throws AlipayApiException {
        try {
            byte[] ivAndEncryptedText = Base64.decodeBase64(content.getBytes());

            Cipher cipher = Cipher.getInstance(fullCipherName);

            IvParameterSpec ivParameterSpec = new IvParameterSpec(ivAndEncryptedText, 0, ivSize);

            cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(Base64.decodeBase64(key.getBytes()), alg), ivParameterSpec);

            byte[] contentBytes = cipher.doFinal(ivAndEncryptedText, ivSize, ivAndEncryptedText.length - ivSize);
            return new String(contentBytes, charset);
        } catch (Exception e) {
            throw new AlipayApiException(String.format(AlipayApiErrorEnum.DECRYPT_ASE_V2_ERROR.getErrMsg(),
                    content, charset), e);
        }

    }
}