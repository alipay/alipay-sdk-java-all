package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expensecomsue.outsource.notify response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 14:41:45
 */
public class AlipayEbppInvoiceExpensecomsueOutsourceNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4446981677287516959L;

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
