package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户信息
 *
 * @author auto create
 * @since 1.0, 2020-05-12 12:29:22
 */
public class UserDInfo extends AlipayObject {

	private static final long serialVersionUID = 8356166369828541255L;

	/**
	 * 用户登陆号（手机号）
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 用户蚂蚁身份id
	 */
	@ApiField("user_id")
	private String userId;

	public String getLoginId() {
		return this.loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
