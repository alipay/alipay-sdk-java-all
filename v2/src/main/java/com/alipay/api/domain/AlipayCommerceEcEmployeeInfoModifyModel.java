package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 员工信息修改
 *
 * @author auto create
 * @since 1.0, 2024-07-09 11:19:15
 */
public class AlipayCommerceEcEmployeeInfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6271991325159116562L;

	/**
	 * 员工所属部门。如果不传值，则不更新所属部门
	 */
	@ApiListField("department_ids")
	@ApiField("string")
	private List<String> departmentIds;

	/**
	 * 员工邮箱。如果不传值，则不更新邮箱。
	 */
	@ApiField("employee_email")
	private String employeeEmail;

	/**
	 * 员工id
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 员工手机号。如果不传值，则不更新手机号。
	 */
	@ApiField("employee_mobile")
	private String employeeMobile;

	/**
	 * 员工姓名
	 */
	@ApiField("employee_name")
	private String employeeName;

	/**
	 * 员工工号。如果不传值，则不更新工号。
	 */
	@ApiField("employee_no")
	private String employeeNo;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 个性化信息。如果不传值，则不更新个性化信息。 <a href='https://opendocs.alipay.com/pre-open/0ceh47?pathHash=14fac87c'>详见文档</a>
	 */
	@ApiField("profiles")
	private String profiles;

	/**
	 * 角色列表，目前只支持填一种角色。如果不传值，则不更新角色。
	 */
	@ApiListField("role_list")
	@ApiField("string")
	private List<String> roleList;

	public List<String> getDepartmentIds() {
		return this.departmentIds;
	}
	public void setDepartmentIds(List<String> departmentIds) {
		this.departmentIds = departmentIds;
	}

	public String getEmployeeEmail() {
		return this.employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeMobile() {
		return this.employeeMobile;
	}
	public void setEmployeeMobile(String employeeMobile) {
		this.employeeMobile = employeeMobile;
	}

	public String getEmployeeName() {
		return this.employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeNo() {
		return this.employeeNo;
	}
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getProfiles() {
		return this.profiles;
	}
	public void setProfiles(String profiles) {
		this.profiles = profiles;
	}

	public List<String> getRoleList() {
		return this.roleList;
	}
	public void setRoleList(List<String> roleList) {
		this.roleList = roleList;
	}

}
