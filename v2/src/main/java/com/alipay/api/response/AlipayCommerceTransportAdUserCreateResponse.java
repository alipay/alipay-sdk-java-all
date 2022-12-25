package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.ad.user.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 14:41:31
 */
public class AlipayCommerceTransportAdUserCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3836966828399892525L;

	/** 
	 * 广告系统用户ID
	 */
	@ApiField("ad_user_id")
	private String adUserId;

	public void setAdUserId(String adUserId) {
		this.adUserId = adUserId;
	}
	public String getAdUserId( ) {
		return this.adUserId;
	}

}
