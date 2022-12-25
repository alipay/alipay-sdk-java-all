/**
 * Alipay.com Inc. Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.alipay.api;

/**
 * @author liuqun.lq
 * @version $Id: SignChecker.java, v 0.1 2018��07��03�� 11:38 liuqun.lq Exp $
 */
public interface SignChecker {
    boolean check(String sourceContent, String signature, String signType, String charset);

    boolean checkCert(String sourceContent, String signature, String signType, String charset, String publicKey);
}