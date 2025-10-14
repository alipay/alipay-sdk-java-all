package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务修改
 *
 * @author auto create
 * @since 1.0, 2025-01-03 11:05:35
 */
public class AlipayOpenAppServiceModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2532181284675355128L;

	/**
	 * 服务schema版本
	 */
	@ApiField("schema_version")
	private String schemaVersion;

	/**
	 * 服务id
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 服务内容xml格式
	 */
	@ApiField("service_xml")
	private String serviceXml;

	/**
	 * 服务模版。若当前服务类目只有一个服务模版，可不填。
	 */
	@ApiField("template_type")
	private String templateType;

	/**
	 * 服务履约类型的枚举值为
访问类型：SCANE_SERVICE_DELIVERY
交易类型：TRADE_SERVICE_DELIVERY
	 */
	@ApiField("user_service_delivery_type")
	private String userServiceDeliveryType;

	public String getSchemaVersion() {
		return this.schemaVersion;
	}
	public void setSchemaVersion(String schemaVersion) {
		this.schemaVersion = schemaVersion;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getServiceXml() {
		return this.serviceXml;
	}
	public void setServiceXml(String serviceXml) {
		this.serviceXml = serviceXml;
	}

	public String getTemplateType() {
		return this.templateType;
	}
	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}

	public String getUserServiceDeliveryType() {
		return this.userServiceDeliveryType;
	}
	public void setUserServiceDeliveryType(String userServiceDeliveryType) {
		this.userServiceDeliveryType = userServiceDeliveryType;
	}

}
