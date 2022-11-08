package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合同模板答题要素查询
 *
 * @author auto create
 * @since 1.0, 2022-09-14 10:59:59
 */
public class AlipayFincoreComplianceTemplateAnswerQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7123522148671271998L;

	/**
	 * 业务要素
	 */
	@ApiField("biz_object_def_json")
	private String bizObjectDefJson;

	/**
	 * 模版编码
	 */
	@ApiField("template_code")
	private String templateCode;

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

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

}
