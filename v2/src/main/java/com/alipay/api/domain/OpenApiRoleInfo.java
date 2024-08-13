package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户角色信息
 *
 * @author auto create
 * @since 1.0, 2023-09-28 09:33:14
 */
public class OpenApiRoleInfo extends AlipayObject {

	private static final long serialVersionUID = 4141615945316421528L;

	/**
	 * 角色类型
	 */
	@ApiField("role_type")
	private String roleType;

	/**
	 * 角色code
	 */
	@ApiField("sub_role_type")
	private String subRoleType;

	public String getRoleType() {
		return this.roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public String getSubRoleType() {
		return this.subRoleType;
	}
	public void setSubRoleType(String subRoleType) {
		this.subRoleType = subRoleType;
	}

}
