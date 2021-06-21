/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.alipay.service.schema.sdk;

/**
 * @author junying
 * @version : ServiceUrl.java, v 0.1 2021年03月24日 4:50 下午 junying Exp $
 */
public class ServiceUrl {
    private String carrierType;
    private String carrierUrl;

    /**
     * Getter method for property <tt>carrierType</tt>.
     *
     * @return property value of carrierType
     */
    public String getCarrierType() {
        return carrierType;
    }

    /**
     * Setter method for property <tt>carrierType</tt>.
     *
     * @param carrierType value to be assigned to property carrierType
     */
    public void setCarrierType(String carrierType) {
        this.carrierType = carrierType;
    }

    /**
     * Getter method for property <tt>carrierUrl</tt>.
     *
     * @return property value of carrierUrl
     */
    public String getCarrierUrl() {
        return carrierUrl;
    }

    /**
     * Setter method for property <tt>carrierUrl</tt>.
     *
     * @param carrierUrl value to be assigned to property carrierUrl
     */
    public void setCarrierUrl(String carrierUrl) {
        this.carrierUrl = carrierUrl;
    }
}