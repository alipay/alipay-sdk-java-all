package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;


public class AlipayOpenAppServiceModifyModel
        extends AlipayObject {
    private static final long serialVersionUID = 5766398615262351183L;
    @ApiField("schema_version")
    private String schemaVersion;
    @ApiField("service_id")
    private String serviceId;
    @ApiField("service_xml")
    private String serviceXml;

    public String getSchemaVersion() {
        return this.schemaVersion;
    }


    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }


    public String getServiceId() {
        return this.serviceId;
    }


    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }


    public String getServiceXml() {
        return this.serviceXml;
    }


    public void setServiceXml(String serviceXml) {
        this.serviceXml = serviceXml;
    }
}
