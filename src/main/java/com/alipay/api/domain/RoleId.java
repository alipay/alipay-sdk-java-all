package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客服角色ID对象
 *
 * @author auto create
 * @since 1.0, 2020-12-09 09:58:12
 */
public class RoleId extends AlipayObject {

	private static final long serialVersionUID = 2864477294711982611L;

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
