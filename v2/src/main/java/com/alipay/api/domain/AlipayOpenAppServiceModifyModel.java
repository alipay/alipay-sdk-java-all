package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务修改
 *
 * @author auto create
 * @since 1.0, 2023-05-16 16:17:16
 */
public class AlipayOpenAppServiceModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5561191613361115113L;

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

}
