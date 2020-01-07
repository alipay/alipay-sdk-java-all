/**
 * Alipay.com Inc. Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.alipay.api;

/**
 * @author runzhi
 */
public class AlipayConstants {

    public static final String SIGN_TYPE = "sign_type";

    public static final String SIGN_TYPE_RSA = "RSA";

    /**
     * sha256WithRsa 算法请求类型
     */
    public static final String SIGN_TYPE_RSA2 = "RSA2";

    public static final String SHA_TYPE = "SHA1";

    public static final String SHA_TYPE256 = "SHA256";

    public static final String SIGN_TYPE_SM2 = "SM2";

    public static final String SIGN_ALGORITHMS = "SHA1WithRSA";

    public static final String SIGN_SHA256RSA_ALGORITHMS = "SHA256WithRSA";

    public static final String ENCRYPT_TYPE_AES = "AES";

    public static final String APP_ID = "app_id";

    public static final String TARGET_APP_ID = "target_app_id";

    public static final String FORMAT = "format";

    public static final String METHOD = "method";

    public static final String TIMESTAMP = "timestamp";

    public static final String VERSION = "version";

    public static final String SIGN = "sign";

    public static final String ALIPAY_SDK = "alipay_sdk";

    public static final String ACCESS_TOKEN = "auth_token";

    public static final String APP_AUTH_TOKEN = "app_auth_token";

    public static final String TERMINAL_TYPE = "terminal_type";

    public static final String TERMINAL_INFO = "terminal_info";

    public static final String CHARSET = "charset";

    public static final String NOTIFY_URL = "notify_url";

    public static final String RETURN_URL = "return_url";

    public static final String ENCRYPT_TYPE = "encrypt_type";

    public static final String APP_CERT_SN = "app_cert_sn";

    public static final String ALIPAY_CERT_SN = "alipay_cert_sn";

    public static final String ALIPAY_ROOT_CERT_SN = "alipay_root_cert_sn";

    //-----===-------///

    public static final String BIZ_CONTENT_KEY = "biz_content";

    /**
     * 默认时间格式
     **/
    public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    /**
     * Date默认时区
     **/
    public static final String DATE_TIMEZONE = "GMT+8";

    /**
     * UTF-8字符集
     **/
    public static final String CHARSET_UTF8 = "UTF-8";

    /**
     * GBK字符集
     **/
    public static final String CHARSET_GBK = "GBK";

    /**
     * JSON 应格式
     */
    public static final String FORMAT_JSON = "json";

    /**
     * XML 应格式
     */
    public static final String FORMAT_XML = "xml";

    /**
     * SDK版本号
     */
    public static final String SDK_VERSION = "alipay-sdk-java-dynamicVersionNo";

    public static final String PROD_CODE = "prod_code";

    /**
     * 老版本失败节点
     */
    public static final String ERROR_RESPONSE = "error_response";

    /**
     * 新版本节点后缀
     */
    public static final String RESPONSE_SUFFIX = "_response";

    /**
     * 加密后XML返回报文的节点名字
     */
    public static final String RESPONSE_XML_ENCRYPT_NODE_NAME = "response_encrypted";

    /**
     * 批量请求id
     **/
    public static final String BATCH_REQUEST_ID = "batch_request_id";

}
