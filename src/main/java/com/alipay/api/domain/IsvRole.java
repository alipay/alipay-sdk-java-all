package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV定义的角色信息
 *
 * @author auto create
 * @since 1.0, 2020-09-27 17:32:48
 */
public class IsvRole extends AlipayObject {

	private static final long serialVersionUID = 1229833414351625832L;

	/**
	 * isv定义的角色的唯一标识
	 */
	@ApiField("role_id")
	private String roleId;

	/**
	 * isv定义的角色名称
	 */
	@ApiField("role_name")
	private String roleName;

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
