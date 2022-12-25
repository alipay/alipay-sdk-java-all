package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;


public class AlipayOpenAppServiceApplyModel
        extends AlipayObject {
    private static final long serialVersionUID = 2217772335136985594L;
    @ApiField("category_id")
    private String categoryId;
    @ApiField("schema_version")
    private String schemaVersion;
    @ApiField("service_xml")
    private String serviceXml;

    public String getCategoryId() {
        return this.categoryId;
    }


    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }


    public String getSchemaVersion() {
        return this.schemaVersion;
    }


    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }


    public String getServiceXml() {
        return this.serviceXml;
    }


    public void setServiceXml(String serviceXml) {
        this.serviceXml = serviceXml;
    }
}
