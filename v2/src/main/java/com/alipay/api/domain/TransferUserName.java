package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户姓名模型
 *
 * @author auto create
 * @since 1.0, 2023-09-04 10:11:33
 */
public class TransferUserName extends AlipayObject {

	private static final long serialVersionUID = 8524228986575856458L;

	/**
	 * 姓
	 */
	@ApiField("first_name")
	private String firstName;

	/**
	 * 全名
	 */
	@ApiField("full_name")
	private String fullName;

	/**
	 * 名
	 */
	@ApiField("last_name")
	private String lastName;

	/**
	 * 中间名字
	 */
	@ApiField("middle_name")
	private String middleName;

	/**
	 * 本地名字
	 */
	@ApiField("native_name")
	private String nativeName;

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

	public String getNativeName() {
		return this.nativeName;
	}
	public void setNativeName(String nativeName) {
		this.nativeName = nativeName;
	}

}
