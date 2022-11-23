package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expenserules.projectrule.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-18 23:41:34
 */
public class AlipayEbppInvoiceExpenserulesProjectruleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5633396215624114927L;

	/** 
	 * 项目ID
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
