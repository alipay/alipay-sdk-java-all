/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.alipay.api;

/**
 * 加签器接口
 *
 * @author liuqun.lq
 * @version $Id: Signer.java, v 0.1 2018年07月03日 11:36 liuqun.lq Exp $
 */
public interface Signer {

    /**
     * 对内容加签
     *
     * @param sourceContent 待加签内容
     * @param signType 签名类型，如RSA、RSA2
     * @param charset 字符集
     * @return 签名值
     */
    String sign(String sourceContent, String signType, String charset);
}