package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.aipay.subscribe.portal.session.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-20 19:32:53
 */
public class AlipayAipaySubscribePortalSessionCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5851335784521281452L;

	/** 
	 * 跳转url过期时间时间戳(毫秒)
	 */
	@ApiField("expire_time")
	private String expireTime;

	/** 
	 * 直接透出给用户的跳转url
	 */
	@ApiField("portal_url")
	private String portalUrl;

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}
	public String getExpireTime( ) {
		return this.expireTime;
	}

	public void setPortalUrl(String portalUrl) {
		this.portalUrl = portalUrl;
	}
	public String getPortalUrl( ) {
		return this.portalUrl;
	}

}
