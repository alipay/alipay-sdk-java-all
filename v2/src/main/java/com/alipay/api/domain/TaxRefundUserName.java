package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户名
 *
 * @author auto create
 * @since 1.0, 2025-08-19 15:42:47
 */
public class TaxRefundUserName extends AlipayObject {

	private static final long serialVersionUID = 6732729964883213278L;

	/**
	 * 用户的名字
	 */
	@ApiField("first_name")
	private String firstName;

	/**
	 * 全名
	 */
	@ApiField("full_name")
	private String fullName;

	/**
	 * 用户的姓氏
	 */
	@ApiField("last_name")
	private String lastName;

	/**
	 * 中间名
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
