package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.acp.shortenurl.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-20 21:52:44
 */
public class ZhimaCreditPeAcpShortenurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6836586341323775566L;

	/** 
	 * 转换后的短链
	 */
	@ApiField("shorten_url")
	private String shortenUrl;

	public void setShortenUrl(String shortenUrl) {
		this.shortenUrl = shortenUrl;
	}
	public String getShortenUrl( ) {
		return this.shortenUrl;
	}

}
