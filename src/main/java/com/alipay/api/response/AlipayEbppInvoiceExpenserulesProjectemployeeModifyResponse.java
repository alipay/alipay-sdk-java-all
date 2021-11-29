package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expenserules.projectemployee.modify response.
 * 
 * @author auto create
 * @since 1.0, 2021-10-12 09:44:14
 */
public class AlipayEbppInvoiceExpenserulesProjectemployeeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8868748374762813659L;

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
