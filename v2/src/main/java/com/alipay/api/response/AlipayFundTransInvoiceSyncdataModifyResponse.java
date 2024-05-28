package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.invoice.syncdata.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:26:19
 */
public class AlipayFundTransInvoiceSyncdataModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3257131115614211556L;

	/** 
	 * 票据详情页url
	 */
	@ApiField("invoice_url")
	private String invoiceUrl;

	public void setInvoiceUrl(String invoiceUrl) {
		this.invoiceUrl = invoiceUrl;
	}
	public String getInvoiceUrl( ) {
		return this.invoiceUrl;
	}

}
