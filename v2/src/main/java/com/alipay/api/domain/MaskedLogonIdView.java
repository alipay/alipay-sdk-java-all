package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 脱敏登录名视图
 *
 * @author auto create
 * @since 1.0, 2019-01-26 16:32:49
 */
public class MaskedLogonIdView extends AlipayObject {

	private static final long serialVersionUID = 6889894817628517379L;

	/**
	 * 脱敏后的支付宝邮箱登录名，如果用户没有邮箱登录名，则返回空。
	 */
	@ApiField("email")
	private String email;

	/**
	 * 脱敏后的手机号登录名，如果用户没有手机号登录名，则返回空。大陆手机为11位数字，非大陆由地区码、横杠和号码拼接而成。
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
