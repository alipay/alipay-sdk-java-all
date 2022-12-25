/**
 * Alipay.com Inc. Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.alipay.api;

import java.io.Serializable;

/**
 * 签名类型
 *
 * @author junying.wei
 * @version $Id: SignItem.java, v 0.1 2019-7-16 下午4:35:37 jiehua Exp $
 */
public class CertItem implements Serializable {

    /**  */
    private static final long serialVersionUID = 6531196726066096786L;

    /**
     * 签名源串
     */
    private String signSourceDate;

    /**
     * 签名
     */
    private String sign;

    /**
     * 证书序列号
     */
    private String cert;

    /**
     * Getter method for property <tt>signSourceDate</tt>.
     *
     * @return property value of signSourceDate
     */
    public String getSignSourceDate() {
        return signSourceDate;
    }

    /**
     * Setter method for property <tt>signSourceDate</tt>.
     *
     * @param signSourceDate value to be assigned to property signSourceDate
     */
    public void setSignSourceDate(String signSourceDate) {
        this.signSourceDate = signSourceDate;
    }

    /**
     * Getter method for property <tt>sign</tt>.
     *
     * @return property value of sign
     */
    public String getSign() {
        return sign;
    }

    /**
     * Setter method for property <tt>sign</tt>.
     *
     * @param sign value to be assigned to property sign
     */
    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * Getter method for property <tt>sign</tt>.
     *
     * @return property value of sign
     */
    public String getCert() {
        return cert;
    }

    /**
     * Setter method for property <tt>sign</tt>.
     *
     * @param cert value to be assigned to property cert
     */
    public void setCert(String cert) {
        this.cert = cert;
    }

}
