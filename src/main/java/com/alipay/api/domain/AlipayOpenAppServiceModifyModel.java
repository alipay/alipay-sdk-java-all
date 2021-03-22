package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务修改
 *
 * @author auto create
 * @since 1.0, 2021-03-18 11:48:49
 */
public class AlipayOpenAppServiceModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5766398615262351183L;

	/**
	 * 服务schema版本
	 */
	@ApiField("schema_version")
	private String schemaVersion;

	/**
	 * 服务id
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 服务内容xml格式
	 */
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
