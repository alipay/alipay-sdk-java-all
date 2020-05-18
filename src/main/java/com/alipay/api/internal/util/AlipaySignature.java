/**
 * Alipay.com Inc. Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.alipay.api.internal.util;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayConstants;
import com.alipay.api.internal.util.asymmetric.AsymmetricManager;
import com.alipay.api.internal.util.asymmetric.RSAEncryptor;

import java.io.InputStream;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author junying.wjy
 */
public class AlipaySignature {
    /**
     * 通用签名方法
     *
     * @param content    待签名内容
     * @param privateKey 私钥
     * @param charset    编码格式
     * @param signType   签名类型：RSA、RSA2、SM2
     * @return
     * @throws AlipayApiException
     */
    public static String sign(String content, String privateKey, String charset,
                              String signType) throws AlipayApiException {

        return AsymmetricManager.getByName(signType).sign(content, charset, privateKey);
    }

    /**
     * 通用签名方法
     *
     * @param params     待签名内容
     * @param privateKey 私钥
     * @param charset    编码格式
     * @param signType   签名类型：RSA、RSA2、SM2
     * @return
     * @throws AlipayApiException
     */
    public static String sign(Map<String, String> params, String privateKey, String charset,
                              String signType) throws AlipayApiException {
        String signContent = getSignContent(params);
        return AsymmetricManager.getByName(signType).sign(signContent, charset, privateKey);
    }

    /**
     * 密钥模式RSA、RSA2、SM2通用验签方法，主要用于支付接口的返回参数的验签比如：当面付，APP支付，手机网站支付，电脑网站支付
     *
     * @param params    待验签的从支付宝接收到的参数Map
     * @param publicKey 支付宝公钥
     * @param charset   参数内容编码集
     * @param signType  指定采用的签名方式，RSA、RSA2、SM2
     * @return true：验签通过；false：验签不通过
     * @throws AlipayApiException
     */
    public static boolean verifyV1(Map<String, String> params, String publicKey,
                                   String charset, String signType) throws AlipayApiException {
        String sign = params.get("sign");
        String content = getSignCheckContentV1(params);

        return AsymmetricManager.getByName(signType).verify(content, charset, publicKey, sign);
    }

    /**
     * 证书模式RSA、RSA2、SM2通用验签方法，主要用于支付接口的返回参数的验签比如：当面付，APP支付，手机网站支付，电脑网站支付
     *
     * @param params               待验签的从支付宝接收到的参数Map
     * @param alipayPublicCertPath 支付宝公钥路径
     * @param charset              参数内容编码集
     * @param signType             指定采用的签名方式，RSA、RSA2、SM2
     * @return true：验签通过；false：验签不通过
     * @throws AlipayApiException
     */
    public static boolean certVerifyV1(Map<String, String> params, String alipayPublicCertPath,
                                       String charset, String signType) throws AlipayApiException {
        String publicKey = getAlipayPublicKey(alipayPublicCertPath);
        return verifyV1(params, publicKey, charset, signType);
    }

    /**
     * 密钥模式RSA、RSA2、SM2通用验签方法，主要是用于生活号相关的事件消息和口碑服务市场订购信息等发送到应用网关地址的异步信息的验签
     *
     * @param params    待验签的从支付宝接收到的参数Map
     * @param publicKey 支付宝公钥
     * @param charset   参数内容编码集
     * @param signType  指定采用的签名方式，RSA、RSA2、SM2
     * @return true：验签通过；false：验签不通过
     * @throws AlipayApiException
     */
    public static boolean verifyV2(Map<String, String> params, String publicKey,
                                   String charset, String signType) throws AlipayApiException {
        String sign = params.get("sign");
        String content = getSignCheckContentV2(params);

        return AsymmetricManager.getByName(signType).verify(content, charset, publicKey, sign);
    }

    /**
     * 证书模式RSA、RSA2、SM2通用验签方法，主要是用于生活号相关的事件消息和口碑服务市场订购信息等发送到应用网关地址的异步信息的验签
     *
     * @param params               待验签的从支付宝接收到的参数Map
     * @param alipayPublicCertPath 支付宝公钥路径
     * @param charset              参数内容编码集
     * @param signType             指定采用的签名方式，RSA、RSA2、SM2
     * @return true：验签通过；false：验签不通过
     * @throws AlipayApiException
     */
    public static boolean certVerifyV2(Map<String, String> params, String alipayPublicCertPath,
                                       String charset, String signType) throws AlipayApiException {
        String publicKey = getAlipayPublicKey(alipayPublicCertPath);

        return verifyV2(params, publicKey, charset, signType);
    }

    /**
     * 密钥模式RSA、RSA2、SM2通用验签方法
     *
     * @param content   待验签字符串
     * @param sign      签名
     * @param publicKey 支付宝公钥
     * @param charset   参数内容编码集
     * @param signType  指定采用的签名方式，RSA、RSA2、SM2
     * @return
     * @throws AlipayApiException
     */
    public static boolean verify(String content, String sign, String publicKey, String charset,
                                 String signType) throws AlipayApiException {

        return AsymmetricManager.getByName(signType).verify(content, charset, publicKey, sign);
    }

    /**
     * 证书模式RSA、RSA2、SM2通用验签方法
     *
     * @param content              待验签字符串
     * @param sign                 签名
     * @param alipayPublicCertPath 支付宝公钥路径
     * @param charset              参数内容编码集
     * @param signType             指定采用的签名方式，RSA、RSA2、SM2
     * @return
     * @throws AlipayApiException
     */
    public static boolean certVerify(String content, String sign, String alipayPublicCertPath, String charset,
                                     String signType) throws AlipayApiException {
        String publicKey = getAlipayPublicKey(alipayPublicCertPath);
        return verify(content, sign, publicKey, charset, signType);
    }

    /**
     * 公钥加密
     *
     * @param content   待加密内容
     * @param publicKey 公钥
     * @param charset   字符集，如UTF-8, GBK, GB2312
     * @param signType  指定采用的签名方式，RSA、RSA2、SM2
     * @return 密文内容
     * @throws AlipayApiException
     */
    public static String encrypt(String content, String publicKey,
                                 String charset, String signType) throws AlipayApiException {
        return AsymmetricManager.getByName(signType).encrypt(content, charset, publicKey);
    }

    /**
     * 私钥解密
     *
     * @param content    待解密内容
     * @param privateKey 私钥
     * @param charset    字符集，如UTF-8, GBK, GB2312
     * @param signType   指定采用的签名方式，RSA、RSA2、SM2
     * @return 明文内容
     * @throws AlipayApiException
     */
    public static String decrypt(String content, String privateKey,
                                 String charset, String signType) throws AlipayApiException {

        return AsymmetricManager.getByName(signType).decrypt(content, charset, privateKey);
    }

    /**
     * 加密并签名<br> <b>目前适用于公众号</b>
     *
     * @param bizContent      待加密、签名内容
     * @param alipayPublicKey 支付宝公钥
     * @param cusPrivateKey   商户私钥
     * @param charset         字符集，如UTF-8, GBK, GB2312
     * @param isEncrypt       是否加密，true-加密  false-不加密
     * @param isSign          是否签名，true-签名  false-不签名
     * @param signType        指定采用的签名方式，RSA、RSA2、SM2
     * @return 加密、签名后xml内容字符串 <p> 返回示例： <alipay> <response>密文</response> <encryption_type>RSA</encryption_type> <sign>sign</sign>
     * <sign_type>RSA</sign_type> </alipay> </p>
     * @throws AlipayApiException
     */
    public static String encryptAndSign(String bizContent, String alipayPublicKey,
                                        String cusPrivateKey, String charset, boolean isEncrypt,
                                        boolean isSign, String signType) throws AlipayApiException {
        StringBuilder sb = new StringBuilder();
        if (StringUtils.isEmpty(charset)) {
            charset = AlipayConstants.CHARSET_GBK;
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
     * @param signType        指定采用的签名方式，RSA、RSA2、SM2
     * @return 解密后明文，验签失败则异常抛出
     * @throws AlipayApiException
     */
    public static String checkSignAndDecrypt(Map<String, String> params, String alipayPublicKey,
                                             String cusPrivateKey, boolean isCheckSign,
                                             boolean isDecrypt, String signType) throws AlipayApiException {
        String charset = params.get("charset");
        String bizContent = params.get("biz_content");
        if (isCheckSign) {
            if (!verifyV2(params, alipayPublicKey, charset, signType)) {
                throw new AlipayApiException("rsaCheck failure:rsaParams=" + params);
            }
        }

        if (isDecrypt) {
            return decrypt(bizContent, cusPrivateKey, charset, signType);
        }

        return bizContent;
    }

    public static String getSignatureContent(RequestParametersHolder requestHolder) {
        return getSignContent(getSortedMap(requestHolder));
    }

    public static Map<String, String> getSortedMap(RequestParametersHolder requestHolder) {
        Map<String, String> sortedParams = new TreeMap<String, String>();
        AlipayHashMap appParams = requestHolder.getApplicationParams();
        if (appParams != null && appParams.size() > 0) {
            sortedParams.putAll(appParams);
        }
        AlipayHashMap protocalMustParams = requestHolder.getProtocalMustParams();
        if (protocalMustParams != null && protocalMustParams.size() > 0) {
            sortedParams.putAll(protocalMustParams);
        }
        AlipayHashMap protocalOptParams = requestHolder.getProtocalOptParams();
        if (protocalOptParams != null && protocalOptParams.size() > 0) {
            sortedParams.putAll(protocalOptParams);
        }

        return sortedParams;
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
        for (String key : keys) {
            String value = sortedParams.get(key);
            if (StringUtils.areNotEmpty(key, value)) {
                content.append(index == 0 ? "" : "&").append(key).append("=").append(value);
                index++;
            }
        }
        return content.toString();
    }

    public static SignSourceData extractSignContent(String str, int begin) {
        if (str == null) {
            return null;
        }

        int beginIndex = extractBeginPosition(str, begin);
        if (beginIndex >= str.length()) {
            return null;
        }

        int endIndex = extractEndPosition(str, beginIndex);
        return new SignSourceData(str.substring(beginIndex, endIndex), beginIndex, endIndex);
    }

    private static int extractBeginPosition(String responseString, int begin) {
        int beginPosition = begin;
        //找到第一个左大括号（对应响应的是JSON对象的情况：普通调用OpenAPI响应明文）
        //或者双引号（对应响应的是JSON字符串的情况：加密调用OpenAPI响应Base64串），作为待验签内容的起点
        while (beginPosition < responseString.length()
                && responseString.charAt(beginPosition) != '{'
                && responseString.charAt(beginPosition) != '"') {
            ++beginPosition;
        }
        return beginPosition;
    }

    private static int extractEndPosition(String responseString, int beginPosition) {
        //提取明文验签内容终点
        if (responseString.charAt(beginPosition) == '{') {
            return extractJsonObjectEndPosition(responseString, beginPosition);
        }
        //提取密文验签内容终点
        else {
            return extractJsonBase64ValueEndPosition(responseString, beginPosition);
        }
    }

    private static int extractJsonBase64ValueEndPosition(String responseString, int beginPosition) {
        for (int index = beginPosition; index < responseString.length(); ++index) {
            //找到第2个双引号作为终点，由于中间全部是Base64编码的密文，所以不会有干扰的特殊字符
            if (responseString.charAt(index) == '"' && index != beginPosition) {
                return index + 1;
            }
        }
        //如果没有找到第2个双引号，说明验签内容片段提取失败，直接尝试选取剩余整个响应字符串进行验签
        return responseString.length();
    }

    private static int extractJsonObjectEndPosition(String responseString, int beginPosition) {
        //记录当前尚未发现配对闭合的大括号
        LinkedList<String> braces = new LinkedList<String>();
        //记录当前字符是否在双引号中
        boolean inQuotes = false;
        //记录当前字符前面连续的转义字符个数
        int consecutiveEscapeCount = 0;
        //从待验签字符的起点开始遍历后续字符串，找出待验签字符串的终止点，终点即是与起点{配对的}
        for (int index = beginPosition; index < responseString.length(); ++index) {
            //提取当前字符
            char currentChar = responseString.charAt(index);

            //如果当前字符是"且前面有偶数个转义标记（0也是偶数）
            if (currentChar == '"' && consecutiveEscapeCount % 2 == 0) {
                //是否在引号中的状态取反
                inQuotes = !inQuotes;
            }
            //如果当前字符是{且不在引号中
            else if (currentChar == '{' && !inQuotes) {
                //将该{加入未闭合括号中
                braces.push("{");
            }
            //如果当前字符是}且不在引号中
            else if (currentChar == '}' && !inQuotes) {
                //弹出一个未闭合括号
                braces.pop();
                //如果弹出后，未闭合括号为空，说明已经找到终点
                if (braces.isEmpty()) {
                    return index + 1;
                }
            }

            //如果当前字符是转义字符
            if (currentChar == '\\') {
                //连续转义字符个数+1
                ++consecutiveEscapeCount;
            } else {
                //连续转义字符个数置0
                consecutiveEscapeCount = 0;
            }
        }

        //如果没有找到配对的闭合括号，说明验签内容片段提取失败，直接尝试选取剩余整个响应字符串进行验签
        return responseString.length();
    }

    /**
     * rsa内容签名
     *
     * @param content
     * @param privateKey
     * @param charset
     * @return
     * @throws AlipayApiException
     */
    public static String rsaSign(String content, String privateKey, String charset,
                                 String signType) throws AlipayApiException {

        return AsymmetricManager.getByName(signType).sign(content, charset, privateKey);
    }

    /**
     * sha256WithRsa 加签
     *
     * @param content
     * @param privateKey
     * @param charset
     * @return
     * @throws AlipayApiException
     */
    public static String rsa256Sign(String content, String privateKey,
                                    String charset) throws AlipayApiException {

        return AsymmetricManager.getByName("RSA2").sign(content, charset, privateKey);
    }

    /**
     * sha1WithRsa 加签
     *
     * @param content
     * @param privateKey
     * @param charset
     * @return
     * @throws AlipayApiException
     */
    public static String rsaSign(String content, String privateKey,
                                 String charset) throws AlipayApiException {

        return AsymmetricManager.getByName("RSA").sign(content, charset, privateKey);
    }

    public static String rsaSign(Map<String, String> params, String privateKey,
                                 String charset) throws AlipayApiException {
        String signContent = getSignContent(params);

        return rsaSign(signContent, privateKey, charset);

    }

    public static PrivateKey getPrivateKeyFromPKCS8(String algorithm,
                                                    InputStream ins) throws Exception {

        return RSAEncryptor.getPrivateKeyFromPKCS8(algorithm, ins);
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

        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            String value = params.get(key);
            content.append((i == 0 ? "" : "&") + key + "=" + value);
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

        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            String value = params.get(key);
            content.append(i == 0 ? "" : "&").append(key).append("=").append(value);
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
     * @throws AlipayApiException
     */
    public static boolean rsaCheckV1(Map<String, String> params, String publicKey,
                                     String charset) throws AlipayApiException {
        String sign = params.get("sign");
        String content = getSignCheckContentV1(params);

        return rsaCheckContent(content, sign, publicKey, charset);
    }

    public static boolean rsaCertCheckV1(Map<String, String> params, String alipayPublicCertPath,
                                         String charset) throws AlipayApiException {
        String publicKey = getAlipayPublicKey(alipayPublicCertPath);
        return rsaCheckV1(params, publicKey, charset);
    }

    /**
     * 如果是RSA或RSA2签名，请调用此方法进行验签
     *
     * @param params    待验签的从支付宝接收到的参数Map
     * @param publicKey 支付宝公钥
     * @param charset   参数内容编码集
     * @param signType  指定采用的签名方式，RSA或RSA2
     * @return true：验签通过；false：验签不通过
     * @throws AlipayApiException
     */
    public static boolean rsaCheckV1(Map<String, String> params, String publicKey,
                                     String charset, String signType) throws AlipayApiException {
        String sign = params.get("sign");
        String content = getSignCheckContentV1(params);

        return rsaCheck(content, sign, publicKey, charset, signType);
    }

    public static boolean rsaCertCheckV1(Map<String, String> params, String alipayPublicCertPath,
                                         String charset, String signType) throws AlipayApiException {
        String publicKey = getAlipayPublicKey(alipayPublicCertPath);
        return rsaCheckV1(params, publicKey, charset, signType);
    }

    public static boolean rsaCheckV2(Map<String, String> params, String publicKey,
                                     String charset) throws AlipayApiException {
        String sign = params.get("sign");
        String content = getSignCheckContentV2(params);

        return rsaCheckContent(content, sign, publicKey, charset);
    }

    public static boolean rsaCertCheckV2(Map<String, String> params, String alipayPublicCertPath,
                                         String charset) throws AlipayApiException {
        String publicKey = getAlipayPublicKey(alipayPublicCertPath);
        return rsaCheckV2(params, publicKey, charset);
    }

    public static boolean rsaCheckV2(Map<String, String> params, String publicKey,
                                     String charset, String signType) throws AlipayApiException {
        String sign = params.get("sign");
        String content = getSignCheckContentV2(params);

        return rsaCheck(content, sign, publicKey, charset, signType);
    }

    public static boolean rsaCertCheckV2(Map<String, String> params, String alipayPublicCertPath,
                                         String charset, String signType) throws AlipayApiException {
        String publicKey = getAlipayPublicKey(alipayPublicCertPath);

        return rsaCheckV2(params, publicKey, charset, signType);
    }

    public static boolean rsaCheck(String content, String sign, String publicKey, String charset,
                                   String signType) throws AlipayApiException {

        return AsymmetricManager.getByName(signType).verify(content, charset, publicKey, sign);
    }

    public static boolean rsaCertCheck(String content, String sign, String alipayPublicCertPath, String charset,
                                       String signType) throws AlipayApiException {
        String publicKey = getAlipayPublicKey(alipayPublicCertPath);
        return rsaCheck(content, sign, publicKey, charset, signType);
    }

    public static boolean rsa256CheckContent(String content, String sign, String publicKey,
                                             String charset) throws AlipayApiException {

        return AsymmetricManager.getByName("RSA2").verify(content, charset, publicKey, sign);
    }

    public static boolean rsaCheckContent(String content, String sign, String publicKey,
                                          String charset) throws AlipayApiException {

        return AsymmetricManager.getByName("RSA").verify(content, charset, publicKey, sign);
    }

    public static PublicKey getPublicKeyFromX509(String algorithm,
                                                 InputStream ins) throws Exception {

        return RSAEncryptor.getPublicKeyFromX509(algorithm, ins);
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
     * @throws AlipayApiException
     */
    public static String checkSignAndDecrypt(Map<String, String> params, String alipayPublicKey,
                                             String cusPrivateKey, boolean isCheckSign,
                                             boolean isDecrypt) throws AlipayApiException {
        String charset = params.get("charset");
        String bizContent = params.get("biz_content");
        if (isCheckSign) {
            if (!rsaCheckV2(params, alipayPublicKey, charset)) {
                throw new AlipayApiException("rsaCheck failure:rsaParams=" + params);
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
     * @param charset         字符集，如UTF-8, GBK, GB2312
     * @param isEncrypt       是否加密，true-加密  false-不加密
     * @param isSign          是否签名，true-签名  false-不签名
     * @return 加密、签名后xml内容字符串 <p> 返回示例： <alipay> <response>密文</response> <encryption_type>RSA</encryption_type> <sign>sign</sign>
     * <sign_type>RSA</sign_type> </alipay> </p>
     * @throws AlipayApiException
     */
    public static String encryptAndSign(String bizContent, String alipayPublicKey,
                                        String cusPrivateKey, String charset, boolean isEncrypt,
                                        boolean isSign) throws AlipayApiException {
        StringBuilder sb = new StringBuilder();
        if (StringUtils.isEmpty(charset)) {
            charset = AlipayConstants.CHARSET_GBK;
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
     * @param charset   字符集，如UTF-8, GBK, GB2312
     * @return 密文内容
     * @throws AlipayApiException
     */
    public static String rsaEncrypt(String content, String publicKey,
                                    String charset) throws AlipayApiException {
        return AsymmetricManager.getByName("RSA").encrypt(content, charset, publicKey);
    }

    /**
     * 私钥解密
     *
     * @param content    待解密内容
     * @param privateKey 私钥
     * @param charset    字符集，如UTF-8, GBK, GB2312
     * @return 明文内容
     * @throws AlipayApiException
     */
    public static String rsaDecrypt(String content, String privateKey,
                                    String charset) throws AlipayApiException {

        return AsymmetricManager.getByName("RSA").decrypt(content, charset, privateKey);
    }

    /**
     * 从公钥证书中提取公钥序列号
     *
     * @param certPath 公钥证书存放路径，例如:/home/admin/cert.crt
     * @return 公钥证书序列号
     * @throws AlipayApiException
     */
    public static String getCertSN(String certPath) throws AlipayApiException {
        return AntCertificationUtil.getCertSN(AntCertificationUtil.getCertFromPath(certPath));
    }

    /**
     * 从公钥证书中提取公钥
     *
     * @param alipayPublicCertPath 公钥证书存放路径，例如:/home/admin/cert.crt
     * @return 公钥
     * @throws AlipayApiException
     */
    public static String getAlipayPublicKey(String alipayPublicCertPath) throws AlipayApiException {
        return AntCertificationUtil.getAlipayPublicKey(alipayPublicCertPath);
    }
}
