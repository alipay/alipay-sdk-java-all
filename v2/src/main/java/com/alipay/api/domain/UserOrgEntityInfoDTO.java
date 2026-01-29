package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户组织实体信息
 *
 * @author auto create
 * @since 1.0, 2025-10-16 20:25:38
 */
public class UserOrgEntityInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5383457326957691752L;

	/**
	 * 是否企业组织
	 */
	@ApiField("company_flag")
	private Boolean companyFlag;

	/**
	 * 企业实体名称
	 */
	@ApiField("entity_name")
	private String entityName;

	/**
	 * 是否退出组织
	 */
	@ApiField("exit_org_flag")
	private Boolean exitOrgFlag;

	/**
	 * 退出组织时间
	 */
	@ApiField("exit_org_time")
	private Date exitOrgTime;

	/**
	 * 加入组织时间
	 */
	@ApiField("join_org_time")
	private Date joinOrgTime;

	/**
	 * 组织id
	 */
	@ApiField("org_id")
	private String orgId;

	/**
	 * 组织名称
	 */
	@ApiField("org_name")
	private String orgName;

	/**
	 * 通行证id
	 */
	@ApiField("passport_id")
	private String passportId;

	/**
	 * 角色
	 */
	@ApiField("role")
	private String role;

	/**
	 * 根组织ID
	 */
	@ApiField("root_id")
	private String rootId;

	public Boolean getCompanyFlag() {
		return this.companyFlag;
	}
	public void setCompanyFlag(Boolean companyFlag) {
		this.companyFlag = companyFlag;
	}

	public String getEntityName() {
		return this.entityName;
	}
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public Boolean getExitOrgFlag() {
		return this.exitOrgFlag;
	}
	public void setExitOrgFlag(Boolean exitOrgFlag) {
		this.exitOrgFlag = exitOrgFlag;
	}

	public Date getExitOrgTime() {
		return this.exitOrgTime;
	}
	public void setExitOrgTime(Date exitOrgTime) {
		this.exitOrgTime = exitOrgTime;
	}

	public Date getJoinOrgTime() {
		return this.joinOrgTime;
	}
	public void setJoinOrgTime(Date joinOrgTime) {
		this.joinOrgTime = joinOrgTime;
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

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public String getRootId() {
		return this.rootId;
	}
	public void setRootId(String rootId) {
		this.rootId = rootId;
	}

}
