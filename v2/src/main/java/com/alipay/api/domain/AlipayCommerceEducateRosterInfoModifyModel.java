package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 花名册信息修改
 *
 * @author auto create
 * @since 1.0, 2025-04-17 20:02:54
 */
public class AlipayCommerceEducateRosterInfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6419739987888386953L;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件号尾号
	 */
	@ApiField("cert_no_tail")
	private String certNoTail;

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
	 * 邮箱
	 */
	@ApiField("email")
	private String email;

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
	 * 机构ID
	 */
	@ApiField("inst_id")
	private String instId;

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
	 * 组织节点ID列表
	 */
	@ApiListField("node_id_list")
	@ApiField("string")
	private List<String> nodeIdList;

	/**
	 * 角色名称
	 */
	@ApiField("role_name")
	private String roleName;

	/**
	 * 角色名称列表
	 */
	@ApiListField("role_name_list")
	@ApiField("string")
	private List<String> roleNameList;

	/**
	 * 角色类型
	 */
	@ApiField("role_type")
	private String roleType;

	/**
	 * 花名册ID
	 */
	@ApiField("roster_id")
	private String rosterId;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertNoTail() {
		return this.certNoTail;
	}
	public void setCertNoTail(String certNoTail) {
		this.certNoTail = certNoTail;
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

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
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

	public List<String> getNodeIdList() {
		return this.nodeIdList;
	}
	public void setNodeIdList(List<String> nodeIdList) {
		this.nodeIdList = nodeIdList;
	}

	public String getRoleName() {
		return this.roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<String> getRoleNameList() {
		return this.roleNameList;
	}
	public void setRoleNameList(List<String> roleNameList) {
		this.roleNameList = roleNameList;
	}

	public String getRoleType() {
		return this.roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public String getRosterId() {
		return this.rosterId;
	}
	public void setRosterId(String rosterId) {
		this.rosterId = rosterId;
	}

}
