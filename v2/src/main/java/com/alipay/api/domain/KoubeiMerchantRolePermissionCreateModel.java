package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * isv权限保存
 *
 * @author auto create
 * @since 1.0, 2022-06-17 16:43:00
 */
public class KoubeiMerchantRolePermissionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3184892366969779488L;

	/**
	 * isv回传的auth_code，通过auth_code校验当前操作人与商户的关系
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 需要增加的isv权限
	 */
	@ApiListField("permissions_to_add")
	@ApiField("business_permission")
	private List<BusinessPermission> permissionsToAdd;

	/**
	 * 需要删除的权限
	 */
	@ApiListField("permissions_to_delete")
	@ApiField("business_permission")
	private List<BusinessPermission> permissionsToDelete;

	/**
	 * 与principal_type配合使用，当principal_type为ROLE时，principal_id为角色id，当principal_type为OPERATOR时，principal_id为操作员id
	 */
	@ApiField("principal_id")
	private String principalId;

	/**
	 * 与principal_id配合使用，当principal_type为ROLE时，principal_id为角色id，当principal_type为OPERATOR时，principal_id为操作员id
	 */
	@ApiField("principal_type")
	private String principalType;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public List<BusinessPermission> getPermissionsToAdd() {
		return this.permissionsToAdd;
	}
	public void setPermissionsToAdd(List<BusinessPermission> permissionsToAdd) {
		this.permissionsToAdd = permissionsToAdd;
	}

	public List<BusinessPermission> getPermissionsToDelete() {
		return this.permissionsToDelete;
	}
	public void setPermissionsToDelete(List<BusinessPermission> permissionsToDelete) {
		this.permissionsToDelete = permissionsToDelete;
	}

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

	public String getPrincipalType() {
		return this.principalType;
	}
	public void setPrincipalType(String principalType) {
		this.principalType = principalType;
	}

}
