package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.weibo.token.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayWeiboTokenGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6177882199998635651L;

	/** 
	 * 访问账单查询的临时令牌
	 */
	@ApiField("access_token")
	private String accessToken;

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getAccessToken( ) {
		return this.accessToken;
	}

}
