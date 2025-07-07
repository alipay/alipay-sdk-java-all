package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改角色
 *
 * @author auto create
 * @since 1.0, 2025-04-17 17:32:43
 */
public class AlipayCommerceEducateRoleInfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4635219656375538755L;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 角色描述
	 */
	@ApiField("role_desc")
	private String roleDesc;

	/**
	 * 角色ID
	 */
	@ApiField("role_id")
	private String roleId;

	/**
	 * 角色图片URL
	 */
	@ApiField("role_logo")
	private String roleLogo;

	/**
	 * 角色名称
	 */
	@ApiField("role_name")
	private String roleName;

	/**
	 * 角色类型
	 */
	@ApiField("role_type")
	private String roleType;

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getRoleDesc() {
		return this.roleDesc;
	}
	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	public String getRoleId() {
		return this.roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleLogo() {
		return this.roleLogo;
	}
	public void setRoleLogo(String roleLogo) {
		this.roleLogo = roleLogo;
	}

	public String getRoleName() {
		return this.roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleType() {
		return this.roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

}
