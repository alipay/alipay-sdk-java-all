package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.invoice.consume.apply response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-09 14:47:57
 */
public class AlipayCommerceEcInvoiceConsumeApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4379462192713866716L;

	/** 
	 * 开票申请创建成功的开票申请id
	 */
	@ApiField("invoice_apply_id")
	private String invoiceApplyId;

	public void setInvoiceApplyId(String invoiceApplyId) {
		this.invoiceApplyId = invoiceApplyId;
	}
	public String getInvoiceApplyId( ) {
		return this.invoiceApplyId;
	}

}
