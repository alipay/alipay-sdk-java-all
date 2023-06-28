package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模版匹配服务
 *
 * @author auto create
 * @since 1.0, 2023-02-08 10:31:19
 */
public class AlipayFincoreComplianceTemplateMatchQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3479745274536383719L;

	/**
	 * 业务要素
	 */
	@ApiField("biz_object_def_json")
	private String bizObjectDefJson;

	/**
	 * 系统来源
	 */
	@ApiField("source_system_id")
	private String sourceSystemId;

	/**
	 * 模版库编码
	 */
	@ApiField("template_lib_code")
	private String templateLibCode;

	/**
	 * 租户
	 */
	@ApiField("tenant")
	private String tenant;

	public String getBizObjectDefJson() {
		return this.bizObjectDefJson;
	}
	public void setBizObjectDefJson(String bizObjectDefJson) {
		this.bizObjectDefJson = bizObjectDefJson;
	}

	public String getSourceSystemId() {
		return this.sourceSystemId;
	}
	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

	public String getTemplateLibCode() {
		return this.templateLibCode;
	}
	public void setTemplateLibCode(String templateLibCode) {
		this.templateLibCode = templateLibCode;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

}
