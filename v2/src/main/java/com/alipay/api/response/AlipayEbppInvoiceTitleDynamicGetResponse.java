package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InvoiceTitleModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.title.dynamic.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-24 15:41:55
 */
public class AlipayEbppInvoiceTitleDynamicGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6218555882312698447L;

	/** 
	 * 发票抬头
	 */
	@ApiField("title")
	private InvoiceTitleModel title;

	public void setTitle(InvoiceTitleModel title) {
		this.title = title;
	}
	public InvoiceTitleModel getTitle( ) {
		return this.title;
	}

}
