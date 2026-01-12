package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expenserules.projectemployee.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-14 11:42:36
 */
public class AlipayEbppInvoiceExpenserulesProjectemployeeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2712992569487173134L;

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
