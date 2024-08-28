package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 注册OceanBase官网账号
 *
 * @author auto create
 * @since 1.0, 2024-04-17 13:50:26
 */
public class AnttechOceanbasePassportCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5885914638343728735L;

	/**
	 * 登录凭证 取值为加密后的登录凭证值
	 */
	@ApiField("credential")
	private String credential;

	/**
	 * 邮箱 取值为加密后的邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 手机号  取值为加密后的手机号码
	 */
	@ApiField("mobile_phone")
	private String mobilePhone;

	public String getCredential() {
		return this.credential;
	}
	public void setCredential(String credential) {
		this.credential = credential;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobilePhone() {
		return this.mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

}
