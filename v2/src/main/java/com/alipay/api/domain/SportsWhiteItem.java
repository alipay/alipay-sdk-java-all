package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-11 17:27:50
 */
public class SportsWhiteItem extends AlipayObject {

	private static final long serialVersionUID = 8526944132735718973L;

	/**
	 * 绑定状态 BIND 已绑定 / UNBIND 未绑定
	 */
	@ApiField("bind_status")
	private String bindStatus;

	/**
	 * 证件号
	 */
	@ApiField("credential_no")
	private String credentialNo;

	/**
	 * 证件类型
	 */
	@ApiField("credential_type")
	private String credentialType;

	/**
	 * 部门名称
	 */
	@ApiField("department")
	private String department;

	/**
	 * 部门编码
	 */
	@ApiField("department_code")
	private String departmentCode;

	/**
	 * 学工号
	 */
	@ApiField("employee_no")
	private String employeeNo;

	/**
	 * 花名册性别
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 花名册姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 身份编码
	 */
	@ApiField("org_role_code")
	private String orgRoleCode;

	/**
	 * 身份名称
	 */
	@ApiField("org_role_name")
	private String orgRoleName;

	/**
	 * 学校组织code
	 */
	@ApiField("organization_code")
	private String organizationCode;

	/**
	 * 花名册编码
	 */
	@ApiField("roster_code")
	private String rosterCode;

	/**
	 * 白名单主键编码
	 */
	@ApiField("white_code")
	private String whiteCode;

	/**
	 * 白名单类型
	 */
	@ApiField("white_type")
	private String whiteType;

	/**
	 * 白名单类型名称
	 */
	@ApiField("white_type_name")
	private String whiteTypeName;

	public String getBindStatus() {
		return this.bindStatus;
	}
	public void setBindStatus(String bindStatus) {
		this.bindStatus = bindStatus;
	}

	public String getCredentialNo() {
		return this.credentialNo;
	}
	public void setCredentialNo(String credentialNo) {
		this.credentialNo = credentialNo;
	}

	public String getCredentialType() {
		return this.credentialType;
	}
	public void setCredentialType(String credentialType) {
		this.credentialType = credentialType;
	}

	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDepartmentCode() {
		return this.departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public String getEmployeeNo() {
		return this.employeeNo;
	}
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOrgRoleCode() {
		return this.orgRoleCode;
	}
	public void setOrgRoleCode(String orgRoleCode) {
		this.orgRoleCode = orgRoleCode;
	}

	public String getOrgRoleName() {
		return this.orgRoleName;
	}
	public void setOrgRoleName(String orgRoleName) {
		this.orgRoleName = orgRoleName;
	}

	public String getOrganizationCode() {
		return this.organizationCode;
	}
	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}

	public String getRosterCode() {
		return this.rosterCode;
	}
	public void setRosterCode(String rosterCode) {
		this.rosterCode = rosterCode;
	}

	public String getWhiteCode() {
		return this.whiteCode;
	}
	public void setWhiteCode(String whiteCode) {
		this.whiteCode = whiteCode;
	}

	public String getWhiteType() {
		return this.whiteType;
	}
	public void setWhiteType(String whiteType) {
		this.whiteType = whiteType;
	}

	public String getWhiteTypeName() {
		return this.whiteTypeName;
	}
	public void setWhiteTypeName(String whiteTypeName) {
		this.whiteTypeName = whiteTypeName;
	}

}
