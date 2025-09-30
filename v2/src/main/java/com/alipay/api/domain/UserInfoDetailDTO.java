package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户基本信息
 *
 * @author auto create
 * @since 1.0, 2024-06-19 17:06:53
 */
public class UserInfoDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 1225425528587767382L;

	/**
	 * 账号信息
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 邮箱地址
	 */
	@ApiField("email")
	private String email;

	/**
	 * 名字
	 */
	@ApiField("first_name")
	private String firstName;

	/**
	 * 姓氏
	 */
	@ApiField("last_name")
	private String lastName;

	/**
	 * 用户的通行证ID
	 */
	@ApiField("passport_id")
	private String passportId;

	/**
	 * 手机号
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassportId() {
		return this.passportId;
	}
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
