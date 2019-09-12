/**
 * Alipay.com Inc. Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.alipay.api;

import com.alipay.api.internal.util.AlipaySignature;

/**
 * @author liuqun.lq
 * @version $Id: DefaultSignChecker.java, v 0.1 2018年07月03日 12:06 liuqun.lq Exp $
 */
public class DefaultSignChecker implements SignChecker {

    private String alipayPublicKey;

    public DefaultSignChecker(String alipayPublicKey) {
        this.alipayPublicKey = alipayPublicKey;
    }

    public boolean check(String sourceContent, String signature, String signType, String charset) {
        boolean success = false;
        try {
            success = AlipaySignature.rsaCheck(sourceContent, signature, alipayPublicKey, charset, signType);
        } catch (AlipayApiException e) {
            throw new RuntimeException(e);
        }
        return success;
    }

    public boolean checkCert(String sourceContent, String signature, String signType, String charset, String publicKey) {
        boolean success = false;
        try {
            success = AlipaySignature.rsaCheck(sourceContent, signature, publicKey, charset, signType);
        } catch (AlipayApiException e) {
            throw new RuntimeException(e);
        }
        return success;
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
}