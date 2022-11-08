package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 添加员工
 *
 * @author auto create
 * @since 1.0, 2022-11-04 16:25:15
 */
public class AlipayCommerceEcEmployeeAddModel extends AlipayObject {

	private static final long serialVersionUID = 5212158869612434172L;

	/**
	 * 员工所属部门
	 */
	@ApiListField("department_ids")
	@ApiField("string")
	private List<String> departmentIds;

	/**
	 * 员工邮箱
	 */
	@ApiField("employee_email")
	private String employeeEmail;

	/**
	 * 员工手机号
1.和identity二选一
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
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 身份
1.和employee_mobile二选一
2.对应身份类型进行传参，企业支付宝登录账号(支持手机号或者邮箱)或企业支付宝会员id(对应2088开头的支付宝会员id)
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 身份类型
ALIPAY_LOGON_ID(企业支付宝登录账号)
ALIPAY_USER_ID(企业支付宝会员id)
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 角色列表，目前只支持填一种角色，默认为USER
USER 普通员工
ADMIN 管理员
SUPER_ADMIN 超级管理员
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

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public List<String> getRoleList() {
		return this.roleList;
	}
	public void setRoleList(List<String> roleList) {
		this.roleList = roleList;
	}

}
