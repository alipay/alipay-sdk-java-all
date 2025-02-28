package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量添加员工接口，添加失败的员工信息
 *
 * @author auto create
 * @since 1.0, 2024-05-22 13:32:17
 */
public class EcEmployeeBatchAddFailInfo extends AlipayObject {

	private static final long serialVersionUID = 8812748396844977394L;

	/**
	 * 证件号
	 */
	@ApiField("employee_cert_no")
	private String employeeCertNo;

	/**
	 * 证件类型
	 */
	@ApiField("employee_cert_type")
	private String employeeCertType;

	/**
	 * 员工邮箱
	 */
	@ApiField("employee_email")
	private String employeeEmail;

	/**
	 * 员工手机号
	 */
	@ApiField("employee_mobile")
	private String employeeMobile;

	/**
	 * 员工姓名
	 */
	@ApiField("employee_name")
	private String employeeName;

	/**
	 * 员工编号
	 */
	@ApiField("employee_no")
	private String employeeNo;

	/**
	 * 加密证件号（证件号转大写后使用SHA256加密）
	 */
	@ApiField("encrypt_cert_no")
	private String encryptCertNo;

	/**
	 * 加密手机号（使用SHA256进行加密）
	 */
	@ApiField("encrypt_mobile")
	private String encryptMobile;

	/**
	 * 添加失败原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/**
	 * 个性化信息 <a href='https://opendocs.alipay.com/pre-open/0ceh47?pathHash=14fac87c'>详见文档</a>
	 */
	@ApiField("profiles")
	private String profiles;

	public String getEmployeeCertNo() {
		return this.employeeCertNo;
	}
	public void setEmployeeCertNo(String employeeCertNo) {
		this.employeeCertNo = employeeCertNo;
	}

	public String getEmployeeCertType() {
		return this.employeeCertType;
	}
	public void setEmployeeCertType(String employeeCertType) {
		this.employeeCertType = employeeCertType;
	}

	public String getEmployeeEmail() {
		return this.employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public String getEmployeeMobile() {
		return this.employeeMobile;
	}
	public void setEmployeeMobile(String employeeMobile) {
		this.employeeMobile = employeeMobile;
	}

	public String getEmployeeName() {
		return this.employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeNo() {
		return this.employeeNo;
	}
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getEncryptCertNo() {
		return this.encryptCertNo;
	}
	public void setEncryptCertNo(String encryptCertNo) {
		this.encryptCertNo = encryptCertNo;
	}

	public String getEncryptMobile() {
		return this.encryptMobile;
	}
	public void setEncryptMobile(String encryptMobile) {
		this.encryptMobile = encryptMobile;
	}

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public String getProfiles() {
		return this.profiles;
	}
	public void setProfiles(String profiles) {
		this.profiles = profiles;
	}

}
