/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.alipay.service.schema.sdk;

/**
 * @author junying
 * @version : ServiceSchema.java, v 0.1 2021年03月24日 4:48 下午 junying Exp $
 */
public class ServiceSchema {

    private String     serviceName;
    private String     serviceDesc;
    private ServiceUrl serviceUrl;
    private Poi        Poi;

    /**
     * Getter method for property <tt>serviceName</tt>.
     *
     * @return property value of serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Setter method for property <tt>serviceName</tt>.
     *
     * @param serviceName value to be assigned to property serviceName
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * Getter method for property <tt>serviceDesc</tt>.
     *
     * @return property value of serviceDesc
     */
    public String getServiceDesc() {
        return serviceDesc;
    }

    /**
     * Setter method for property <tt>serviceDesc</tt>.
     *
     * @param serviceDesc value to be assigned to property serviceDesc
     */
    public void setServiceDesc(String serviceDesc) {
        this.serviceDesc = serviceDesc;
    }

    /**
     * Getter method for property <tt>serviceUrl</tt>.
     *
     * @return property value of serviceUrl
     */
    public ServiceUrl getServiceUrl() {
        return serviceUrl;
    }

    /**
     * Setter method for property <tt>serviceUrl</tt>.
     *
     * @param serviceUrl value to be assigned to property serviceUrl
     */
    public void setServiceUrl(ServiceUrl serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    /**
     * Getter method for property <tt>Poi</tt>.
     *
     * @return property value of Poi
     */
    public com.alipay.service.schema.sdk.Poi getPoi() {
        return Poi;
    }

    /**
     * Setter method for property <tt>Poi</tt>.
     *
     * @param Poi value to be assigned to property Poi
     */
    public void setPoi(com.alipay.service.schema.sdk.Poi poi) {
        Poi = poi;
    }
}