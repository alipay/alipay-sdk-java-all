package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运动打卡修改学生信息
 *
 * @author auto create
 * @since 1.0, 2026-08-11 17:32:51
 */
public class AlipayCommerceEducateSportsRosterModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1631186535987667588L;

	/**
	 * 证件号
	 */
	@ApiField("credential_no")
	private String credentialNo;

	/**
	 * 证件类型，仅支持身份证，护照
	 */
	@ApiField("credential_type")
	private String credentialType;

	/**
	 * 学生所属部门编码
	 */
	@ApiField("department_code")
	private String departmentCode;

	/**
	 * 学工号
	 */
	@ApiField("employee_no")
	private String employeeNo;

	/**
	 * 性别
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 失效时间
	 */
	@ApiField("invalid_date")
	private String invalidDate;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 组织角色编码
	 */
	@ApiField("org_role_code")
	private String orgRoleCode;

	/**
	 * 学校组织code
	 */
	@ApiField("organization_code")
	private String organizationCode;

	/**
	 * 手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 花名册人员编码
	 */
	@ApiField("roster_code")
	private String rosterCode;

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

	public String getInvalidDate() {
		return this.invalidDate;
	}
	public void setInvalidDate(String invalidDate) {
		this.invalidDate = invalidDate;
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

	public String getOrganizationCode() {
		return this.organizationCode;
	}
	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRosterCode() {
		return this.rosterCode;
	}
	public void setRosterCode(String rosterCode) {
		this.rosterCode = rosterCode;
	}

}
