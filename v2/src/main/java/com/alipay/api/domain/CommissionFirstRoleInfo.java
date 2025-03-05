package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合作伙伴(一级角色)抽佣信息
 *
 * @author auto create
 * @since 1.0, 2024-12-06 16:56:56
 */
public class CommissionFirstRoleInfo extends AlipayObject {

	private static final long serialVersionUID = 1416927225397394974L;

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
	 * 角色抽佣比例，无单位。如0.0400表示为4%的抽佣比例
	 */
	@ApiField("role_rate")
	private String roleRate;

	/**
	 * 角色类型
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
