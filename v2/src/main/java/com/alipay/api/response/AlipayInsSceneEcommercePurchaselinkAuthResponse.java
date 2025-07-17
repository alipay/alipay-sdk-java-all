package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.ecommerce.purchaselink.auth response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-19 18:17:30
 */
public class AlipayInsSceneEcommercePurchaselinkAuthResponse extends AlipayResponse {

	private static final long serialVersionUID = 2358717911193349423L;

	/** 
	 * 授权token
	 */
	@ApiField("authed_token")
	private String authedToken;

	/** 
	 * 已授权的订购url
	 */
	@ApiField("authed_url")
	private String authedUrl;

	/** 
	 * 过期时间
	 */
	@ApiField("expiration")
	private Date expiration;

	public void setAuthedToken(String authedToken) {
		this.authedToken = authedToken;
	}
	public String getAuthedToken( ) {
		return this.authedToken;
	}

	public void setAuthedUrl(String authedUrl) {
		this.authedUrl = authedUrl;
	}
	public String getAuthedUrl( ) {
		return this.authedUrl;
	}

	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}
	public Date getExpiration( ) {
		return this.expiration;
	}

}
