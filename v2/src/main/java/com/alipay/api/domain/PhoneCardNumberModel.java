package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 号卡手机号模型
 *
 * @author auto create
 * @since 1.0, 2024-11-08 11:42:16
 */
public class PhoneCardNumberModel extends AlipayObject {

	private static final long serialVersionUID = 8349558158725769942L;

	/**
	 * 手机号校验码
	 */
	@ApiField("check_code")
	private String checkCode;

	/**
	 * 手机号
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	public String getCheckCode() {
		return this.checkCode;
	}
	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
