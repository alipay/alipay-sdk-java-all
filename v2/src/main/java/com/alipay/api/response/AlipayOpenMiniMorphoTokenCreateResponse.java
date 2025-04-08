package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.morpho.token.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 23:05:06
 */
public class AlipayOpenMiniMorphoTokenCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6628953273343341188L;

	/** 
	 * 闪蝶 SDK Token
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
