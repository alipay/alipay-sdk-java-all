package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户姓名信息
 *
 * @author auto create
 * @since 1.0, 2025-11-19 10:43:58
 */
public class TaxUserNameDto extends AlipayObject {

	private static final long serialVersionUID = 7768528774916532156L;

	/**
	 * first_name
	 */
	@ApiField("first_name")
	private String firstName;

	/**
	 * The full name of the user.
	 */
	@ApiField("full_name")
	private String fullName;

	/**
	 * The last name of the user.
	 */
	@ApiField("last_name")
	private String lastName;

	/**
	 * The middle name of the user.
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
