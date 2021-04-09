package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务提报申请
 *
 * @author auto create
 * @since 1.0, 2021-04-09 11:21:05
 */
public class AlipayOpenAppServiceApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5429585865245247262L;

	/**
	 * 行业类目id
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 服务schema版本
	 */
	@ApiField("schema_version")
	private String schemaVersion;

	/**
	 * 服务xml
	 */
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
