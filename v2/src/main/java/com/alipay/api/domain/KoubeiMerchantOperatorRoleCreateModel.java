package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑操作员角色新增或者修改
 *
 * @author auto create
 * @since 1.0, 2018-05-30 15:42:52
 */
public class KoubeiMerchantOperatorRoleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7189862477455385755L;

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

	/**
	 * 角色名称，修改时必填
	 */
	@ApiField("role_name")
	private String roleName;

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

	public String getRoleName() {
		return this.roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

}
