package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expenserules.projectrule.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 09:31:53
 */
public class AlipayEbppInvoiceExpenserulesProjectruleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5695458426723334825L;

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
