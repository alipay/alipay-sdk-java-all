package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.orderauth.token.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-13 11:17:41
 */
public class AlipayCommerceTransportOrderauthTokenApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7254255246934524374L;

	/** 
	 * 无需乱码，用来做用户授权
	 */
	@ApiField("industry_auth_token")
	private String industryAuthToken;

	/** 
	 * 支付宝用户的唯一开放Id
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 支付宝用户的userId
	 */
	@ApiField("user_id")
	private String userId;

	public void setIndustryAuthToken(String industryAuthToken) {
		this.industryAuthToken = industryAuthToken;
	}
	public String getIndustryAuthToken( ) {
		return this.industryAuthToken;
	}

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
