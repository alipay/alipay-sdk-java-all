package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 员工信息修改
 *
 * @author auto create
 * @since 1.0, 2025-04-09 15:56:18
 */
public class AlipayCommerceEcEmployeeInfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4596378646967819647L;

	/**
	 * 员工所属核算主体，核算主体可用于管控不同员工的出资方式，建议和不同出资账户关联，一个员工只能有一个核算主体。
	 */
	@ApiListField("accounting_entity_ids")
	@ApiField("string")
	private List<String> accountingEntityIds;

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
	 * 员工标签，用于员工的打标分类，后续费控管理可使用标签进行控制，支持输入多个标签，如“差旅员工，用餐员工”等；<br/><br/>
使用场景：1. 请严格对标签分类，不要滥用员工标签，否则影响员工和费控管理； 2. 一个员工最多10个标签，如无必要请勿使用；3. 标签名只能包含字母（大小写）、数字或中文字符
	 */
	@ApiListField("label_names")
	@ApiField("string")
	private List<String> labelNames;

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
