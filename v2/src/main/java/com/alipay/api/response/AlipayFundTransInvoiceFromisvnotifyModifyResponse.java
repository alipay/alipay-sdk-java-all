package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.invoice.fromisvnotify.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-07 10:49:23
 */
public class AlipayFundTransInvoiceFromisvnotifyModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1844918439216146948L;

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
