package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 教育经历
 *
 * @author auto create
 * @since 1.0, 2023-09-05 17:27:16
 */
public class CloudResumeEducationExperience extends AlipayObject {

	private static final long serialVersionUID = 3522289866978624898L;

	/**
	 * 学历
	 */
	@ApiField("degree")
	private String degree;

	/**
	 * 教育状态
	 */
	@ApiField("education_status")
	private String educationStatus;

	/**
	 * 毕业月份
	 */
	@ApiField("finish_school_month")
	private String finishSchoolMonth;

	/**
	 * 毕业年份
	 */
	@ApiField("finish_school_year")
	private Long finishSchoolYear;

	/**
	 * 入学月份
	 */
	@ApiField("in_school_month")
	private Long inSchoolMonth;

	/**
	 * 入学年份
	 */
	@ApiField("in_school_year")
	private Long inSchoolYear;

	/**
	 * 受教育地点
	 */
	@ApiField("location")
	private String location;

	/**
	 * 上学专业
	 */
	@ApiField("major")
	private String major;

	/**
	 * 月
	 */
	@ApiField("month")
	private Long month;

	/**
	 * 学校名称
	 */
	@ApiField("school_name")
	private String schoolName;

	/**
	 * 是否统招
	 */
	@ApiField("tong_zhao")
	private Boolean tongZhao;

	/**
	 * 年
	 */
	@ApiField("year")
	private Long year;

	public String getDegree() {
		return this.degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getEducationStatus() {
		return this.educationStatus;
	}
	public void setEducationStatus(String educationStatus) {
		this.educationStatus = educationStatus;
	}

	public String getFinishSchoolMonth() {
		return this.finishSchoolMonth;
	}
	public void setFinishSchoolMonth(String finishSchoolMonth) {
		this.finishSchoolMonth = finishSchoolMonth;
	}

	public Long getFinishSchoolYear() {
		return this.finishSchoolYear;
	}
	public void setFinishSchoolYear(Long finishSchoolYear) {
		this.finishSchoolYear = finishSchoolYear;
	}

	public Long getInSchoolMonth() {
		return this.inSchoolMonth;
	}
	public void setInSchoolMonth(Long inSchoolMonth) {
		this.inSchoolMonth = inSchoolMonth;
	}

	public Long getInSchoolYear() {
		return this.inSchoolYear;
	}
	public void setInSchoolYear(Long inSchoolYear) {
		this.inSchoolYear = inSchoolYear;
	}

	public String getLocation() {
		return this.location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public String getMajor() {
		return this.major;
	}
	public void setMajor(String major) {
		this.major = major;
	}

	public Long getMonth() {
		return this.month;
	}
	public void setMonth(Long month) {
		this.month = month;
	}

	public String getSchoolName() {
		return this.schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public Boolean getTongZhao() {
		return this.tongZhao;
	}
	public void setTongZhao(Boolean tongZhao) {
		this.tongZhao = tongZhao;
	}

	public Long getYear() {
		return this.year;
	}
	public void setYear(Long year) {
		this.year = year;
	}

}
