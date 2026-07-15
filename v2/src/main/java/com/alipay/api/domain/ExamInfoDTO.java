package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * oceanbase官网考试相关信息
 *
 * @author auto create
 * @since 1.0, 2026-06-30 14:35:03
 */
public class ExamInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 3672678847577356947L;

	/**
	 * 官网注册账号为手机号时返回；消费方仅对非空数据生成 CRM 线索。
	 */
	@ApiField("account_mobile")
	private String accountMobile;

	/**
	 * 证书颁发日期
	 */
	@ApiField("certificate_issue_date")
	private Date certificateIssueDate;

	/**
	 * 认证等级
	 */
	@ApiField("certificate_level")
	private String certificateLevel;

	/**
	 * 认证状态
	 */
	@ApiField("certificate_status")
	private String certificateStatus;

	/**
	 * 用户考试报名信息id
	 */
	@ApiField("college_exam_enrollment_id")
	private String collegeExamEnrollmentId;

	/**
	 * 当前取考试记录中的 examinee_department。
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 考试结束时间
	 */
	@ApiField("exam_end_time")
	private Date examEndTime;

	/**
	 * 考试开始时间
	 */
	@ApiField("exam_start_time")
	private Date examStartTime;

	/**
	 * 取 college_exam_enrollment.gmt_modified，表示官网侧从 ATAC 取回成绩并更新考试记录的时间；不是 ATAC 报名时间。
	 */
	@ApiField("lead_time")
	private Date leadTime;

	/**
	 * 用户Id
	 */
	@ApiField("passport_id")
	private String passportId;

	/**
	 * 当前取考生类型名称；消费方会过滤学生/在校/student。
	 */
	@ApiField("position")
	private String position;

	/**
	 * 考试记录中的考生姓名。
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 用户的出生年份
	 */
	@ApiField("year_of_birth")
	private String yearOfBirth;

	public String getAccountMobile() {
		return this.accountMobile;
	}
	public void setAccountMobile(String accountMobile) {
		this.accountMobile = accountMobile;
	}

	public Date getCertificateIssueDate() {
		return this.certificateIssueDate;
	}
	public void setCertificateIssueDate(Date certificateIssueDate) {
		this.certificateIssueDate = certificateIssueDate;
	}

	public String getCertificateLevel() {
		return this.certificateLevel;
	}
	public void setCertificateLevel(String certificateLevel) {
		this.certificateLevel = certificateLevel;
	}

	public String getCertificateStatus() {
		return this.certificateStatus;
	}
	public void setCertificateStatus(String certificateStatus) {
		this.certificateStatus = certificateStatus;
	}

	public String getCollegeExamEnrollmentId() {
		return this.collegeExamEnrollmentId;
	}
	public void setCollegeExamEnrollmentId(String collegeExamEnrollmentId) {
		this.collegeExamEnrollmentId = collegeExamEnrollmentId;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Date getExamEndTime() {
		return this.examEndTime;
	}
	public void setExamEndTime(Date examEndTime) {
		this.examEndTime = examEndTime;
	}

	public Date getExamStartTime() {
		return this.examStartTime;
	}
	public void setExamStartTime(Date examStartTime) {
		this.examStartTime = examStartTime;
	}

	public Date getLeadTime() {
		return this.leadTime;
	}
	public void setLeadTime(Date leadTime) {
		this.leadTime = leadTime;
	}

	public String getPassportId() {
		return this.passportId;
	}
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

	public String getPosition() {
		return this.position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getYearOfBirth() {
		return this.yearOfBirth;
	}
	public void setYearOfBirth(String yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

}
