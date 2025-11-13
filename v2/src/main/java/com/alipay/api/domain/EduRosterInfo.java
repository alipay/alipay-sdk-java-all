package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 教育花名册详情
 *
 * @author auto create
 * @since 1.0, 2025-04-17 20:04:19
 */
public class EduRosterInfo extends AlipayObject {

	private static final long serialVersionUID = 2556254833597556543L;

	/**
	 * 绑定状态
	 */
	@ApiField("bind_status")
	private Boolean bindStatus;

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
	 * 部门信息 当前字段已废弃(该字段是否数组类型定义错误)
	 */
	@ApiField("department_info")
	@Deprecated
	private EduDepartmentNode departmentInfo;

	/**
	 * 部门信息
	 */
	@ApiListField("department_info_list")
	@ApiField("edu_department_node")
	private List<EduDepartmentNode> departmentInfoList;

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
	 * 失效过期时间
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
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 组织节点信息列表，一个人可能属于多个组织节点，列表记录的都是最低级组织部门节点
	 */
	@ApiListField("node_info_list")
	@ApiField("edu_node_info")
	private List<EduNodeInfo> nodeInfoList;

	/**
	 * 角色信息列表
	 */
	@ApiListField("role_info_list")
	@ApiField("edu_role_info")
	private List<EduRoleInfo> roleInfoList;

	/**
	 * 角色类型名称
	 */
	@ApiField("role_name")
	private String roleName;

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

	public Boolean getBindStatus() {
		return this.bindStatus;
	}
	public void setBindStatus(Boolean bindStatus) {
		this.bindStatus = bindStatus;
	}

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

	public EduDepartmentNode getDepartmentInfo() {
		return this.departmentInfo;
	}
	public void setDepartmentInfo(EduDepartmentNode departmentInfo) {
		this.departmentInfo = departmentInfo;
	}

	public List<EduDepartmentNode> getDepartmentInfoList() {
		return this.departmentInfoList;
	}
	public void setDepartmentInfoList(List<EduDepartmentNode> departmentInfoList) {
		this.departmentInfoList = departmentInfoList;
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

	public List<EduNodeInfo> getNodeInfoList() {
		return this.nodeInfoList;
	}
	public void setNodeInfoList(List<EduNodeInfo> nodeInfoList) {
		this.nodeInfoList = nodeInfoList;
	}

	public List<EduRoleInfo> getRoleInfoList() {
		return this.roleInfoList;
	}
	public void setRoleInfoList(List<EduRoleInfo> roleInfoList) {
		this.roleInfoList = roleInfoList;
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

	public String getRosterId() {
		return this.rosterId;
	}
	public void setRosterId(String rosterId) {
		this.rosterId = rosterId;
	}

}
