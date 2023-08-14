package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序应用授权信息
 *
 * @author auto create
 * @since 1.0, 2023-05-30 17:38:30
 */
public class MiniAppAuthInfo extends AlipayObject {

	private static final long serialVersionUID = 6724549819888727448L;

	/**
	 * 授权小程序id
	 */
	@ApiField("auth_app_id")
	private String authAppId;

	/**
	 * 授权时间
	 */
	@ApiField("auth_time")
	private Date authTime;

	/**
	 * 三方应用id
	 */
	@ApiField("isv_app_id")
	private String isvAppId;

	/**
	 * 小程序应用授权token
	 */
	@ApiField("mini_app_token")
	private String miniAppToken;

	public String getAuthAppId() {
		return this.authAppId;
	}
	public void setAuthAppId(String authAppId) {
		this.authAppId = authAppId;
	}

	public Date getAuthTime() {
		return this.authTime;
	}
	public void setAuthTime(Date authTime) {
		this.authTime = authTime;
	}

	public String getIsvAppId() {
		return this.isvAppId;
	}
	public void setIsvAppId(String isvAppId) {
		this.isvAppId = isvAppId;
	}

	public String getMiniAppToken() {
		return this.miniAppToken;
	}
	public void setMiniAppToken(String miniAppToken) {
		this.miniAppToken = miniAppToken;
	}

}
