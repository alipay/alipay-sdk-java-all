package com.alipay.api.response;

import com.alipay.api.AlipayResponse;
import com.alipay.api.internal.mapping.ApiField;


public class AlipayOpenAppServiceApplyResponse
        extends AlipayResponse {
    private static final long serialVersionUID = 6776664634253314573L;
    @ApiField("service_id")
    private String serviceId;

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceId() {
        return this.serviceId;
    }
}
