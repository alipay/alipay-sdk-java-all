package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expensecontrol.quota.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-10 14:27:24
 */
public class AlipayEbppInvoiceExpensecontrolQuotaModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7799149265561562899L;

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
