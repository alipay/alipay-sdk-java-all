package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.iotfm.plugaddr.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-24 14:01:46
 */
public class AlipayCommerceMedicalIotfmPlugaddrQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5875522444345463461L;

	/** 
	 * 访问令牌
	 */
	@ApiField("access_token")
	private String accessToken;

	/** 
	 * 插件地址
	 */
	@ApiField("url")
	private String url;

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getAccessToken( ) {
		return this.accessToken;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
