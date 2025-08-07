package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.sycn response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-26 21:34:31
 */
public class AlipayEbppInvoiceSycnResponse extends AlipayResponse {

	private static final long serialVersionUID = 8854728462327178284L;

	/** 
	 * 支付宝发票管家发票详情页链接地址
如果同步的发票是多张时，此链接为当前用户的已开立发票列表地址
	 */
	@ApiField("url")
	private String url;

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
