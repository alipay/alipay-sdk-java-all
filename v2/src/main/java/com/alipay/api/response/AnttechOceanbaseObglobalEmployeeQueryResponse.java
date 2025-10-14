package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.employee.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-01 18:17:38
 */
public class AnttechOceanbaseObglobalEmployeeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1435677672117222314L;

	/** 
	 * "用户部门"
	 */
	@ApiField("dept_name")
	private String deptName;

	/** 
	 * 用户部门编号
	 */
	@ApiField("dept_no")
	private String deptNo;

	/** 
	 * "用户部门简称"
	 */
	@ApiField("dept_short_name")
	private String deptShortName;

	/** 
	 * 用户email
	 */
	@ApiField("email_addr")
	private String emailAddr;

	/** 
	 * 工号
	 */
	@ApiField("emp_id")
	private String empId;

	/** 
	 * 用户真名
	 */
	@ApiField("last_name")
	private String lastName;

	/** 
	 * 用户花名
	 */
	@ApiField("nick_name_cn")
	private String nickNameCn;

	/** 
	 * "主管花名"
	 */
	@ApiField("super_nick_name")
	private String superNickName;

	/** 
	 * "主管工号"
	 */
	@ApiField("super_work_no")
	private String superWorkNo;

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptName( ) {
		return this.deptName;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	public String getDeptNo( ) {
		return this.deptNo;
	}

	public void setDeptShortName(String deptShortName) {
		this.deptShortName = deptShortName;
	}
	public String getDeptShortName( ) {
		return this.deptShortName;
	}

	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}
	public String getEmailAddr( ) {
		return this.emailAddr;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpId( ) {
		return this.empId;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastName( ) {
		return this.lastName;
	}

	public void setNickNameCn(String nickNameCn) {
		this.nickNameCn = nickNameCn;
	}
	public String getNickNameCn( ) {
		return this.nickNameCn;
	}

	public void setSuperNickName(String superNickName) {
		this.superNickName = superNickName;
	}
	public String getSuperNickName( ) {
		return this.superNickName;
	}

	public void setSuperWorkNo(String superWorkNo) {
		this.superWorkNo = superWorkNo;
	}
	public String getSuperWorkNo( ) {
		return this.superWorkNo;
	}

}
