/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.alipay.api.internal.util.encrypt;

import com.alipay.api.AlipayApiException;

/**
 * @author zts
 * @version : Encrypt.java, v 0.1 2021年06月23日 3:53 PM zts Exp $
 */
public interface Encrypt {


    String encrypt(String content, String aesKey, String charset) throws AlipayApiException;

    String decrypt(String content, String key, String charset) throws AlipayApiException;

}