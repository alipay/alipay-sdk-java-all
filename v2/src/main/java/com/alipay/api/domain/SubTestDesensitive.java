package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 脱敏子测试模型
 *
 * @author auto create
 * @since 1.0, 2021-04-09 17:21:00
 */
public class SubTestDesensitive extends AlipayObject {

	private static final long serialVersionUID = 2824846295122461639L;

	/**
	 * 邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 邮箱列表
	 */
	@ApiListField("email_list")
	@ApiField("string")
	private List<String> emailList;

	/**
	 * 是否是学生
	 */
	@ApiField("is_student")
	private String isStudent;

	/**
	 * ["T","T","T"]
	 */
	@ApiListField("is_student_list")
	@ApiField("string")
	private List<String> isStudentList;

	/**
	 * 1200
	 */
	@ApiField("school")
	private String school;

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getEmailList() {
		return this.emailList;
	}
	public void setEmailList(List<String> emailList) {
		this.emailList = emailList;
	}

	public String getIsStudent() {
		return this.isStudent;
	}
	public void setIsStudent(String isStudent) {
		this.isStudent = isStudent;
	}

	public List<String> getIsStudentList() {
		return this.isStudentList;
	}
	public void setIsStudentList(List<String> isStudentList) {
		this.isStudentList = isStudentList;
	}

	public String getSchool() {
		return this.school;
	}
	public void setSchool(String school) {
		this.school = school;
	}

}
