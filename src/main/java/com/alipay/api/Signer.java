/**
 * Alipay.com Inc. Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.alipay.api;

/**
 * @author liuqun.lq
 * @version $Id: Signer.java, v 0.1 2018��07��03�� 11:36 liuqun.lq Exp $
 */
public interface Signer {

    String sign(String sourceContent, String signType, String charset);
}