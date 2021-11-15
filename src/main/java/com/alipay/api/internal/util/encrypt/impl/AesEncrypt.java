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
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/**
 * @author zts
 * @version : AesEncrypt.java, v 0.1 2021年06月23日 3:53 PM zts Exp $
 */
public class AesEncrypt implements Encrypt {

    /**
     * AES算法
     */

    private static final String AES_ALG = "AES";

    private static final String AES_CBC_PCK_ALG = "AES/CBC/PKCS5Padding";

    private static final byte[] AES_IV = initIv(AES_CBC_PCK_ALG);


    @Override
    public String encrypt(String content, String aesKey, String charset) throws AlipayApiException {
        try {
            Cipher cipher = Cipher.getInstance(AES_CBC_PCK_ALG);

            IvParameterSpec iv = new IvParameterSpec(AES_IV);
            cipher.init(Cipher.ENCRYPT_MODE,
                    new SecretKeySpec(Base64.decodeBase64(aesKey.getBytes()), AES_ALG), iv);

            byte[] encryptBytes = cipher.doFinal(content.getBytes(charset));
            return new String(Base64.encodeBase64(encryptBytes));
        } catch (UnsupportedEncodingException e) {
            throw new AlipayApiException(String.format(AlipayApiErrorEnum.ENCRYPT_ASE_CHARSET_ERROR.getErrMsg(), charset), e);
        } catch (Exception e) {
            throw new AlipayApiException(String.format(AlipayApiErrorEnum.ENCRYPT_ASE_ERROR.getErrMsg(),
                    content, charset), e);
        }
    }

    @Override
    public String decrypt(String content, String key, String charset) throws AlipayApiException {
        try {
            Cipher cipher = Cipher.getInstance(AES_CBC_PCK_ALG);
            IvParameterSpec iv = new IvParameterSpec(initIv(AES_CBC_PCK_ALG));
            cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(Base64.decodeBase64(key.getBytes()),
                    AES_ALG), iv);

            byte[] cleanBytes = cipher.doFinal(Base64.decodeBase64(content.getBytes()));
            return new String(cleanBytes, charset);
        } catch (Exception e) {
            throw new AlipayApiException(String.format(AlipayApiErrorEnum.DECRYPT_ASE_ERROR.getErrMsg(),
                    content, charset), e);
        }
    }


    /**
     * 初始向量的方法, 全部为0. 这里的写法适合于其它算法,针对AES算法的话,IV值一定是128位的(16字节).
     *
     * @param fullAlg
     * @return
     * @throws GeneralSecurityException
     */
    private static byte[] initIv(String fullAlg) {

        try {
            Cipher cipher = Cipher.getInstance(fullAlg);
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


}