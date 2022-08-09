package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expensecontrol.quota.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-19 17:10:46
 */
public class AlipayEbppInvoiceExpensecontrolQuotaModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4842412122696881123L;

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
