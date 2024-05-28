package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expensecontrol.issuebatch.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-30 21:07:24
 */
public class AlipayEbppInvoiceExpensecontrolIssuebatchCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 6763811848517751156L;

	/** 
	 * 是否成功
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
