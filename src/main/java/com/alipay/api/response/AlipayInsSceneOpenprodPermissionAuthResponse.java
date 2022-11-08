package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.openprod.permission.auth response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-29 20:41:48
 */
public class AlipayInsSceneOpenprodPermissionAuthResponse extends AlipayResponse {

	private static final long serialVersionUID = 6418514952842313777L;

	/** 
	 * token
	 */
	@ApiField("auth_token")
	private String authToken;

	/** 
	 * 过期时间
	 */
	@ApiField("expiration")
	private Date expiration;

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	public String getAuthToken( ) {
		return this.authToken;
	}

	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}
	public Date getExpiration( ) {
		return this.expiration;
	}

}
