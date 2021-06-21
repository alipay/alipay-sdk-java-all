package com.alipay.api.response;

import com.alipay.api.AlipayResponse;
import com.alipay.api.internal.mapping.ApiField;

public class AlipayOpenAppServiceSchemaQueryResponse
        extends AlipayResponse {
    private static final long serialVersionUID = 3691583651424316642L;
    @ApiField("category_id")
    private String categoryId;
    @ApiField("schema_version")
    private String schemaVersion;
    @ApiField("schema_xml")
    private String schemaXml;

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryId() {
        return this.categoryId;
    }

    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public void setSchemaXml(String schemaXml) {
        this.schemaXml = schemaXml;
    }

    public String getSchemaXml() {
        return this.schemaXml;
    }
}
