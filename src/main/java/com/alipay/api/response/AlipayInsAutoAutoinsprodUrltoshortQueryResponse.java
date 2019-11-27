package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.autoinsprod.urltoshort.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-17 10:31:18
 */
public class AlipayInsAutoAutoinsprodUrltoshortQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3569497197322639559L;

	/** 
	 * 支付宝短链接
	 */
	@ApiField("short_url")
	private String shortUrl;

	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}
	public String getShortUrl( ) {
		return this.shortUrl;
	}

}
