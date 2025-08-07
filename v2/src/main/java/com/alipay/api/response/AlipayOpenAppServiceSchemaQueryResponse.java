package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.service.schema.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-03 11:05:54
 */
public class AlipayOpenAppServiceSchemaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7222457194826676544L;

	/** 
	 * 类目id
	 */
	@ApiField("category_id")
	private String categoryId;

	/** 
	 * 服务schema版本
	 */
	@ApiField("schema_version")
	private String schemaVersion;

	/** 
	 * 服务schema
	 */
	@ApiField("schema_xml")
	private String schemaXml;

	/** 
	 * 服务模版类型，默认值: DEFAULT
	 */
	@ApiField("template_type")
	private String templateType;

	/** 
	 * 商户提报服务履约类型
	 */
	@ApiField("user_service_delivery_type")
	private String userServiceDeliveryType;

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryId( ) {
		return this.categoryId;
	}

	public void setSchemaVersion(String schemaVersion) {
		this.schemaVersion = schemaVersion;
	}
	public String getSchemaVersion( ) {
		return this.schemaVersion;
	}

	public void setSchemaXml(String schemaXml) {
		this.schemaXml = schemaXml;
	}
	public String getSchemaXml( ) {
		return this.schemaXml;
	}

	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}
	public String getTemplateType( ) {
		return this.templateType;
	}

	public void setUserServiceDeliveryType(String userServiceDeliveryType) {
		this.userServiceDeliveryType = userServiceDeliveryType;
	}
	public String getUserServiceDeliveryType( ) {
		return this.userServiceDeliveryType;
	}

}
