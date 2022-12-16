package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expenserules.projectrules.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 19:26:21
 */
public class AlipayEbppInvoiceExpenserulesProjectrulesModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8842737918991557665L;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private String success;

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}
