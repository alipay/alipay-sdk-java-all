package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.roster.identity.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-04 16:07:38
 */
public class AlipayCommerceEducateRosterIdentityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8198348394832871483L;

	/** 
	 * 人员所属的部门、学院或班级名称
	 */
	@ApiField("department_name")
	private String departmentName;

	/** 
	 * 学号或者工号
	 */
	@ApiField("employee_no")
	private String employeeNo;

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
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 可以为人员的职位名称，可自定义，默认和角色类型保持一致。
	 */
	@ApiField("role_name")
	private String roleName;

	/** 
	 * 人员角色类型
	 */
	@ApiField("role_type")
	private String roleType;

	/** 
	 * 花名册ID
	 */
	@ApiField("roster_id")
	private String rosterId;

	/** 
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 白名单名称列表
	 */
	@ApiListField("white_name_list")
	@ApiField("string")
	private List<String> whiteNameList;

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentName( ) {
		return this.departmentName;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}
	public String getEmployeeNo( ) {
		return this.employeeNo;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender( ) {
		return this.gender;
	}

	public void setInstId(String instId) {
		this.instId = instId;
	}
	public String getInstId( ) {
		return this.instId;
	}

	public void setInstName(String instName) {
		this.instName = instName;
	}
	public String getInstName( ) {
		return this.instName;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleName( ) {
		return this.roleName;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
	public String getRoleType( ) {
		return this.roleType;
	}

	public void setRosterId(String rosterId) {
		this.rosterId = rosterId;
	}
	public String getRosterId( ) {
		return this.rosterId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setWhiteNameList(List<String> whiteNameList) {
		this.whiteNameList = whiteNameList;
	}
	public List<String> getWhiteNameList( ) {
		return this.whiteNameList;
	}

}
