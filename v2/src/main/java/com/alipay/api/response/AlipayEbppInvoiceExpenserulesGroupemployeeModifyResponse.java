package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expenserules.groupemployee.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 14:27:42
 */
public class AlipayEbppInvoiceExpenserulesGroupemployeeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8812594683689892672L;

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
