package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.tool.prizesend.auth response.
 * 
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class KoubeiMarketingToolPrizesendAuthResponse extends AlipayResponse {

	private static final long serialVersionUID = 8638112339835859199L;

	/** 
	 * 发奖token，用于校验商户是否有权限给制定用户发奖
	 */
	@ApiField("token")
	private String token;

	public void setToken(String token) {
		this.token = token;
	}
	public String getToken( ) {
		return this.token;
	}

}
