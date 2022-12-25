/**
 * Alipay.com Inc. Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.alipay.api;

/**
 * 加密器接口
 *
 * @author liuqun.lq
 * @version $Id: Encryptor.java, v 0.1 2018年07月03日 11:41 liuqun.lq Exp $
 */
public interface Encryptor {

    /**
     * 对内容加密
     *
     * @param sourceContent 待加签内容
     * @param encryptType   加密算法类型，如AES
     * @param charset       字符集
     * @return 加密后内容
     */
    String encrypt(String sourceContent, String encryptType, String charset);
}