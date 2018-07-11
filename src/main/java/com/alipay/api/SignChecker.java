/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.alipay.api;

/**
 * 验签器接口
 *
 * @author liuqun.lq
 * @version $Id: SignChecker.java, v 0.1 2018年07月03日 11:38 liuqun.lq Exp $
 */
public interface SignChecker {

    /**
     * 对签名进行验签
     *
     * @param sourceContent 加签内容
     * @param signature 签名值
     * @param signType 签名类型，如RSA、RSA2
     * @param charset 字符集
     * @return true 验签通过，false 验签不通过
     */
    boolean check(String sourceContent, String signature, String signType, String charset);
}