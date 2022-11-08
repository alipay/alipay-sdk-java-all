package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户姓名
 *
 * @author auto create
 * @since 1.0, 2020-06-17 18:10:48
 */
public class UserName extends AlipayObject {

	private static final long serialVersionUID = 2618369446853952236L;

	/**
	 * User's first name
	 */
	@ApiField("first_name")
	private String firstName;

	/**
	 * User's full name
	 */
	@ApiField("full_name")
	private String fullName;

	/**
	 * User's last name
	 */
	@ApiField("last_name")
	private String lastName;

	/**
	 * User's middle name
	 */
	@ApiField("middle_name")
	private String middleName;

	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFullName() {
		return this.fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return this.middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

}
