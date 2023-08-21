package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InvoiceTitleModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.title.dynamic.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:20:42
 */
public class AlipayEbppInvoiceTitleDynamicGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5831481691516849553L;

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
