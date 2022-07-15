package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.info.send response.
 * 
 * @author auto create
 * @since 1.0, 2021-06-07 17:10:10
 */
public class AlipayEbppInvoiceInfoSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7564465451935597989L;

	/** 
	 * 发票访问地址，同步红票的情况下不返回该字段，同步蓝票的情况下如果同步单张发票，返回发票详情链接地址，如果同步的是多张发票，返回发票列表地址
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
