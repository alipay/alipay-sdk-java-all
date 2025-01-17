package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 花名册信息导入
 *
 * @author auto create
 * @since 1.0, 2024-12-06 16:01:55
 */
public class AlipayCommerceEducateRosterInfoSaveModel extends AlipayObject {

	private static final long serialVersionUID = 6763426148462417688L;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 部门信息
	 */
	@ApiListField("department_info")
	@ApiField("edu_department_node")
	private List<EduDepartmentNode> departmentInfo;

	/**
	 * 学号或工号
	 */
	@ApiField("employee_no")
	private String employeeNo;

	/**
	 * 过期失效时间
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/**
	 * 性别
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 机构名称
	 */
	@ApiField("inst_name")
	private String instName;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 花名册人员姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 角色名称，不传则使用默认值
	 */
	@ApiField("role_name")
	private String roleName;

	/**
	 * 角色类型
	 */
	@ApiField("role_type")
	private String roleType;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public List<EduDepartmentNode> getDepartmentInfo() {
		return this.departmentInfo;
	}
	public void setDepartmentInfo(List<EduDepartmentNode> departmentInfo) {
		this.departmentInfo = departmentInfo;
	}

	public String getEmployeeNo() {
		return this.employeeNo;
	}
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public Date getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getInstName() {
		return this.instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getRoleName() {
		return this.roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleType() {
		return this.roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

}
