package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学生信息
 *
 * @author auto create
 * @since 1.0, 2025-03-24 18:57:40
 */
public class TuitionISVStudentInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4367939215115361626L;

	/**
	 * 电子邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 入学时间
	 */
	@ApiField("entrance_date")
	private String entranceDate;

	/**
	 * 姓
	 */
	@ApiField("first_name")
	private String firstName;

	/**
	 * 学生身份证号
	 */
	@ApiField("identity_card_number")
	private String identityCardNumber;

	/**
	 * 名
	 */
	@ApiField("last_name")
	private String lastName;

	/**
	 * 学制信息，可根据枚举值传入，学年制
	 */
	@ApiField("length_of_schooling")
	private String lengthOfSchooling;

	/**
	 * 学生姓名
	 */
	@ApiField("student_name")
	private String studentName;

	/**
	 * 20100120
	 */
	@ApiField("student_number")
	private String studentNumber;

	/**
	 * 学生手机号
	 */
	@ApiField("student_phone_number")
	private String studentPhoneNumber;

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getEntranceDate() {
		return this.entranceDate;
	}
	public void setEntranceDate(String entranceDate) {
		this.entranceDate = entranceDate;
	}

	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getIdentityCardNumber() {
		return this.identityCardNumber;
	}
	public void setIdentityCardNumber(String identityCardNumber) {
		this.identityCardNumber = identityCardNumber;
	}

	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLengthOfSchooling() {
		return this.lengthOfSchooling;
	}
	public void setLengthOfSchooling(String lengthOfSchooling) {
		this.lengthOfSchooling = lengthOfSchooling;
	}

	public String getStudentName() {
		return this.studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentNumber() {
		return this.studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentPhoneNumber() {
		return this.studentPhoneNumber;
	}
	public void setStudentPhoneNumber(String studentPhoneNumber) {
		this.studentPhoneNumber = studentPhoneNumber;
	}

}
