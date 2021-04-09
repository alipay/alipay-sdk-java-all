/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.alipay.service.schema.sdk;

/**
 * @author junying
 * @version : Poi.java, v 0.1 2021年03月24日 4:52 下午 junying Exp $
 */
public class Poi {
    private String poiName;
    private String shopId;
    private String address;
    private String cityCode;

    /**
     * Getter method for property <tt>poiName</tt>.
     *
     * @return property value of poiName
     */
    public String getPoiName() {
        return poiName;
    }

    /**
     * Setter method for property <tt>poiName</tt>.
     *
     * @param poiName value to be assigned to property poiName
     */
    public void setPoiName(String poiName) {
        this.poiName = poiName;
    }

    /**
     * Getter method for property <tt>shopId</tt>.
     *
     * @return property value of shopId
     */
    public String getShopId() {
        return shopId;
    }

    /**
     * Setter method for property <tt>shopId</tt>.
     *
     * @param shopId value to be assigned to property shopId
     */
    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    /**
     * Getter method for property <tt>address</tt>.
     *
     * @return property value of address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Setter method for property <tt>address</tt>.
     *
     * @param address value to be assigned to property address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Getter method for property <tt>cityCode</tt>.
     *
     * @return property value of cityCode
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * Setter method for property <tt>cityCode</tt>.
     *
     * @param cityCode value to be assigned to property cityCode
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }
}