package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.invoice.fromisvnotify.modify response.
 * 
 * @author auto create
 * @since 1.0, 2020-12-16 11:58:03
 */
public class AlipayFundTransInvoiceFromisvnotifyModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8792619758823274473L;

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
