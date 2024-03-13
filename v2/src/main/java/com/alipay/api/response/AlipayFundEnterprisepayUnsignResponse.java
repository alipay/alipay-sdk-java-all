package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.enterprisepay.unsign response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 19:31:45
 */
public class AlipayFundEnterprisepayUnsignResponse extends AlipayResponse {

	private static final long serialVersionUID = 2145644163419547847L;

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
