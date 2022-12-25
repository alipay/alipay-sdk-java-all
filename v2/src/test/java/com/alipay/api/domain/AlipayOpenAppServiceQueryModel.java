package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;


public class AlipayOpenAppServiceQueryModel
        extends AlipayObject {
    private static final long serialVersionUID = 7876228836476822935L;
    @ApiField("service_id")
    private String serviceId;

    public String getServiceId() {
        return this.serviceId;
    }


    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }
}
