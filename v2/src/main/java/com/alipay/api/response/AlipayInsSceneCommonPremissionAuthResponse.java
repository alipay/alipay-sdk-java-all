package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.common.premission.auth response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-30 14:41:35
 */
public class AlipayInsSceneCommonPremissionAuthResponse extends AlipayResponse {

	private static final long serialVersionUID = 8122121626557523385L;

	/** 
	 * 授权token
	 */
	@ApiField("auth_code")
	private String authCode;

	/** 
	 * 过期时间
	 */
	@ApiField("expiration")
	private Date expiration;

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	public String getAuthCode( ) {
		return this.authCode;
	}

	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}
	public Date getExpiration( ) {
		return this.expiration;
	}

}
