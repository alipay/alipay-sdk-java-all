package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.industryinvoice.invoiceapply.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-10 10:22:40
 */
public class AlipayCommerceEcIndustryinvoiceInvoiceapplyCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2685286484729129334L;

	/** 
	 * 开票申请创建成功的开票申请ID
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
