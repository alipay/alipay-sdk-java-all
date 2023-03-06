package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.ad.user.match response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 11:07:18
 */
public class AlipayCommerceTransportAdUserMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 5189151681611499332L;

	/** 
	 * 广告投放端用户ID
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
