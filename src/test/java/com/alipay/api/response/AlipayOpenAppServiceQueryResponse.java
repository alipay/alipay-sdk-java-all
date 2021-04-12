package com.alipay.api.response;

import com.alipay.api.AlipayResponse;
import com.alipay.api.internal.mapping.ApiField;


public class AlipayOpenAppServiceQueryResponse
        extends AlipayResponse {
    private static final long serialVersionUID = 8862229131251148166L;
    @ApiField("reject_reason")
    private String rejectReason;
    @ApiField("service_id")
    private String serviceId;
    @ApiField("service_xml")
    private String serviceXml;
    @ApiField("status")
    private String status;

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public String getRejectReason() {
        return this.rejectReason;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public void setServiceXml(String serviceXml) {
        this.serviceXml = serviceXml;
    }

    public String getServiceXml() {
        return this.serviceXml;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}
