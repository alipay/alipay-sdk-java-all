package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.userskip.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-30 16:52:42
 */
public class AlipayCommerceMedicalInsuranceUserskipQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7725345445282235847L;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * token+特殊参数+渠道
	 */
	@ApiField("skip_url")
	private String skipUrl;

	/** 
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 标识用户的token
	 */
	@ApiField("user_token")
	private String userToken;

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setSkipUrl(String skipUrl) {
		this.skipUrl = skipUrl;
	}
	public String getSkipUrl( ) {
		return this.skipUrl;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}
	public String getUserToken( ) {
		return this.userToken;
	}

}
