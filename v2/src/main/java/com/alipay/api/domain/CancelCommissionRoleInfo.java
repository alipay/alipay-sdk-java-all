package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-01-05 10:07:23
 */
public class CancelCommissionRoleInfo extends AlipayObject {

	private static final long serialVersionUID = 1282116388363121233L;

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

}
