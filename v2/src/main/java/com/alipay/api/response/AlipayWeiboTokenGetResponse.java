package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.weibo.token.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 23:09:41
 */
public class AlipayWeiboTokenGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3355696221751178844L;

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
