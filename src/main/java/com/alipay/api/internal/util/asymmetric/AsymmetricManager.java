/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.api.internal.util.asymmetric;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayConstants;

/**
 * 非对称加密算法管理类
 */
public class AsymmetricManager {

    public static IAsymmetricEncryptor getByName(String type) throws AlipayApiException{
        if (AlipayConstants.SIGN_TYPE_RSA.equals(type)) {
            return new RSAEncryptor();
        }
        if (AlipayConstants.SIGN_TYPE_RSA2.equals(type)) {
            return new RSA2Encryptor();
        }
        if (AlipayConstants.SIGN_TYPE_SM2.equals(type)) {
            return new SM2Encryptor();
        }
        throw new AlipayApiException("无效的非对称加密类型:[\" + type + \"]，可选值为：RSA、RSA2和SM2。");
    }

}