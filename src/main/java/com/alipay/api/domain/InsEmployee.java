package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险域内企业员工模型
 *
 * @author auto create
 * @since 1.0, 2022-06-28 15:42:41
 */
public class InsEmployee extends AlipayObject {

	private static final long serialVersionUID = 6249951698124372148L;

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
	 * 证件类型（数字字符串）, 10: 身份证 23:统一社会代码
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 员工工种信息
	 */
	@ApiField("job")
	private String job;

	/**
	 * 职业级别。 第一级：1 第二级：2 ...
	 */
	@ApiField("job_level")
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
