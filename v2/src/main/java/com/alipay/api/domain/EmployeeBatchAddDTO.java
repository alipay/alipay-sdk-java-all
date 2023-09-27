package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量添加的单个员工信息
 *
 * @author auto create
 * @since 1.0, 2023-09-12 16:59:44
 */
public class EmployeeBatchAddDTO extends AlipayObject {

	private static final long serialVersionUID = 1857664356455448641L;

	/**
	 * 员工所属部门
	 */
	@ApiListField("department_ids")
	@ApiField("string")
	private List<String> departmentIds;

	/**
	 * 证件号，需搭配证件类型使用。与加密证件号不可同时传入
	 */
	@ApiField("employee_cert_no")
	private String employeeCertNo;

	/**
	 * 证件类型，搭配证件号使用
	 */
	@ApiField("employee_cert_type")
	private String employeeCertType;

	/**
	 * 员工邮箱，和手机号二选一
	 */
	@ApiField("employee_email")
	private String employeeEmail;

	/**
	 * 员工手机号，和邮箱二选一
	 */
	@ApiField("employee_mobile")
	private String employeeMobile;

	/**
	 * 员工姓名
	 */
	@ApiField("employee_name")
	private String employeeName;

	/**
	 * 员工编号
	 */
	@ApiField("employee_no")
	private String employeeNo;

	/**
	 * 加密证件号（证件号转大写后使用SHA256加密），需搭配证件类型使用。与非加密证件号不可同时存在
	 */
	@ApiField("encrypt_cert_no")
	private String encryptCertNo;

	/**
	 * 加密手机号（使用SHA256进行加密），不可与手机号同时存在
	 */
	@ApiField("encrypt_mobile")
	private String encryptMobile;

	/**
	 * 角色列表，目前只支持填一种角色，默认为USER
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

	public String getEmployeeCertNo() {
		return this.employeeCertNo;
	}
	public void setEmployeeCertNo(String employeeCertNo) {
		this.employeeCertNo = employeeCertNo;
	}

	public String getEmployeeCertType() {
		return this.employeeCertType;
	}
	public void setEmployeeCertType(String employeeCertType) {
		this.employeeCertType = employeeCertType;
	}

	public String getEmployeeEmail() {
		return this.employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
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

	public String getEncryptCertNo() {
		return this.encryptCertNo;
	}
	public void setEncryptCertNo(String encryptCertNo) {
		this.encryptCertNo = encryptCertNo;
	}

	public String getEncryptMobile() {
		return this.encryptMobile;
	}
	public void setEncryptMobile(String encryptMobile) {
		this.encryptMobile = encryptMobile;
	}

	public List<String> getRoleList() {
		return this.roleList;
	}
	public void setRoleList(List<String> roleList) {
		this.roleList = roleList;
	}

}
