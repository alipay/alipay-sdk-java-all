package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商务花呗用户信息同步
 *
 * @author auto create
 * @since 1.0, 2020-08-04 14:36:47
 */
public class AlipayPcreditHuabeiEnterpriseUserinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2475799199735856143L;

	/**
	 * 商务花呗用户协议id
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 员工在支付宝的用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 员工所在部门名称
	 */
	@ApiField("dept_name")
	private String deptName;

	/**
	 * 员工所在公司总人数
	 */
	@ApiField("employee_count")
	private String employeeCount;

	/**
	 * 员工职级
	 */
	@ApiField("employee_level")
	private String employeeLevel;

	/**
	 * 员工姓名
	 */
	@ApiField("employee_name")
	private String employeeName;

	/**
	 * 员工岗位
	 */
	@ApiField("employee_position")
	private String employeePosition;

	/**
	 * 员工入职时间，精确到月份，yyyymm六位
	 */
	@ApiField("entry_time")
	private String entryTime;

	/**
	 * 员工身份证号（和员工手机号至少填写一个）
	 */
	@ApiField("identity_no")
	private String identityNo;

	/**
	 * 员工邮箱
	 */
	@ApiField("mail_addr")
	private String mailAddr;

	/**
	 * 员工是否管理岗，是管理岗传Y，非管理岗传N
	 */
	@ApiField("management")
	private String management;

	/**
	 * 员工手机号（和员工身份证号至少填写一个）
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 企业对应的支付宝商户Pid
	 */
	@ApiField("partner_id")
	private String partnerId;

	public String getAgreementId() {
		return this.agreementId;
	}
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getDeptName() {
		return this.deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getEmployeeCount() {
		return this.employeeCount;
	}
	public void setEmployeeCount(String employeeCount) {
		this.employeeCount = employeeCount;
	}

	public String getEmployeeLevel() {
		return this.employeeLevel;
	}
	public void setEmployeeLevel(String employeeLevel) {
		this.employeeLevel = employeeLevel;
	}

	public String getEmployeeName() {
		return this.employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeePosition() {
		return this.employeePosition;
	}
	public void setEmployeePosition(String employeePosition) {
		this.employeePosition = employeePosition;
	}

	public String getEntryTime() {
		return this.entryTime;
	}
	public void setEntryTime(String entryTime) {
		this.entryTime = entryTime;
	}

	public String getIdentityNo() {
		return this.identityNo;
	}
	public void setIdentityNo(String identityNo) {
		this.identityNo = identityNo;
	}

	public String getMailAddr() {
		return this.mailAddr;
	}
	public void setMailAddr(String mailAddr) {
		this.mailAddr = mailAddr;
	}

	public String getManagement() {
		return this.management;
	}
	public void setManagement(String management) {
		this.management = management;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

}
