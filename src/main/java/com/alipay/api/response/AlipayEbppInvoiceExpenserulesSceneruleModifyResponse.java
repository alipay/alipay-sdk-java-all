package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expenserules.scenerule.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-10 10:00:39
 */
public class AlipayEbppInvoiceExpenserulesSceneruleModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6242628592755199644L;

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
