package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.edu.campus.jobstudent.apply response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-27 14:00:20
 */
public class AlipayEcoEduCampusJobstudentApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2777483354739135896L;

	/** 
	 * 备注问题或异常
	 */
	@ApiField("content")
	private String content;

	/** 
	 * 备用字段，JSON格式
	 */
	@ApiField("content_var")
	private String contentVar;

	/** 
	 * 学历
	 */
	@ApiField("degree")
	private String degree;

	/** 
	 * 状态码描述
	 */
	@ApiField("description")
	private String description;

	/** 
	 * 学生入学时间
	 */
	@ApiField("enrollment_time")
	private String enrollmentTime;

	/** 
	 * 是否毕业（1-已毕业；2-未毕业）
	 */
	@ApiField("is_graduate")
	private Long isGraduate;

	/** 
	 * 学生是否在趣校园平台认证(1-认证；2-未认证)
	 */
	@ApiField("is_student")
	private Long isStudent;

	/** 
	 * 返回code编码;成功返回Success
	 */
	@ApiField("isv_code")
	private String isvCode;

	/** 
	 * 学生所在学校
	 */
	@ApiField("school")
	private String school;

	public void setContent(String content) {
		this.content = content;
	}
	public String getContent( ) {
		return this.content;
	}

	public void setContentVar(String contentVar) {
		this.contentVar = contentVar;
	}
	public String getContentVar( ) {
		return this.contentVar;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getDegree( ) {
		return this.degree;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription( ) {
		return this.description;
	}

	public void setEnrollmentTime(String enrollmentTime) {
		this.enrollmentTime = enrollmentTime;
	}
	public String getEnrollmentTime( ) {
		return this.enrollmentTime;
	}

	public void setIsGraduate(Long isGraduate) {
		this.isGraduate = isGraduate;
	}
	public Long getIsGraduate( ) {
		return this.isGraduate;
	}

	public void setIsStudent(Long isStudent) {
		this.isStudent = isStudent;
	}
	public Long getIsStudent( ) {
		return this.isStudent;
	}

	public void setIsvCode(String isvCode) {
		this.isvCode = isvCode;
	}
	public String getIsvCode( ) {
		return this.isvCode;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	public String getSchool( ) {
		return this.school;
	}

}
