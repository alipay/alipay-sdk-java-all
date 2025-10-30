package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expensecontrol.quota.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-24 15:02:36
 */
public class AlipayEbppInvoiceExpensecontrolQuotaModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2829227283186683767L;

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
