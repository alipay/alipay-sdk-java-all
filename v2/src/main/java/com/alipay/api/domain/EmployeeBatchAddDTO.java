package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量添加的单个员工信息
 *
 * @author auto create
 * @since 1.0, 2025-04-09 15:57:21
 */
public class EmployeeBatchAddDTO extends AlipayObject {

	private static final long serialVersionUID = 7455943334218813678L;

	/**
	 * 员工所属核算主体，核算主体可用于管控不同员工的出资方式，建议和不同出资账户关联
	 */
	@ApiListField("accounting_entity_ids")
	@ApiField("string")
	private List<String> accountingEntityIds;

	/**
	 * 员工所属部门
	 */
	@ApiListField("department_ids")
	@ApiField("string")
	private List<String> departmentIds;

	/**
	 * 证件号
	 */
	@ApiField("employee_cert_no")
	private String employeeCertNo;

	/**
	 * 证件类型
	 */
	@ApiField("employee_cert_type")
	private String employeeCertType;

	/**
	 * 员工邮箱
	 */
	@ApiField("employee_email")
	private String employeeEmail;

	/**
	 * 员工手机号
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
	 * 加密证件号（证件号转大写后使用SHA256加密）
	 */
	@ApiField("encrypt_cert_no")
	private String encryptCertNo;

	/**
	 * 加密手机号（使用SHA256进行加密）
	 */
	@ApiField("encrypt_mobile")
	private String encryptMobile;

	/**
	 * 员工标签，用于员工的打标分类，后续费控管理可使用标签进行控制，支持输入多个标签，如“差旅员工，用餐员工”等
	 */
	@ApiListField("label_names")
	@ApiField("string")
	private List<String> labelNames;

	/**
	 * 个性化信息 <a href='https://opendocs.alipay.com/pre-open/0ceh47?pathHash=14fac87c'>详见文档</a>
	 */
	@ApiField("profiles")
	private String profiles;

	/**
	 * 角色列表
	 */
	@ApiListField("role_list")
	@ApiField("string")
	private List<String> roleList;

	public List<String> getAccountingEntityIds() {
		return this.accountingEntityIds;
	}
	public void setAccountingEntityIds(List<String> accountingEntityIds) {
		this.accountingEntityIds = accountingEntityIds;
	}

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

	public List<String> getLabelNames() {
		return this.labelNames;
	}
	public void setLabelNames(List<String> labelNames) {
		this.labelNames = labelNames;
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
