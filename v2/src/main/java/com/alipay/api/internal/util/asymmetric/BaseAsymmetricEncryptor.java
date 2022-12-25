/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.api.internal.util.asymmetric;

import com.alipay.api.AlipayApiErrorEnum;
import com.alipay.api.AlipayApiException;
import com.alipay.api.internal.util.StringUtils;

import java.io.UnsupportedEncodingException;

/**
 * 非对称加密算法
 */
public abstract class BaseAsymmetricEncryptor implements IAsymmetricEncryptor {

    //默认字符集编码。现在推荐使用UTF-8，之前默认是GBK
    private static String DEFAULT_CHARSET = "UTF-8";

    public String decrypt(String cipherTextBase64, String charset, String privateKey) throws AlipayApiException {
        try {
            if (StringUtils.isEmpty(cipherTextBase64)) {
                throw new AlipayApiException(AlipayApiErrorEnum.ENCRYPT_TEXT_EMPTY_ERROR);
            }
            if (StringUtils.isEmpty(privateKey)) {
                throw new AlipayApiException(AlipayApiErrorEnum.SIGN_PRIVATE_KEY_EMPTY_ERROR);
            }
            if (StringUtils.isEmpty(charset)) {
                charset = DEFAULT_CHARSET;
            }
            return doDecrypt(cipherTextBase64, charset, privateKey);

        } catch (Exception e) {

            String errorMessage = String.format(AlipayApiErrorEnum.DECRYPT_ERROR.getErrMsg(),
                    getAsymmetricType(), e.getMessage(), cipherTextBase64, charset, privateKey == null ? 0 : privateKey.length());
            throw new AlipayApiException(errorMessage, e);
        }

    }

    public String encrypt(String plainText, String charset, String publicKey) throws AlipayApiException {
        try {
            if (StringUtils.isEmpty(plainText)) {
                throw new AlipayApiException(AlipayApiErrorEnum.ENCRYPT_TEXT_EMPTY_ERROR);
            }
            if (StringUtils.isEmpty(publicKey)) {
                throw new AlipayApiException(AlipayApiErrorEnum.SIGN_PUBLIC_KEY_EMPTY_ERROR);
            }
            if (StringUtils.isEmpty(charset)) {
                charset = DEFAULT_CHARSET;
            }
            return doEncrypt(plainText, charset, publicKey);
        } catch (Exception e) {

            String errorMessage = String.format(AlipayApiErrorEnum.ENCRYPT_ERROR.getErrMsg(),
                    getAsymmetricType(), e.getMessage(), plainText, charset, publicKey);
            throw new AlipayApiException(errorMessage, e);
        }

    }

    public String sign(String content, String charset, String privateKey) throws AlipayApiException {
        try {
            if (StringUtils.isEmpty(content)) {
                throw new AlipayApiException(AlipayApiErrorEnum.SIGN_TEXT_EMPTY_ERROR);
            }
            if (StringUtils.isEmpty(privateKey)) {
                throw new AlipayApiException(AlipayApiErrorEnum.SIGN_PRIVATE_KEY_EMPTY_ERROR);
            }
            if (StringUtils.isEmpty(charset)) {
                charset = DEFAULT_CHARSET;
            }
            return doSign(content, charset, privateKey);
        } catch (UnsupportedEncodingException e) {

            String errorMessage = String.format(AlipayApiErrorEnum.SIGN_CHARSET_ERROR.getErrMsg(),
                    getAsymmetricType(), charset);

            throw new AlipayApiException(errorMessage, e);
        } catch (Exception e) {

            String errorMessage = String.format(AlipayApiErrorEnum.SIGN_ERROR.getErrMsg(),
                    getAsymmetricType(), e.getMessage(), content, charset, privateKey == null ? 0 : privateKey.length());
            throw new AlipayApiException(errorMessage, e);
        }

    }

    public boolean verify(String content, String charset, String publicKey, String sign) throws AlipayApiException {
        try {
            if (StringUtils.isEmpty(content)) {
                throw new AlipayApiException(AlipayApiErrorEnum.VERIFY_TEXT_EMPTY_ERROR);
            }
            if (StringUtils.isEmpty(publicKey)) {
                throw new AlipayApiException(AlipayApiErrorEnum.SIGN_PUBLIC_KEY_EMPTY_ERROR);
            }
            if (StringUtils.isEmpty(sign)) {
                throw new AlipayApiException(AlipayApiErrorEnum.SIGN_EMPTY_ERROR);
            }
            if (StringUtils.isEmpty(charset)) {
                charset = DEFAULT_CHARSET;
            }
            return doVerify(content, charset, publicKey, sign);
        } catch (Exception e) {

            String errorMessage = String.format(AlipayApiErrorEnum.VERIFY_ERROR.getErrMsg(),
                    getAsymmetricType(), e.getMessage(), content, charset, publicKey, sign);
            throw new AlipayApiException(errorMessage, e);
        }
    }

    protected abstract String doDecrypt(String cipherTextBase64, String charset, String privateKey) throws Exception;

    protected abstract String doEncrypt(String plainText, String charset, String publicKey) throws Exception;

    protected abstract String doSign(String content, String charset, String privateKey) throws Exception;

    protected abstract boolean doVerify(String content, String charset, String publicKey, String sign) throws Exception;

    protected abstract String getAsymmetricType();

}