package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expenserules.scenerule.modify response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-25 17:45:37
 */
public class AlipayEbppInvoiceExpenserulesSceneruleModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3218262278713335655L;

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
