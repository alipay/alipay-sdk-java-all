package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投保人信息
 *
 * @author auto create
 * @since 1.0, 2023-11-17 15:43:58
 */
public class InsureEmployee extends AlipayObject {

	private static final long serialVersionUID = 4525113883469281364L;

	/**
	 * 证件名称
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型 10: 身份证 23:统一社会代码
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 零工卡卡号
	 */
	@ApiField("employee_card_no")
	private String employeeCardNo;

	/**
	 * 员工工种code信息,按照文档附件规则传值
	 */
	@ApiField("job")
	private String job;

	/**
	 * 职业级别该字段废弃，只需要传工种job 当前字段已废弃(职业级别该字段废弃，只需要传工种job)
	 */
	@ApiField("job_level")
	@Deprecated
	private String jobLevel;

	/**
	 * 外部员工id
	 */
	@ApiField("out_employee_id")
	private String outEmployeeId;

	/**
	 * 电话号码
	 */
	@ApiField("phone")
	private String phone;

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
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

	public String getEmployeeCardNo() {
		return this.employeeCardNo;
	}
	public void setEmployeeCardNo(String employeeCardNo) {
		this.employeeCardNo = employeeCardNo;
	}

	public String getJob() {
		return this.job;
	}
	public void setJob(String job) {
		this.job = job;
	}

	public String getJobLevel() {
		return this.jobLevel;
	}
	public void setJobLevel(String jobLevel) {
		this.jobLevel = jobLevel;
	}

	public String getOutEmployeeId() {
		return this.outEmployeeId;
	}
	public void setOutEmployeeId(String outEmployeeId) {
		this.outEmployeeId = outEmployeeId;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
