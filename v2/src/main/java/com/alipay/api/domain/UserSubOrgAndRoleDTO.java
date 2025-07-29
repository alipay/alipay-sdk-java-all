package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户子组织和角色信息DTO
 *
 * @author auto create
 * @since 1.0, 2025-06-23 15:16:46
 */
public class UserSubOrgAndRoleDTO extends AlipayObject {

	private static final long serialVersionUID = 4199662341249481375L;

	/**
	 * 成员id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 组织id
	 */
	@ApiField("org_id")
	private String orgId;

	/**
	 * 组织名
	 */
	@ApiField("org_name")
	private String orgName;

	/**
	 * 用户ID
	 */
	@ApiField("passport_id")
	private String passportId;

	/**
	 * 角色
	 */
	@ApiField("role_type")
	private String roleType;

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

}
