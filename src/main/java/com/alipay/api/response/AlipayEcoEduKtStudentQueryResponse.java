package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserDetails;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.edu.kt.student.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEcoEduKtStudentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5362248651667623647L;

	/** 
	 * 学生姓名
	 */
	@ApiField("child_name")
	private String childName;

	/** 
	 * 班级名字
	 */
	@ApiField("class_name")
	private String className;

	/** 
	 * 学校名称
	 */
	@ApiField("school_name")
	private String schoolName;

	/** 
	 * 学生编号
	 */
	@ApiField("student_code")
	private String studentCode;

	/** 
	 * 学生身份证
	 */
	@ApiField("student_identify")
	private String studentIdentify;

	/** 
	 * 家长信息
	 */
	@ApiListField("users")
	@ApiField("user_details")
	private List<UserDetails> users;

	public void setChildName(String childName) {
		this.childName = childName;
	}
	public String getChildName( ) {
		return this.childName;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	public String getClassName( ) {
		return this.className;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getSchoolName( ) {
		return this.schoolName;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}
	public String getStudentCode( ) {
		return this.studentCode;
	}

	public void setStudentIdentify(String studentIdentify) {
		this.studentIdentify = studentIdentify;
	}
	public String getStudentIdentify( ) {
		return this.studentIdentify;
	}

	public void setUsers(List<UserDetails> users) {
		this.users = users;
	}
	public List<UserDetails> getUsers( ) {
		return this.users;
	}

}
