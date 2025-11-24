package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.insure.link.auth response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-17 15:37:41
 */
public class AlipayInsSceneInsureLinkAuthResponse extends AlipayResponse {

	private static final long serialVersionUID = 2289284987231579243L;

	/** 
	 * authed_token
	 */
	@ApiField("authed_token")
	private String authedToken;

	/** 
	 * 过期时间（s）
	 */
	@ApiField("expiration")
	private Date expiration;

	/** 
	 * 投保url
	 */
	@ApiField("insure_url")
	private String insureUrl;

	public void setAuthedToken(String authedToken) {
		this.authedToken = authedToken;
	}
	public String getAuthedToken( ) {
		return this.authedToken;
	}

	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}
	public Date getExpiration( ) {
		return this.expiration;
	}

	public void setInsureUrl(String insureUrl) {
		this.insureUrl = insureUrl;
	}
	public String getInsureUrl( ) {
		return this.insureUrl;
	}

}
