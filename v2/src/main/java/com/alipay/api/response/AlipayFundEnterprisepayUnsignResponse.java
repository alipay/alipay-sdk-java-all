package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.enterprisepay.unsign response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-07 17:13:24
 */
public class AlipayFundEnterprisepayUnsignResponse extends AlipayResponse {

	private static final long serialVersionUID = 8426712721163423746L;

	/** 
	 * 解约凭证
	 */
	@ApiField("unsign_token")
	private String unsignToken;

	/** 
	 * 解约链接
	 */
	@ApiField("unsign_url")
	private String unsignUrl;

	public void setUnsignToken(String unsignToken) {
		this.unsignToken = unsignToken;
	}
	public String getUnsignToken( ) {
		return this.unsignToken;
	}

	public void setUnsignUrl(String unsignUrl) {
		this.unsignUrl = unsignUrl;
	}
	public String getUnsignUrl( ) {
		return this.unsignUrl;
	}

}
