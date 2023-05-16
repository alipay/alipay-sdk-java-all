package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.ad.user.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 18:20:14
 */
public class AlipayCommerceTransportAdUserCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6147975551487471679L;

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
