package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合同模板答题要素查询
 *
 * @author auto create
 * @since 1.0, 2021-12-23 14:28:34
 */
public class AlipayFincoreComplianceTemplateAnswerQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5244632411572955457L;

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
