package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电话类型
 *
 * @author auto create
 * @since 1.0, 2024-01-30 10:46:57
 */
public class PhoneStructVO extends AlipayObject {

	private static final long serialVersionUID = 8317757916835236678L;

	/**
	 * 客服链接地址，必须以alipays开头。用户点击链接后可直接进入客服页面进行咨询
	 */
	@ApiField("customer_link")
	private String customerLink;

	/**
	 * 电话号码，包含区号+电话号码的座机号码格式，以及手机号码格式
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	/**
	 * 电话类型
	 */
	@ApiField("phone_type")
	private String phoneType;

	public String getCustomerLink() {
		return this.customerLink;
	}
	public void setCustomerLink(String customerLink) {
		this.customerLink = customerLink;
	}

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
