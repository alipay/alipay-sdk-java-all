package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学生信息
 *
 * @author auto create
 * @since 1.0, 2026-06-11 14:43:05
 */
public class TuitionISVStudentInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 7279553579534952619L;

	/**
	 * 学生的生日信息，格式为yyyyMMdd
	 */
	@ApiField("birth_date")
	private String birthDate;

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
	 * 学生信息中的身份地址信息，用于ECHECK收款方式
	 */
	@ApiField("identity_address")
	private IndrISVAddressDTO identityAddress;

	/**
	 * 学生身份证号
	 */
	@ApiField("identity_card_number")
	private String identityCardNumber;

	/**
	 * 学生的证件类型
	 */
	@ApiField("identity_type")
	private String identityType;

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
	 * 学号
	 */
	@ApiField("student_number")
	private String studentNumber;

	/**
	 * 学生手机号
	 */
	@ApiField("student_phone_number")
	private String studentPhoneNumber;

	public String getBirthDate() {
		return this.birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

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

	public IndrISVAddressDTO getIdentityAddress() {
		return this.identityAddress;
	}
	public void setIdentityAddress(IndrISVAddressDTO identityAddress) {
		this.identityAddress = identityAddress;
	}

	public String getIdentityCardNumber() {
		return this.identityCardNumber;
	}
	public void setIdentityCardNumber(String identityCardNumber) {
		this.identityCardNumber = identityCardNumber;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
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
