package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expenserules.projectinfo.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 02:35:49
 */
public class AlipayEbppInvoiceExpenserulesProjectinfoModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2829671745653487213L;

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
