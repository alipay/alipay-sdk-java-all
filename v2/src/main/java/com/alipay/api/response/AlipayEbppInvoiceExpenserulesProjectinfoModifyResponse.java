package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expenserules.projectinfo.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-30 21:05:15
 */
public class AlipayEbppInvoiceExpenserulesProjectinfoModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4733295883851632279L;

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
