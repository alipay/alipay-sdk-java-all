package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.morpho.token.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 00:06:26
 */
public class AlipayOpenMiniMorphoTokenCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2778123779428841639L;

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
