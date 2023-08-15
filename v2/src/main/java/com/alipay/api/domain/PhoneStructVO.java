package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电话类型
 *
 * @author auto create
 * @since 1.0, 2023-08-15 11:54:46
 */
public class PhoneStructVO extends AlipayObject {

	private static final long serialVersionUID = 5278385967721481592L;

	/**
	 * 电话号码，包含区号+电话号码的座机号码格式，以及手机号码格式
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	/**
	 * 1-手机号，2-座机
	 */
	@ApiField("phone_type")
	private String phoneType;

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneType() {
		return this.phoneType;
	}
	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

}
