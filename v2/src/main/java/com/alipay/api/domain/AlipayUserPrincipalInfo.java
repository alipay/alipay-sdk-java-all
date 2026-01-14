package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户主体信息，包含用户支付宝userId、登录名等.
 *
 * @author auto create
 * @since 1.0, 2020-06-12 15:37:26
 */
public class AlipayUserPrincipalInfo extends AlipayObject {

	private static final long serialVersionUID = 2895898427117229328L;

	/**
	 * 用户电子邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 用户的手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 支付宝userId
	 */
	@ApiField("user_id")
	private String userId;

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
