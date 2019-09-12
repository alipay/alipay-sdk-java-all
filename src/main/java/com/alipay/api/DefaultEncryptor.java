/**
 * Alipay.com Inc. Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.alipay.api;

import com.alipay.api.internal.util.AlipayEncrypt;

/**
 * @author liuqun.lq
 * @version $Id: DefaultEncryptor.java, v 0.1 2018年07月03日 12:24 liuqun.lq Exp $
 */
public class DefaultEncryptor implements Encryptor {

    private String encryptKey;

    public DefaultEncryptor(String encryptKey) {
        this.encryptKey = encryptKey;
    }

    public String encrypt(String sourceContent, String encryptType, String charset) {
        String encryptContent = null;
        try {
            encryptContent = AlipayEncrypt.encryptContent(sourceContent, encryptType,
                    this.encryptKey, charset);
        } catch (AlipayApiException e) {
            throw new RuntimeException(e);
        }
        return encryptContent;
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