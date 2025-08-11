package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客服角色ID对象
 *
 * @author auto create
 * @since 1.0, 2023-06-09 10:12:26
 */
public class RoleId extends AlipayObject {

	private static final long serialVersionUID = 3152693122237523322L;

	/**
	 * 部门id（即租户实例ID、数据权限ID）
	 */
	@ApiField("ccs_instance_id")
	private String ccsInstanceId;

	/**
	 * 角色ID
	 */
	@ApiField("role_id")
	private String roleId;

	public String getCcsInstanceId() {
		return this.ccsInstanceId;
	}
	public void setCcsInstanceId(String ccsInstanceId) {
		this.ccsInstanceId = ccsInstanceId;
	}

	public String getRoleId() {
		return this.roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

}
