package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.enterprisepay.unsign response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-12 19:54:24
 */
public class AlipayFundEnterprisepayUnsignResponse extends AlipayResponse {

	private static final long serialVersionUID = 1452333335579948323L;

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
