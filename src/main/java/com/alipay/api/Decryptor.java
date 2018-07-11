/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.alipay.api;

/**
 * 解密器接口
 *
 * @author liuqun.lq
 * @version $Id: Decryptor.java, v 0.1 2018年07月03日 11:44 liuqun.lq Exp $
 */
public interface Decryptor {

    /**
     * 对内容解密
     *
     * @param encryptContent 加密内容
     * @param encryptType 加密算法类型，如AES
     * @param charset 字符集
     * @return 解密后内容
     */
    String decrypt(String encryptContent, String encryptType, String charset);
}