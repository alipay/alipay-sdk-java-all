package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expenserules.projectrule.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-13 20:27:40
 */
public class AlipayEbppInvoiceExpenserulesProjectruleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3326183559441973321L;

	/** 
	 * 项目id
	 */
	@ApiField("project_id")
	private String projectId;

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getProjectId( ) {
		return this.projectId;
	}

}
