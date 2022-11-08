package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 教育经历
 *
 * @author auto create
 * @since 1.0, 2022-05-07 09:57:14
 */
public class CloudResumeEducationExperience extends AlipayObject {

	private static final long serialVersionUID = 6283717894224454652L;

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
	 * 受教育地点
	 */
	@ApiField("location")
	private String location;

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

	public String getLocation() {
		return this.location;
	}
	public void setLocation(String location) {
		this.location = location;
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

	public Long getYear() {
		return this.year;
	}
	public void setYear(Long year) {
		this.year = year;
	}

}
