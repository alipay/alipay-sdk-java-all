/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.api.internal.util.asymmetric;

import com.alipay.api.AlipayApiErrorEnum;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayConstants;
import com.alipay.api.internal.util.StringUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 非对称加密算法管理类
 */
public class AsymmetricManager {

    private static final Map<String, IAsymmetricEncryptor> asymmetricManager = new ConcurrentHashMap<String, IAsymmetricEncryptor>();

    static {
        asymmetricManager.put(AlipayConstants.SIGN_TYPE_RSA, new RSAEncryptor());
        asymmetricManager.put(AlipayConstants.SIGN_TYPE_RSA2, new RSA2Encryptor());
//        asymmetricManager.put(AlipayConstants.SIGN_TYPE_SM2, new SM2Encryptor());
    }

    /**
     * Gets by name.
     *
     * @param type the type
     *
     * @return the by name
     *
     * @throws AlipayApiException the alipay api exception
     */
    public static IAsymmetricEncryptor getByName(String type) throws AlipayApiException{
        IAsymmetricEncryptor asymmetricEncryptor = null;

        if (!StringUtils.isEmpty(type)) {
            asymmetricEncryptor = asymmetricManager.get(type);
        }

        if (asymmetricEncryptor != null) {
            return asymmetricEncryptor;
        } else if (AlipayConstants.SIGN_TYPE_SM2.equals(type)) {
            // SM2Encryptor类需要使用时再加载，避免未引入BouncyCastleProvider导致AsymmetricManager类加载失败
            return new SM2Encryptor();
        }

        throw new AlipayApiException(String.format(AlipayApiErrorEnum.SIGN_TYPE_ERROR.getErrMsg(), type));
    }

    public static Map<String, IAsymmetricEncryptor> getAsymmetricManager() {
        return asymmetricManager;
    }

    public static void putAsymmetricManager(String signType, IAsymmetricEncryptor asymmetricEncryptor) {
        asymmetricManager.put(signType, asymmetricEncryptor);
    }
}