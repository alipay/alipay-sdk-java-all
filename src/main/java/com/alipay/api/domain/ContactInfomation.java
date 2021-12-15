package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联系人模型
 *
 * @author auto create
 * @since 1.0, 2020-09-22 15:46:29
 */
public class ContactInfomation extends AlipayObject {

	private static final long serialVersionUID = 5265851271712711877L;

	/**
	 * 姓名
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * email
	 */
	@ApiField("email")
	private String email;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 电话号码
	 */
	@ApiField("phone")
	private String phone;

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

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

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
