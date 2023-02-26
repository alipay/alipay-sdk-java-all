package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑商户角色模型
 *
 * @author auto create
 * @since 1.0, 2018-03-23 11:23:52
 */
public class KoubeiMerchantRole extends AlipayObject {

	private static final long serialVersionUID = 2153962853629272218L;

	/**
	 * 员工数量
	 */
	@ApiField("operator_num")
	private String operatorNum;

	/**
	 * 权限数量
	 */
	@ApiField("permission_num")
	private String permissionNum;

	/**
	 * 角色标识码，如财务
	 */
	@ApiField("role_code")
	private String roleCode;

	/**
	 * 角色ID
	 */
	@ApiField("role_id")
	private String roleId;

	/**
	 * 角色名称
	 */
	@ApiField("role_name")
	private String roleName;

	public String getOperatorNum() {
		return this.operatorNum;
	}
	public void setOperatorNum(String operatorNum) {
		this.operatorNum = operatorNum;
	}

	public String getPermissionNum() {
		return this.permissionNum;
	}
	public void setPermissionNum(String permissionNum) {
		this.permissionNum = permissionNum;
	}

	public String getRoleCode() {
		return this.roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
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
