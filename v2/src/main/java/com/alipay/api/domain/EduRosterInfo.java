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
 * @since 1.0, 2024-11-08 16:13:53
 */
public class EduRosterInfo extends AlipayObject {

	private static final long serialVersionUID = 8163424263346612672L;

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
	 * 机构ID
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
	 * 角色名称，可自定义，未自定义则使用默认值
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

	public String getRosterId() {
		return this.rosterId;
	}
	public void setRosterId(String rosterId) {
		this.rosterId = rosterId;
	}

}
