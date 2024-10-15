package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 留学缴费VCC代付单buyer信息
 *
 * @author auto create
 * @since 1.0, 2023-06-29 15:27:40
 */
public class TuitionISVPoboBuyerInfo extends AlipayObject {

	private static final long serialVersionUID = 8879376131448218766L;

	/**
	 * academic_year+留学缴费
	 */
	@ApiField("academic_year")
	private String academicYear;

	/**
	 * 生日：yyyy-MM-DD，示例值加了双引号
	 */
	@ApiField("date_of_birth")
	private String dateOfBirth;

	/**
	 * email+留学缴费
	 */
	@ApiField("email")
	private String email;

	/**
	 * 用户名字
	 */
	@ApiField("first_name")
	private String firstName;

	/**
	 * 用户英文名或者拼音名
	 */
	@ApiField("full_name")
	private String fullName;

	/**
	 * 用户姓氏
	 */
	@ApiField("last_name")
	private String lastName;

	/**
	 * phone_area_code+留学缴费
	 */
	@ApiField("phone_area_code")
	private String phoneAreaCode;

	/**
	 * phone_number+留学缴费
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	/**
	 * 学号+留学缴费
	 */
	@ApiField("student_id")
	private String studentId;

	public String getAcademicYear() {
		return this.academicYear;
	}
	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
	}

	public String getDateOfBirth() {
		return this.dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFullName() {
		return this.fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneAreaCode() {
		return this.phoneAreaCode;
	}
	public void setPhoneAreaCode(String phoneAreaCode) {
		this.phoneAreaCode = phoneAreaCode;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getStudentId() {
		return this.studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

}
