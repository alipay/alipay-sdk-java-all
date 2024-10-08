package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expenserules.groupemployee.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-19 18:08:23
 */
public class AlipayEbppInvoiceExpenserulesGroupemployeeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6716162293477147763L;

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
