package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询角色信息
 *
 * @author auto create
 * @since 1.0, 2018-05-30 15:42:02
 */
public class KoubeiMerchantOperatorRoleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7578717986732185696L;

	/**
	 * 当前操作员ID
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 角色ID,若传入刚查对应角色ID的信息
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
