/**
 * Alipay.com Inc. Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.alipay.api.internal.util;

import com.alipay.api.AlipayApiErrorEnum;
import com.alipay.api.AlipayApiException;
import com.alipay.api.internal.util.encrypt.Encrypt;
import com.alipay.api.internal.util.encrypt.impl.AesEncrypt;
import com.alipay.api.internal.util.encrypt.impl.AesEncryptV2;

import java.util.HashMap;
import java.util.Map;

/**
 * 加密工具
 *
 * @author jiehua
 * @version $Id: AlipayEncrypt.java, v 0.1 2016-3-28 下午5:14:12 jiehua Exp $
 */
public class AlipayEncrypt {

    private static Map<String, Encrypt> encryptManager = new HashMap<String, Encrypt>();

    static {
        encryptManager.put("AES", new AesEncrypt());
        encryptManager.put("AES_V2", new AesEncryptV2());
    }


    /**
     * 加密
     *
     * @param content
     * @param encryptType
     * @param encryptKey
     * @param charset
     * @return
     * @throws AlipayApiException
     */
    public static String encryptContent(String content, String encryptType, String encryptKey,
                                        String charset) throws AlipayApiException {

        Encrypt encrypt = encryptManager.get(encryptType);
        if (encrypt == null) {
            throw new AlipayApiException(AlipayApiErrorEnum.ENCRYPT_TYPE_ERROR.getErrMsg() + encryptType);
        }

        return encrypt.encrypt(content, encryptKey, charset);
    }

    /**
     * 解密
     *
     * @param content
     * @param encryptType
     * @param encryptKey
     * @param charset
     * @return
     * @throws AlipayApiException
     */
    public static String decryptContent(String content, String encryptType, String encryptKey,
                                        String charset) throws AlipayApiException {
        Encrypt encrypt = encryptManager.get(encryptType);
        if (encrypt == null) {
            throw new AlipayApiException(AlipayApiErrorEnum.ENCRYPT_TYPE_ERROR.getErrMsg() + encryptType);
        }

        return encrypt.decrypt(content, encryptKey, charset);
    }


    /**
     * Getter method for property <tt>encryptManager</tt>.
     *
     * @return property value of encryptManager
     */
    public static Map<String, Encrypt> getEncryptManager() {
        return encryptManager;
    }
}
