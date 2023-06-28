package com.alipay.api;

public enum AlipayApiErrorEnum {
    //公钥证书方式
    ROOT_CERT_EMPTY_ERROR("ROOT_CERT_EMPTY_ERROR", "支付宝根证书路径和根证书内容为空，请填写支付宝根证书路径字段[rootCertPath]或根证书内容字符串字段[rootCertContent]"),
    ROOT_CERT_ERROR("ROOT_CERT_ERROR", "AlipayRootCert Is Invalid，请检查支付宝根证书路径字段[rootCertPath]或根证书内容字符串字段[rootCertContent]对应的支付宝根证书是否正确"),
    APP_CERT_EMPTY_ERROR("APP_CERT_EMPTY_ERROR", "应用公钥证书路径和应用公钥证书内容为空，请填写应用公钥证书路径字段[appCertPath]或应用公钥证书内容字符串字段[appCertContent]"),
    APP_CERT_ERROR("APP_CERT_ERROR", "AppCert Is Invalid，请检查应用公钥证书路径字段[appCertPath]或应用公钥证书内容字符串字段[appCertContent]对应的应用公钥证书是否正确"),
    ALIPAY_PUBLIC_CERT_ERROR("ALIPAY_PUBLIC_CERT_ERROR", "提取支付宝公钥证书失败，请检查支付宝公钥证书路径字段[alipayPublicCertPath]或支付宝公钥证书内容字符串字段[alipayPublicCertContent]对应的支付宝公钥证书是否正确"),
    CHECK_CERT_BODY_EMPTY_ERROR("CHECK_CERT_BODY_EMPTY_ERROR", "cert check fail: Body is Empty!"),
    CHECK_ALIPAY_CERT_SN_EMPTY_ERROR("CHECK_ALIPAY_CERT_SN_EMPTY_ERROR", "cert check fail: ALIPAY_CERT_SN is Empty!"),
    CHECK_ALIPAY_CERT_SN_ERROR("CHECK_ALIPAY_CERT_SN_ERROR", "支付宝公钥证书校验失败，请确认支付宝公钥证书路径字段[alipayPublicCertPath]或支付宝公钥证书内容字符串字段[alipayPublicCertContent]对应的支付宝公钥证书是否为支付宝签发的有效公钥证书"),
    CHECK_CERT_ERROR("CHECK_CERT_ERROR", "cert check fail: check Cert and Data Fail!"),
    CHECK_CERT_JSON_ERROR("CHECK_CERT_JSON_ERROR", "cert check fail: check Cert and Data Fail！JSON also！"),
    CHECK_CERT_EXIST_ERROR("CHECK_CERT_EXIST_ERROR", "cert check fail: check Cert and Data Fail! CertSN non-existent"),
    CERT_EXECUTE_ERROR("CERT_EXECUTE_ERROR", "检测到证书相关参数已初始化，证书模式下请改为调用certificateExecute"),

    //证书方式
    CHECK_SIGN_BODY_EMPTY_ERROR("CHECK_SIGN_BODY_EMPTY_ERROR", "sign check fail: Body is Empty!"),
    CHECK_SIGN_ERROR("CHECK_SIGN_ERROR", "sign check fail: check Sign and Data Fail!"),
    CHECK_SIGN_JSON_ERROR("CHECK_SIGN_JSON_ERROR", "sign check fail: check Sign and Data Fail！JSON also！"),
    CHECK_ALIPAY_PUBLIC_KEY_ERROR("CHECK_ALIPAY_PUBLIC_KEY_ERROR", "当前配置的支付宝公钥为应用公钥，请填写正确的支付宝公钥字段[alipayPublicKey]"),

    //加验签
    SIGN_TYPE_ERROR("SIGN_TYPE_ERROR", "无效的非对称加密类型[signType]:[%s]，可选值为：RSA、RSA2和SM2。"),
    ENCRYPT_TEXT_EMPTY_ERROR("ENCRYPT_TEXT_EMPTY_ERROR", "密文不可为空"),
    SIGN_TEXT_EMPTY_ERROR("SIGN_TEXT_EMPTY_ERROR", "待签名内容不可为空"),
    VERIFY_TEXT_EMPTY_ERROR("VERIFY_TEXT_EMPTY_ERROR", "待验签内容不可为空"),
    SIGN_PRIVATE_KEY_EMPTY_ERROR("SIGN_PRIVATE_KEY_EMPTY_ERROR", "私钥[privateKey]不可为空"),
    SIGN_PUBLIC_KEY_EMPTY_ERROR("SIGN_PUBLIC_KEY_EMPTY_ERROR", "公钥不可为空"),
    SIGN_EMPTY_ERROR("SIGN_EMPTY_ERROR", "签名串不可为空"),
    DECRYPT_ERROR("DECRYPT_ERROR", "%s非对称解密遭遇异常，请检查私钥格式是否正确。%s cipherTextBase64=%s，charset=%s，privateKeySize=%d"),
    ENCRYPT_ERROR("ENCRYPT_ERROR", "%s非对称加密遭遇异常，请检查公钥格式是否正确。%s plainText=%s，charset=%s，publicKey=%s"),
    SIGN_ERROR("SIGN_ERROR", "%s签名遭遇异常，请检查私钥格式是否正确。%s content=%s，charset=%s，privateKeySize=%d"),
    VERIFY_ERROR("VERIFY_ERROR", "%s验签遭遇异常，请检查公钥格式或签名是否正确。%s content=%s，charset=%s，publicKey=%s，sign=%s"),
    SIGN_CHARSET_ERROR("SIGN_CHARSET_ERROR", "%s签名遭遇异常，请检查编码格式是否正确。 charset=%s"),

    //加解密
    ENCRYPT_IS_NEED_ERROR("ENCRYPT_IS_NEED_ERROR", "当前API不支持加密请求"),
    ENCRYPT_EMPTY_ERROR("ENCRYPT_EMPTY_ERROR", "API请求要求加密，则必须设置密钥类型[encryptType]和加密密钥[encryptKey]"),
    ENCRYPT_TYPE_ERROR("ENCRYPT_TYPE_ERROR", "当前不支持该算法类型：encrypeType="),
    RESPONSE_BODY_EMPTY_ERROR("RESPONSE_BODY_EMPTY_ERROR", "响应字符串为空"),
    ENCRYPT_ASE_ERROR("ENCRYPT_ASE_ERROR", "AES加密失败：Aescontent = %s; charset = %s"),
    ENCRYPT_ASE_CHARSET_ERROR("ENCRYPT_ASE_CHARSET_ERROR", "AES加密失败，请检查编码格式是否正确：charset = %s"),
    DECRYPT_ASE_ERROR("DECRYPT_ASE_ERROR", "AES解密失败：Aescontent = %s; charset = %s"),
    ENCRYPT_ASE_V2_ERROR("ENCRYPT_ASE_V2_ERROR", "AES_V2加密失败：Aescontent = %s; charset = %s"),
    DECRYPT_ASE_V2_ERROR("DECRYPT_ASE_V2_ERROR", "AES_V2解密失败：Aescontent = %s; charset = %s"),
    ENCRYPT_SM4_ERROR("ENCRYPT_SM4_ERROR", "SM4加密失败：Aescontent = %s; charset = %s"),
    DECRYPT_SM4_ERROR("DECRYPT_SM4_ERROR", "SM4解密失败：Aescontent = %s; charset = %s"),

    KEEPALIVE_DURATION_ERROR("KEEPALIVE_DURATION_ERROR", "最大存活时间不能超过60s");

    private String errCode;
    private String errMsg;

    AlipayApiErrorEnum(String errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
