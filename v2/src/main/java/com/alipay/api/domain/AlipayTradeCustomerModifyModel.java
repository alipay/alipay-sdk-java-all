package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户信息修改
 *
 * @author auto create
 * @since 1.0, 2026-10-09 13:37:57
 */
public class AlipayTradeCustomerModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8259929941947724332L;

	/**
	 * 企业信息
	 */
	@ApiField("corporation_info")
	private CorporationInfo corporationInfo;

	/**
	 * 需要修改的客户id
	 */
	@ApiField("customer_id")
	private String customerId;

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
	 * 客户手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 用户类型，PRIVATE-个人用户；CORPORATION-企业用户
	 */
	@ApiField("type")
	private String type;

	public CorporationInfo getCorporationInfo() {
		return this.corporationInfo;
	}
	public void setCorporationInfo(CorporationInfo corporationInfo) {
		this.corporationInfo = corporationInfo;
	}

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

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

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
