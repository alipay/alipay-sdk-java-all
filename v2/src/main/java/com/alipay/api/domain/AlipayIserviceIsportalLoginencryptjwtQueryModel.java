package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据token查询加密的登录态jwt信息
 *
 * @author auto create
 * @since 1.0, 2025-05-08 16:35:19
 */
public class AlipayIserviceIsportalLoginencryptjwtQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4124673249711171322L;

	/**
	 * 过期秒数
	 */
	@ApiField("expiry_time")
	private Long expiryTime;

	/**
	 * 令牌
	 */
	@ApiField("login_token")
	private String loginToken;

	public Long getExpiryTime() {
		return this.expiryTime;
	}
	public void setExpiryTime(Long expiryTime) {
		this.expiryTime = expiryTime;
	}

	public String getLoginToken() {
		return this.loginToken;
	}
	public void setLoginToken(String loginToken) {
		this.loginToken = loginToken;
	}

}
