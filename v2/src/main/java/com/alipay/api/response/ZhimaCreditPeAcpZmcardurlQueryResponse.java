package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.acp.zmcardurl.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-01 15:27:49
 */
public class ZhimaCreditPeAcpZmcardurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4642274137275927571L;

	/** 
	 * 芝麻证跳转url，用于分享给其他用户扫描访问
	 */
	@ApiField("skip_url")
	private String skipUrl;

	public void setSkipUrl(String skipUrl) {
		this.skipUrl = skipUrl;
	}
	public String getSkipUrl( ) {
		return this.skipUrl;
	}

}
