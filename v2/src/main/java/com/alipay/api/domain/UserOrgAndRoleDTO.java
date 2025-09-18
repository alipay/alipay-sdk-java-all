package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户组织角色DTO
 *
 * @author auto create
 * @since 1.0, 2025-06-23 15:16:46
 */
public class UserOrgAndRoleDTO extends AlipayObject {

	private static final long serialVersionUID = 3894151578461478219L;

	/**
	 * 组织成员ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 组织ID
	 */
	@ApiField("org_id")
	private String orgId;

	/**
	 * 组织名称
	 */
	@ApiField("org_name")
	private String orgName;

	/**
	 * 用户通行证ID
	 */
	@ApiField("passport_id")
	private String passportId;

	/**
	 * 用户所属组织角色
	 */
	@ApiField("role_type")
	private String roleType;

	/**
	 * 用户子组织角色信息
	 */
	@ApiListField("user_sub_org_and_role_list")
	@ApiField("user_sub_org_and_role_d_t_o")
	private List<UserSubOrgAndRoleDTO> userSubOrgAndRoleList;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return this.orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getPassportId() {
		return this.passportId;
	}
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

	public String getRoleType() {
		return this.roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public List<UserSubOrgAndRoleDTO> getUserSubOrgAndRoleList() {
		return this.userSubOrgAndRoleList;
	}
	public void setUserSubOrgAndRoleList(List<UserSubOrgAndRoleDTO> userSubOrgAndRoleList) {
		this.userSubOrgAndRoleList = userSubOrgAndRoleList;
	}

}
