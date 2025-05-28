package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BusinessPermission;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.role.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:36
 */
public class KoubeiMerchantRoleDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4787537744281279356L;

	/** 
	 * 根据主体查询到的主体拥有的角色信息
	 */
	@ApiListField("permissions")
	@ApiField("business_permission")
	private List<BusinessPermission> permissions;

	/** 
	 * 角色码
	 */
	@ApiField("role_code")
	private String roleCode;

	/** 
	 * 人员管理场景角色id
	 */
	@ApiField("role_id")
	private String roleId;

	/** 
	 * 人员管理场景角色名称
	 */
	@ApiField("role_name")
	private String roleName;

	public void setPermissions(List<BusinessPermission> permissions) {
		this.permissions = permissions;
	}
	public List<BusinessPermission> getPermissions( ) {
		return this.permissions;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	public String getRoleCode( ) {
		return this.roleCode;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getRoleId( ) {
		return this.roleId;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleName( ) {
		return this.roleName;
	}

}
