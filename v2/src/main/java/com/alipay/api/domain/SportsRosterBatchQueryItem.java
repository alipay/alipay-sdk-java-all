package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花名册列表
 *
 * @author auto create
 * @since 1.0, 2026-08-11 17:37:52
 */
public class SportsRosterBatchQueryItem extends AlipayObject {

	private static final long serialVersionUID = 7584942883513972143L;

	/**
	 * 部门（xxx/xx/xx 完整路径）
	 */
	@ApiField("department")
	private String department;

	/**
	 * 学工号
	 */
	@ApiField("employee_no")
	private String employeeNo;

	/**
	 * 花名册姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 状态 BIND 已绑定 / UNBIND 未绑定
	 */
	@ApiField("status")
	private String status;

	/**
	 * 花名册人员编码
	 */
	@ApiField("user_code")
	private String userCode;

	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmployeeNo() {
		return this.employeeNo;
	}
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserCode() {
		return this.userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

}
