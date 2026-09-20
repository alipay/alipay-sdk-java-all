package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-10 15:45:12
 */
public class PhoneNumberItem extends AlipayObject {

	private static final long serialVersionUID = 8651272233198659423L;

	/**
	 * 电话号码（下拉选中值，对应任务outboundCaller）
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	/**
	 * 用途
	 */
	@ApiField("phone_usage")
	private String phoneUsage;

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneUsage() {
		return this.phoneUsage;
	}
	public void setPhoneUsage(String phoneUsage) {
		this.phoneUsage = phoneUsage;
	}

}
