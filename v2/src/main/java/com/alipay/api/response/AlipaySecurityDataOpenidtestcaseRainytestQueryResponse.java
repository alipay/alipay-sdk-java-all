package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.data.openidtestcase.rainytest.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-09 16:45:05
 */
public class AlipaySecurityDataOpenidtestcaseRainytestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6471776758618311267L;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
