/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.alipay.api;

import java.io.Serializable;

/**
 *  签名类型
 * @author jie.hua
 * @version $Id: SignItem.java, v 0.1 2015-4-21 下午2:11:37 jiehua Exp $
 */
public class SignItem implements Serializable {

    /**  */
    private static final long serialVersionUID = 6531196726066096786L;

    /**
     * 签名源串
     */
    private String            signSourceDate;

    /**
     * 签名
     */
    private String            sign;

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

}
