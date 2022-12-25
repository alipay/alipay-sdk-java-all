/**
 * Alipay.com Inc. Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.alipay.v3.util;

import com.alipay.v3.ApiException;
import com.google.common.base.Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class AlipaySignature {
    /**
     * 通用签名方法
     *
     * @param content    待签名内容
     * @param privateKey 私钥
     * @param charset    编码格式
     * @param signType   签名类型：RSA2
     * @return
     * @throws ApiException
     */
    public static String sign(String content, String privateKey, String charset,
                              String signType) throws ApiException {
        if (!Strings.isNullOrEmpty(charset) && !"utf-8".equalsIgnoreCase(charset)) {
            throw new ApiException("charset只支持utf-8");
        }
        if (!Strings.isNullOrEmpty(signType) && !"RSA2".equalsIgnoreCase(signType)) {
            throw new ApiException("signType只支持RSA2");
        }

        AlipayConfigUtil alipayConfigUtil = new AlipayConfigUtil();
        alipayConfigUtil.setPrivateKey(privateKey);
        return alipayConfigUtil.generateSign(content);
    }

    /**
     * 通用签名方法
     *
     * @param params     待签名内容
     * @param privateKey 私钥
     * @param charset    编码格式
     * @param signType   签名类型：RSA2
     * @return
     * @throws ApiException
     */
    public static String sign(Map<String, String> params, String privateKey, String charset,
                              String signType) throws ApiException {
        String signContent = getSignContent(params);
        return sign(signContent, privateKey, charset, signType);
    }

    /**
     * 密钥模式RSA2通用验签方法，主要用于支付接口的返回参数的验签比如：当面付，APP支付，手机网站支付，电脑网站支付
     *
     * @param params    待验签的从支付宝接收到的参数Map
     * @param publicKey 支付宝公钥
     * @param charset   参数内容编码集
     * @param signType  指定采用的签名方式，RSA2
     * @return true：验签通过；false：验签不通过
     * @throws ApiException
     */
    public static boolean verifyV1(Map<String, String> params, String publicKey,
                                   String charset, String signType) throws ApiException {
        String sign = params.get("sign");
        String content = getSignCheckContentV1(params);

        return verify(content, sign, publicKey, charset, signType);
    }

    /**
     * 证书模式RSA2通用验签方法，主要用于支付接口的返回参数的验签比如：当面付，APP支付，手机网站支付，电脑网站支付
     *
     * @param params               待验签的从支付宝接收到的参数Map
     * @param alipayPublicCertPath 支付宝公钥路径
     * @param charset              参数内容编码集
     * @param signType             指定采用的签名方式，RSA2
     * @return true：验签通过；false：验签不通过
     * @throws ApiException
     */
    public static boolean certVerifyV1(Map<String, String> params, String alipayPublicCertPath,
                                       String charset, String signType) throws ApiException {
        String publicKey = getAlipayPublicKey(alipayPublicCertPath);
        return verifyV1(params, publicKey, charset, signType);
    }

    /**
     * 密钥模式RSA2通用验签方法，主要是用于生活号相关的事件消息和口碑服务市场订购信息等发送到应用网关地址的异步信息的验签
     *
     * @param params    待验签的从支付宝接收到的参数Map
     * @param publicKey 支付宝公钥
     * @param charset   参数内容编码集
     * @param signType  指定采用的签名方式，RSA2
     * @return true：验签通过；false：验签不通过
     * @throws ApiException
     */
    public static boolean verifyV2(Map<String, String> params, String publicKey,
                                   String charset, String signType) throws ApiException {
        String sign = params.get("sign");
        String content = getSignCheckContentV2(params);

        return verify(content, sign, publicKey, charset, signType);
    }

    /**
     * 证书模式RSA2通用验签方法，主要是用于生活号相关的事件消息和口碑服务市场订购信息等发送到应用网关地址的异步信息的验签
     *
     * @param params               待验签的从支付宝接收到的参数Map
     * @param alipayPublicCertPath 支付宝公钥路径
     * @param charset              参数内容编码集
     * @param signType             指定采用的签名方式，RSA2
     * @return true：验签通过；false：验签不通过
     * @throws ApiException
     */
    public static boolean certVerifyV2(Map<String, String> params, String alipayPublicCertPath,
                                       String charset, String signType) throws ApiException {
        String publicKey = getAlipayPublicKey(alipayPublicCertPath);

        return verifyV2(params, publicKey, charset, signType);
    }

    /**
     * 密钥模式RSA2通用验签方法
     *
     * @param content   待验签字符串
     * @param sign      签名
     * @param publicKey 支付宝公钥
     * @param charset   参数内容编码集
     * @param signType  指定采用的签名方式，RSA2
     * @return
     * @throws ApiException
     */
    public static boolean verify(String content, String sign, String publicKey, String charset,
                                 String signType) throws ApiException {
        if (!Strings.isNullOrEmpty(charset) && !"utf-8".equalsIgnoreCase(charset)) {
            throw new ApiException("charset只支持utf-8");
        }
        if (!Strings.isNullOrEmpty(signType) && !"RSA2".equalsIgnoreCase(signType)) {
            throw new ApiException("signType只支持RSA2");
        }

        AlipayConfigUtil alipayConfigUtil = new AlipayConfigUtil();
        return alipayConfigUtil.generateVerify(content, sign, publicKey);
    }

    /**
     * 证书模式RSA2通用验签方法
     *
     * @param content              待验签字符串
     * @param sign                 签名
     * @param alipayPublicCertPath 支付宝公钥路径
     * @param charset              参数内容编码集
     * @param signType             指定采用的签名方式，RSA2
     * @return
     * @throws ApiException
     */
    public static boolean certVerify(String content, String sign, String alipayPublicCertPath, String charset,
                                     String signType) throws ApiException {
        String publicKey = getAlipayPublicKey(alipayPublicCertPath);
        return verify(content, sign, publicKey, charset, signType);
    }

    /**
     * 公钥加密
     *
     * @param content   待加密内容
     * @param publicKey 公钥
     * @param charset   字符集，如UTF-8
     * @param signType  指定采用的签名方式，RSA2
     * @return 密文内容
     * @throws ApiException
     */
    public static String encrypt(String content, String publicKey,
                                 String charset, String signType) throws ApiException {
        if (!Strings.isNullOrEmpty(charset) && !"utf-8".equalsIgnoreCase(charset)) {
            throw new ApiException("charset只支持utf-8");
        }
        if (!Strings.isNullOrEmpty(signType) && !"RSA2".equalsIgnoreCase(signType)) {
            throw new ApiException("signType只支持RSA2");
        }

        AlipayConfigUtil alipayConfigUtil = new AlipayConfigUtil();
        alipayConfigUtil.setAlipayPublicKey(publicKey);
        return alipayConfigUtil.doEncrypt(content);
    }

    /**
     * 私钥解密
     *
     * @param content    待解密内容
     * @param privateKey 私钥
     * @param charset    字符集，如UTF-8
     * @param signType   指定采用的签名方式，RSA2
     * @return 明文内容
     * @throws ApiException
     */
    public static String decrypt(String content, String privateKey,
                                 String charset, String signType) throws ApiException {
        if (!Strings.isNullOrEmpty(charset) && !"utf-8".equalsIgnoreCase(charset)) {
            throw new ApiException("charset只支持utf-8");
        }
        if (!Strings.isNullOrEmpty(signType) && !"RSA2".equalsIgnoreCase(signType)) {
            throw new ApiException("signType只支持RSA2");
        }

        AlipayConfigUtil alipayConfigUtil = new AlipayConfigUtil();
        alipayConfigUtil.setPrivateKey(privateKey);
        return alipayConfigUtil.doDecrypt(content);
    }

    /**
     * 加密并签名<br> <b>目前适用于公众号</b>
     *
     * @param bizContent      待加密、签名内容
     * @param alipayPublicKey 支付宝公钥
     * @param cusPrivateKey   商户私钥
     * @param charset         字符集，如UTF-8
     * @param isEncrypt       是否加密，true-加密  false-不加密
     * @param isSign          是否签名，true-签名  false-不签名
     * @param signType        指定采用的签名方式，RSA2
     * @return 加密、签名后xml内容字符串 <p> 返回示例： <alipay> <response>密文</response> <encryption_type>RSA</encryption_type> <sign>sign</sign>
     * <sign_type>RSA</sign_type> </alipay> </p>
     * @throws ApiException
     */
    public static String encryptAndSign(String bizContent, String alipayPublicKey,
                                        String cusPrivateKey, String charset, boolean isEncrypt,
                                        boolean isSign, String signType) throws ApiException {
        StringBuilder sb = new StringBuilder();
        if (Strings.isNullOrEmpty(charset)) {
            charset = "utf-8";
        }
        sb.append("<?xml version=\"1.0\" encoding=\"" + charset + "\"?>");
        if (isEncrypt) {// 加密
            sb.append("<alipay>");
            String encrypted = encrypt(bizContent, alipayPublicKey, charset, signType);
            sb.append("<response>" + encrypted + "</response>");
            sb.append("<encryption_type>RSA</encryption_type>");
            if (isSign) {
                String sign = sign(encrypted, cusPrivateKey, charset, signType);
                sb.append("<sign>" + sign + "</sign>");
                sb.append("<sign_type>RSA</sign_type>");
            }
            sb.append("</alipay>");
        } else if (isSign) {// 不加密，但需要签名
            sb.append("<alipay>");
            sb.append("<response>" + bizContent + "</response>");
            String sign = sign(bizContent, cusPrivateKey, charset, signType);
            sb.append("<sign>" + sign + "</sign>");
            sb.append("<sign_type>RSA</sign_type>");
            sb.append("</alipay>");
        } else {// 不加密，不加签
            sb.append(bizContent);
        }
        return sb.toString();
    }

    /**
     * 验签并解密 <p> <b>目前适用于公众号</b><br> params参数示例： <br>{
     * <br>biz_content=M0qGiGz+8kIpxe8aF4geWJdBn0aBTuJRQItLHo9R7o5JGhpic/MIUjvXo2BLB++BbkSq2OsJCEQFDZ0zK5AJYwvBgeRX30gvEj6eXqXRt16
     * /IkB9HzAccEqKmRHrZJ7PjQWE0KfvDAHsJqFIeMvEYk1Zei2QkwSQPlso7K0oheo/iT+HYE8aTATnkqD
     * /ByD9iNDtGg38pCa2xnnns63abKsKoV8h0DfHWgPH62urGY7Pye3r9FCOXA2Ykm8X4/Bl1bWFN/PFCEJHWe/HXj8KJKjWMO6ttsoV0xRGfeyUO8agu6t587Dl5ux5zD
     * /s8Lbg5QXygaOwo3Fz1G8EqmGhi4+soEIQb8DBYanQOS3X+m46tVqBGMw8Oe+hsyIMpsjwF4HaPKMr37zpW3fe7xOMuimbZ0wq53YP
     * /jhQv6XWodjT3mL0H5ACqcsSn727B5ztquzCPiwrqyjUHjJQQefFTzOse8snaWNQTUsQS7aLsHq0FveGpSBYORyA90qPdiTjXIkVP7mAiYiAIWW9pCEC7F3XtViKTZ8FRMM9ySicfuAlf3jtap6v2KPMtQv70X+hlmzO/IXB6W0Ep8DovkF5rB4r/BJYJLw/6AS0LZM9w5JfnAZhfGM2rKzpfNsgpOgEZS1WleG4I2hoQC0nxg9IcP0Hs+nWIPkEUcYNaiXqeBc=,
     * <br>sign=rlqgA8O+RzHBVYLyHmrbODVSANWPXf3pSrr82OCO/bm3upZiXSYrX5fZr6UBmG6BZRAydEyTIguEW6VRuAKjnaO/sOiR9BsSrOdXbD5Rhos/Xt7
     * /mGUWbTOt/F+3W0/XLuDNmuYg1yIC/6hzkg44kgtdSTsQbOC9gWM7ayB4J4c=, sign_type=RSA, <br>charset=UTF-8 <br>} </p>
     *
     * @param params
     * @param alipayPublicKey 支付宝公钥
     * @param cusPrivateKey   商户私钥
     * @param isCheckSign     是否验签
     * @param isDecrypt       是否解密
     * @param signType        指定采用的签名方式，RSA2
     * @return 解密后明文，验签失败则异常抛出
     * @throws ApiException
     */
    public static String checkSignAndDecrypt(Map<String, String> params, String alipayPublicKey,
                                             String cusPrivateKey, boolean isCheckSign,
                                             boolean isDecrypt, String signType) throws ApiException {
        String charset = params.get("charset");
        String bizContent = params.get("biz_content");
        if (isCheckSign) {
            if (!verifyV2(params, alipayPublicKey, charset, signType)) {
                throw new ApiException("rsaCheck failure:rsaParams=" + params);
            }
        }

        if (isDecrypt) {
            return decrypt(bizContent, cusPrivateKey, charset, signType);
        }

        return bizContent;
    }

    /**
     * @param sortedParams
     * @return
     */
    public static String getSignContent(Map<String, String> sortedParams) {
        StringBuilder content = new StringBuilder();
        List<String> keys = new ArrayList<String>(sortedParams.keySet());
        Collections.sort(keys);
        int index = 0;
        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            String value = sortedParams.get(key);
            if (Strings.isNullOrEmpty(key) || Strings.isNullOrEmpty(value)){
                continue;
            }
            content.append(index == 0 ? "" : "&").append(key).append("=").append(value);
            index++;
        }
        return content.toString();
    }

    /**
     * rsa内容签名
     *
     * @param content
     * @param privateKey
     * @param charset
     * @return
     * @throws ApiException
     */
    @Deprecated
    public static String rsaSign(String content, String privateKey, String charset,
                                 String signType) throws ApiException {

        return sign(content, privateKey, charset, signType);
    }

    /**
     * sha256WithRsa 加签
     *
     * @param content
     * @param privateKey
     * @param charset
     * @return
     * @throws ApiException
     */
    @Deprecated
    public static String rsa256Sign(String content, String privateKey,
                                    String charset) throws ApiException {

        return sign(content, privateKey, charset, "RSA2");
    }

    /**
     * sha1WithRsa 加签
     *
     * @param content
     * @param privateKey
     * @param charset
     * @return
     * @throws ApiException
     */
    @Deprecated
    public static String rsaSign(String content, String privateKey,
                                 String charset) throws ApiException {

        return sign(content, privateKey, charset, "RSA");
    }

    @Deprecated
    public static String rsaSign(Map<String, String> params, String privateKey,
                                 String charset) throws ApiException {
        String signContent = getSignContent(params);

        return rsaSign(signContent, privateKey, charset);

    }

    public static String getSignCheckContentV1(Map<String, String> params) {
        if (params == null) {
            return null;
        }

        params.remove("sign");
        params.remove("sign_type");

        StringBuilder content = new StringBuilder();
        List<String> keys = new ArrayList<String>(params.keySet());
        Collections.sort(keys);

        int index = 0;
        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            String value = params.get(key);
            if (Strings.isNullOrEmpty(key) || Strings.isNullOrEmpty(value)){
                continue;
            }
            content.append((index == 0 ? "" : "&") + key + "=" + value);
            index++;
        }

        return content.toString();
    }

    public static String getSignCheckContentV2(Map<String, String> params) {
        if (params == null) {
            return null;
        }

        params.remove("sign");

        StringBuilder content = new StringBuilder();
        List<String> keys = new ArrayList<String>(params.keySet());
        Collections.sort(keys);

        int index = 0;
        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            String value = params.get(key);
            if (Strings.isNullOrEmpty(key) || Strings.isNullOrEmpty(value)){
                continue;
            }
            content.append(index == 0 ? "" : "&").append(key).append("=").append(value);
            index++;
        }

        return content.toString();
    }

    /**
     * 如果是RSA签名，请调用此方法进行验签
     *
     * @param params    待验签的从支付宝接收到的参数Map
     * @param publicKey 支付宝公钥
     * @param charset   参数内容编码集
     * @return true：验签通过；false：验签不通过
     * @throws ApiException
     */
    @Deprecated
    public static boolean rsaCheckV1(Map<String, String> params, String publicKey,
                                     String charset) throws ApiException {
        String sign = params.get("sign");
        String content = getSignCheckContentV1(params);

        return rsaCheckContent(content, sign, publicKey, charset);
    }

    @Deprecated
    public static boolean rsaCertCheckV1(Map<String, String> params, String alipayPublicCertPath,
                                         String charset) throws ApiException {
        String publicKey = getAlipayPublicKey(alipayPublicCertPath);
        return rsaCheckV1(params, publicKey, charset);
    }

    /**
     * 如果是RSA2签名，请调用此方法进行验签
     *
     * @param params    待验签的从支付宝接收到的参数Map
     * @param publicKey 支付宝公钥
     * @param charset   参数内容编码集
     * @param signType  指定采用的签名方式，RSA2
     * @return true：验签通过；false：验签不通过
     * @throws ApiException
     */
    @Deprecated
    public static boolean rsaCheckV1(Map<String, String> params, String publicKey,
                                     String charset, String signType) throws ApiException {
        String sign = params.get("sign");
        String content = getSignCheckContentV1(params);

        return rsaCheck(content, sign, publicKey, charset, signType);
    }

    @Deprecated
    public static boolean rsaCertCheckV1(Map<String, String> params, String alipayPublicCertPath,
                                         String charset, String signType) throws ApiException {
        String publicKey = getAlipayPublicKey(alipayPublicCertPath);
        return rsaCheckV1(params, publicKey, charset, signType);
    }

    @Deprecated
    public static boolean rsaCheckV2(Map<String, String> params, String publicKey,
                                     String charset) throws ApiException {
        String sign = params.get("sign");
        String content = getSignCheckContentV2(params);

        return rsaCheckContent(content, sign, publicKey, charset);
    }

    @Deprecated
    public static boolean rsaCertCheckV2(Map<String, String> params, String alipayPublicCertPath,
                                         String charset) throws ApiException {
        String publicKey = getAlipayPublicKey(alipayPublicCertPath);
        return rsaCheckV2(params, publicKey, charset);
    }

    @Deprecated
    public static boolean rsaCheckV2(Map<String, String> params, String publicKey,
                                     String charset, String signType) throws ApiException {
        String sign = params.get("sign");
        String content = getSignCheckContentV2(params);

        return rsaCheck(content, sign, publicKey, charset, signType);
    }

    @Deprecated
    public static boolean rsaCertCheckV2(Map<String, String> params, String alipayPublicCertPath,
                                         String charset, String signType) throws ApiException {
        String publicKey = getAlipayPublicKey(alipayPublicCertPath);

        return rsaCheckV2(params, publicKey, charset, signType);
    }

    @Deprecated
    public static boolean rsaCheck(String content, String sign, String publicKey, String charset,
                                   String signType) throws ApiException {
        return verify(content, sign, publicKey, charset, signType);
    }

    @Deprecated
    public static boolean rsaCertCheck(String content, String sign, String alipayPublicCertPath, String charset,
                                       String signType) throws ApiException {
        String publicKey = getAlipayPublicKey(alipayPublicCertPath);
        return rsaCheck(content, sign, publicKey, charset, signType);
    }

    @Deprecated
    public static boolean rsa256CheckContent(String content, String sign, String publicKey,
                                             String charset) throws ApiException {
        return verify(content, sign, publicKey, charset, "RSA2");
    }

    @Deprecated
    public static boolean rsaCheckContent(String content, String sign, String publicKey,
                                          String charset) throws ApiException {
        return verify(content, sign, publicKey, charset, "RSA");
    }

    /**
     * 验签并解密 <p> <b>目前适用于公众号</b><br> params参数示例： <br>{
     * <br>biz_content=M0qGiGz+8kIpxe8aF4geWJdBn0aBTuJRQItLHo9R7o5JGhpic/MIUjvXo2BLB++BbkSq2OsJCEQFDZ0zK5AJYwvBgeRX30gvEj6eXqXRt16
     * /IkB9HzAccEqKmRHrZJ7PjQWE0KfvDAHsJqFIeMvEYk1Zei2QkwSQPlso7K0oheo/iT+HYE8aTATnkqD
     * /ByD9iNDtGg38pCa2xnnns63abKsKoV8h0DfHWgPH62urGY7Pye3r9FCOXA2Ykm8X4/Bl1bWFN/PFCEJHWe/HXj8KJKjWMO6ttsoV0xRGfeyUO8agu6t587Dl5ux5zD
     * /s8Lbg5QXygaOwo3Fz1G8EqmGhi4+soEIQb8DBYanQOS3X+m46tVqBGMw8Oe+hsyIMpsjwF4HaPKMr37zpW3fe7xOMuimbZ0wq53YP
     * /jhQv6XWodjT3mL0H5ACqcsSn727B5ztquzCPiwrqyjUHjJQQefFTzOse8snaWNQTUsQS7aLsHq0FveGpSBYORyA90qPdiTjXIkVP7mAiYiAIWW9pCEC7F3XtViKTZ8FRMM9ySicfuAlf3jtap6v2KPMtQv70X+hlmzO/IXB6W0Ep8DovkF5rB4r/BJYJLw/6AS0LZM9w5JfnAZhfGM2rKzpfNsgpOgEZS1WleG4I2hoQC0nxg9IcP0Hs+nWIPkEUcYNaiXqeBc=,
     * <br>sign=rlqgA8O+RzHBVYLyHmrbODVSANWPXf3pSrr82OCO/bm3upZiXSYrX5fZr6UBmG6BZRAydEyTIguEW6VRuAKjnaO/sOiR9BsSrOdXbD5Rhos/Xt7
     * /mGUWbTOt/F+3W0/XLuDNmuYg1yIC/6hzkg44kgtdSTsQbOC9gWM7ayB4J4c=, sign_type=RSA, <br>charset=UTF-8 <br>} </p>
     *
     * @param params
     * @param alipayPublicKey 支付宝公钥
     * @param cusPrivateKey   商户私钥
     * @param isCheckSign     是否验签
     * @param isDecrypt       是否解密
     * @return 解密后明文，验签失败则异常抛出
     * @throws ApiException
     */
    @Deprecated
    public static String checkSignAndDecrypt(Map<String, String> params, String alipayPublicKey,
                                             String cusPrivateKey, boolean isCheckSign,
                                             boolean isDecrypt) throws ApiException {
        String charset = params.get("charset");
        String bizContent = params.get("biz_content");
        if (isCheckSign) {
            if (!rsaCheckV2(params, alipayPublicKey, charset)) {
                throw new ApiException("rsaCheck failure:rsaParams=" + params);
            }
        }

        if (isDecrypt) {
            return rsaDecrypt(bizContent, cusPrivateKey, charset);
        }

        return bizContent;
    }

    /**
     * 加密并签名<br> <b>目前适用于公众号</b>
     *
     * @param bizContent      待加密、签名内容
     * @param alipayPublicKey 支付宝公钥
     * @param cusPrivateKey   商户私钥
     * @param charset         字符集，如UTF-8
     * @param isEncrypt       是否加密，true-加密  false-不加密
     * @param isSign          是否签名，true-签名  false-不签名
     * @return 加密、签名后xml内容字符串 <p> 返回示例： <alipay> <response>密文</response> <encryption_type>RSA</encryption_type> <sign>sign</sign>
     * <sign_type>RSA</sign_type> </alipay> </p>
     * @throws ApiException
     */
    @Deprecated
    public static String encryptAndSign(String bizContent, String alipayPublicKey,
                                        String cusPrivateKey, String charset, boolean isEncrypt,
                                        boolean isSign) throws ApiException {
        StringBuilder sb = new StringBuilder();
        if (Strings.isNullOrEmpty(charset)) {
            charset = "utf-8";
        }
        sb.append("<?xml version=\"1.0\" encoding=\"" + charset + "\"?>");
        if (isEncrypt) {// 加密
            sb.append("<alipay>");
            String encrypted = rsaEncrypt(bizContent, alipayPublicKey, charset);
            sb.append("<response>" + encrypted + "</response>");
            sb.append("<encryption_type>RSA</encryption_type>");
            if (isSign) {
                String sign = rsaSign(encrypted, cusPrivateKey, charset);
                sb.append("<sign>" + sign + "</sign>");
                sb.append("<sign_type>RSA</sign_type>");
            }
            sb.append("</alipay>");
        } else if (isSign) {// 不加密，但需要签名
            sb.append("<alipay>");
            sb.append("<response>" + bizContent + "</response>");
            String sign = rsaSign(bizContent, cusPrivateKey, charset);
            sb.append("<sign>" + sign + "</sign>");
            sb.append("<sign_type>RSA</sign_type>");
            sb.append("</alipay>");
        } else {// 不加密，不加签
            sb.append(bizContent);
        }
        return sb.toString();
    }

    /**
     * 公钥加密
     *
     * @param content   待加密内容
     * @param publicKey 公钥
     * @param charset   字符集，如UTF-8
     * @return 密文内容
     * @throws ApiException
     */
    @Deprecated
    public static String rsaEncrypt(String content, String publicKey,
                                    String charset) throws ApiException {
        return encrypt(content, publicKey, charset, "RSA");
    }

    /**
     * 私钥解密
     *
     * @param content    待解密内容
     * @param privateKey 私钥
     * @param charset    字符集，如UTF-8, GBK, GB2312
     * @return 明文内容
     * @throws ApiException
     */
    @Deprecated
    public static String rsaDecrypt(String content, String privateKey,
                                    String charset) throws ApiException {
        return decrypt(content, privateKey, charset, "RSA");
    }

    /**
     * 从公钥证书中提取公钥序列号
     *
     * @param certPath 公钥证书存放路径，例如:/home/admin/cert.crt
     * @return 公钥证书序列号
     * @throws ApiException
     */
    public static String getCertSN(String certPath) {
        return AntCertificationUtil.getCertSN(AntCertificationUtil.readCertContent(certPath));
    }

    /**
     * 从公钥证书中提取公钥
     *
     * @param alipayPublicCertPath 公钥证书存放路径，例如:/home/admin/cert.crt
     * @return 公钥
     * @throws ApiException
     */
    public static String getAlipayPublicKey(String alipayPublicCertPath) {
        return AntCertificationUtil.getCertPublicKey(AntCertificationUtil.readCertContent(alipayPublicCertPath));
    }
}
