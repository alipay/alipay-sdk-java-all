package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * OceanBase官网账号信息绑定
 *
 * @author auto create
 * @since 1.0, 2024-12-19 19:07:51
 */
public class AnttechOceanbasePassaccountBindModel extends AlipayObject {

	private static final long serialVersionUID = 5717453824565237546L;

	/**
	 * 邮箱 取值为加密后的邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 手机号 取值为加密后的手机号码
	 */
	@ApiField("mobile_phone")
	private String mobilePhone;

	/**
	 * 用户通行证id，为OB注册账号id
	 */
	@ApiField("passport_id")
	private String passportId;

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

	public String getPassportId() {
		return this.passportId;
	}
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

}
