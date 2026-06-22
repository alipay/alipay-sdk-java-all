package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结果数据
 *
 * @author auto create
 * @since 1.0, 2026-04-28 15:27:49
 */
public class AuthResult extends AlipayObject {

	private static final long serialVersionUID = 7531411771313387161L;

	/**
	 * 交换令牌。用于获取用户信息。
	 */
	@ApiField("access_token")
	private String accessToken;

	/**
	 * 交换令牌的有效期，单位秒。
	 */
	@ApiField("expires_in")
	private String expiresIn;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 刷新令牌有效期,单位秒
	 */
	@ApiField("re_expires_in")
	private String reExpiresIn;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAccessToken() {
		return this.accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getExpiresIn() {
		return this.expiresIn;
	}
	public void setExpiresIn(String expiresIn) {
		this.expiresIn = expiresIn;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getReExpiresIn() {
		return this.reExpiresIn;
	}
	public void setReExpiresIn(String reExpiresIn) {
		this.reExpiresIn = reExpiresIn;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
