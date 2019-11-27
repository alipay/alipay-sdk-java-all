package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InvoiceTitleModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.title.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-21 16:58:52
 */
public class AlipayEbppInvoiceTitleGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3453342438943397413L;

	/** 
	 * 抬头模型
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
