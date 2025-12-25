package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑商家中心员工管理，操作员基本信息
 *
 * @author auto create
 * @since 1.0, 2018-03-23 11:31:50
 */
public class OperatorBaseInfo extends AlipayObject {

	private static final long serialVersionUID = 1182238887368747291L;

	/**
	 * 操作员所属部门id
	 */
	@ApiField("dept_id")
	private String deptId;

	/**
	 * 操作员所属部门的部门树
	 */
	@ApiField("dept_path")
	private String deptPath;

	/**
	 * 操作员联系手机
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 操作员别名
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 操作员id
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作员名称
	 */
	@ApiField("operator_name")
	private String operatorName;

	/**
	 * 操作员类型，只区分收银员和非收银员
收银员为“RESTRICTED_CASHIER”，非收银员为“STANDARD_NORMAL”
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 描述当前操作员角色类型，CASHIER为收银员，SHOPKEEPER为店长，只有系统角色才有role_code
	 */
	@ApiField("role_code")
	private String roleCode;

	/**
	 * 操作员所属角色id
	 */
	@ApiField("role_id")
	private String roleId;

	/**
	 * 员工管理里的角色
	 */
	@ApiField("role_name")
	private String roleName;

	/**
	 * 操作员状态值，T为激活，W为未激活
	 */
	@ApiField("status")
	private String status;

	public String getDeptId() {
		return this.deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptPath() {
		return this.deptPath;
	}
	public void setDeptPath(String deptPath) {
		this.deptPath = deptPath;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNickName() {
		return this.nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorName() {
		return this.operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getOperatorType() {
		return this.operatorType;
	}
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

	public String getRoleCode() {
		return this.roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public String getRoleId() {
		return this.roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return this.roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
