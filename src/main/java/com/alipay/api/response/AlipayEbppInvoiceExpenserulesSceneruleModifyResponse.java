package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expenserules.scenerule.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-11 21:36:44
 */
public class AlipayEbppInvoiceExpenserulesSceneruleModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8683544332225847515L;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
