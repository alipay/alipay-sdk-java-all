package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expenserules.groupemployee.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 20:36:39
 */
public class AlipayEbppInvoiceExpenserulesGroupemployeeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8414882493636529911L;

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
