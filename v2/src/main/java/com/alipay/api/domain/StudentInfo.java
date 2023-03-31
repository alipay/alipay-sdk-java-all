package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学生详细信息
 *
 * @author auto create
 * @since 1.0, 2016-02-24 16:54:09
 */
public class StudentInfo extends AlipayObject {

	private static final long serialVersionUID = 6777988478847732662L;

	/**
	 * 学校所在行政区域编码
	 */
	@ApiField("city_no")
	private String cityNo;

	/**
	 * 班级
	 */
	@ApiField("class_name")
	private String className;

	/**
	 * 学校名称
	 */
	@ApiField("college_name")
	private String collegeName;

	/**
	 * 学校机构编号
	 */
	@ApiField("college_no")
	private String collegeNo;

	/**
	 * 学历
	 */
	@ApiField("degree")
	private String degree;

	/**
	 * 院系
	 */
	@ApiField("departments")
	private String departments;

	/**
	 * 入校时间
	 */
	@ApiField("gmt_enrollment")
	private Date gmtEnrollment;

	/**
	 * 毕业时间
	 */
	@ApiField("gmt_graduation")
	private Date gmtGraduation;

	/**
	 * 专业
	 */
	@ApiField("major")
	private String major;

	/**
	 * 学生证号
	 */
	@ApiField("student_id")
	private String studentId;

	public String getCityNo() {
		return this.cityNo;
	}
	public void setCityNo(String cityNo) {
		this.cityNo = cityNo;
	}

	public String getClassName() {
		return this.className;
	}
	public void setClassName(String className) {
		this.className = className;
	}

	public String getCollegeName() {
		return this.collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCollegeNo() {
		return this.collegeNo;
	}
	public void setCollegeNo(String collegeNo) {
		this.collegeNo = collegeNo;
	}

	public String getDegree() {
		return this.degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getDepartments() {
		return this.departments;
	}
	public void setDepartments(String departments) {
		this.departments = departments;
	}

	public Date getGmtEnrollment() {
		return this.gmtEnrollment;
	}
	public void setGmtEnrollment(Date gmtEnrollment) {
		this.gmtEnrollment = gmtEnrollment;
	}

	public Date getGmtGraduation() {
		return this.gmtGraduation;
	}
	public void setGmtGraduation(Date gmtGraduation) {
		this.gmtGraduation = gmtGraduation;
	}

	public String getMajor() {
		return this.major;
	}
	public void setMajor(String major) {
		this.major = major;
	}

	public String getStudentId() {
		return this.studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

}
