package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客户创建接口
 *
 * @author auto create
 * @since 1.0, 2026-06-08 19:47:56
 */
public class AlipayTradeCustomerCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6826547464643752821L;

	/**
	 * 客户描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 客户邮箱，和客户手机号需至少传入1个
	 */
	@ApiField("email")
	private String email;

	/**
	 * 客户名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 客户手机号，和客户邮箱需至少传入1个
	 */
	@ApiField("phone")
	private String phone;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
