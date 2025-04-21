package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-03-19 14:12:27
 */
public class CommissionRoleInfo extends AlipayObject {

	private static final long serialVersionUID = 2252197118363257518L;

	/**
	 * 合作伙伴支付宝账号名称
	 */
	@ApiField("role_account_name")
	private String roleAccountName;

	/**
	 * 合作伙伴支付宝账号
	 */
	@ApiField("role_alipay_account")
	private String roleAlipayAccount;

	/**
	 * 一级/二级
	 */
	@ApiField("role_level")
	private String roleLevel;

	/**
	 * 抽佣比例
	 */
	@ApiField("role_rate")
	private String roleRate;

	/**
	 * 角色类型，供应商等
	 */
	@ApiField("role_type")
	private String roleType;

	public String getRoleAccountName() {
		return this.roleAccountName;
	}
	public void setRoleAccountName(String roleAccountName) {
		this.roleAccountName = roleAccountName;
	}

	public String getRoleAlipayAccount() {
		return this.roleAlipayAccount;
	}
	public void setRoleAlipayAccount(String roleAlipayAccount) {
		this.roleAlipayAccount = roleAlipayAccount;
	}

	public String getRoleLevel() {
		return this.roleLevel;
	}
	public void setRoleLevel(String roleLevel) {
		this.roleLevel = roleLevel;
	}

	public String getRoleRate() {
		return this.roleRate;
	}
	public void setRoleRate(String roleRate) {
		this.roleRate = roleRate;
	}

	public String getRoleType() {
		return this.roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

}
