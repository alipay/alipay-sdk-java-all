package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户名称模型
 *
 * @author auto create
 * @since 1.0, 2021-10-08 11:24:47
 */
public class TuitionUserName extends AlipayObject {

	private static final long serialVersionUID = 7715353649472621568L;

	/**
	 * 姓名姓氏
	 */
	@ApiField("first_name")
	private String firstName;

	/**
	 * 完整姓名
	 */
	@ApiField("full_name")
	private String fullName;

	/**
	 * 姓名最后的名字
	 */
	@ApiField("last_name")
	private String lastName;

	/**
	 * 姓名中间的名字
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
