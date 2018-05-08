package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 角色删除
 *
 * @author auto create
 * @since 1.0, 2018-03-23 11:50:24
 */
public class KoubeiMerchantOperatorRoleDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2588667768897141819L;

	/**
	 * 操作员ID
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 角色ID
	 */
	@ApiField("role_id")
	private String roleId;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getRoleId() {
		return this.roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

}
