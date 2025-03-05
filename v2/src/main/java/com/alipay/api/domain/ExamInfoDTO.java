package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * oceanbase官网考试相关信息
 *
 * @author auto create
 * @since 1.0, 2024-12-26 15:53:31
 */
public class ExamInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8421872486982515264L;

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
	 * 用户Id
	 */
	@ApiField("passport_id")
	private String passportId;

	/**
	 * 用户的出生年份
	 */
	@ApiField("year_of_birth")
	private String yearOfBirth;

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

	public String getPassportId() {
		return this.passportId;
	}
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

	public String getYearOfBirth() {
		return this.yearOfBirth;
	}
	public void setYearOfBirth(String yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

}
