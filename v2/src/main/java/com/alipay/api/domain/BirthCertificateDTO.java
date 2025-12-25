package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出生证明信息
 *
 * @author auto create
 * @since 1.0, 2025-07-01 09:54:26
 */
public class BirthCertificateDTO extends AlipayObject {

	private static final long serialVersionUID = 5883325887826863156L;

	/**
	 * 出生孕周
	 */
	@ApiField("birth_gestational_weeks")
	private String birthGestationalWeeks;

	/**
	 * 出生身长
	 */
	@ApiField("birth_length")
	private String birthLength;

	/**
	 * 接生机构全称
	 */
	@ApiField("birth_medical_institution")
	private String birthMedicalInstitution;

	/**
	 * 出生时间
	 */
	@ApiField("birth_time")
	private String birthTime;

	/**
	 * 出生体重
	 */
	@ApiField("birth_weight")
	private String birthWeight;

	/**
	 * 签发日期
	 */
	@ApiField("date_issue")
	private String dateIssue;

	/**
	 * 父亲住址
	 */
	@ApiField("father_address")
	private String fatherAddress;

	/**
	 * 父亲年龄
	 */
	@ApiField("father_age")
	private String fatherAge;

	/**
	 * 父亲国籍
	 */
	@ApiField("father_country")
	private String fatherCountry;

	/**
	 * 父亲身份证号
	 */
	@ApiField("father_id_card")
	private String fatherIdCard;

	/**
	 * 父亲姓名
	 */
	@ApiField("father_name")
	private String fatherName;

	/**
	 * 父亲民族
	 */
	@ApiField("father_nationality")
	private String fatherNationality;

	/**
	 * 新生儿姓名
	 */
	@ApiField("full_name")
	private String fullName;

	/**
	 * 母亲住址
	 */
	@ApiField("mother_address")
	private String motherAddress;

	/**
	 * 母亲年龄
	 */
	@ApiField("mother_age")
	private String motherAge;

	/**
	 * 母亲国籍
	 */
	@ApiField("mother_country")
	private String motherCountry;

	/**
	 * 母亲身份证号
	 */
	@ApiField("mother_id_card")
	private String motherIdCard;

	/**
	 * 母亲姓名
	 */
	@ApiField("mother_name")
	private String motherName;

	/**
	 * 母亲民族
	 */
	@ApiField("mother_nationality")
	private String motherNationality;

	/**
	 * 编号（唯一标识）
	 */
	@ApiField("number")
	private String number;

	/**
	 * 出生地
	 */
	@ApiField("place_birth")
	private String placeBirth;

	/**
	 * 性别
	 */
	@ApiField("sex")
	private String sex;

	public String getBirthGestationalWeeks() {
		return this.birthGestationalWeeks;
	}
	public void setBirthGestationalWeeks(String birthGestationalWeeks) {
		this.birthGestationalWeeks = birthGestationalWeeks;
	}

	public String getBirthLength() {
		return this.birthLength;
	}
	public void setBirthLength(String birthLength) {
		this.birthLength = birthLength;
	}

	public String getBirthMedicalInstitution() {
		return this.birthMedicalInstitution;
	}
	public void setBirthMedicalInstitution(String birthMedicalInstitution) {
		this.birthMedicalInstitution = birthMedicalInstitution;
	}

	public String getBirthTime() {
		return this.birthTime;
	}
	public void setBirthTime(String birthTime) {
		this.birthTime = birthTime;
	}

	public String getBirthWeight() {
		return this.birthWeight;
	}
	public void setBirthWeight(String birthWeight) {
		this.birthWeight = birthWeight;
	}

	public String getDateIssue() {
		return this.dateIssue;
	}
	public void setDateIssue(String dateIssue) {
		this.dateIssue = dateIssue;
	}

	public String getFatherAddress() {
		return this.fatherAddress;
	}
	public void setFatherAddress(String fatherAddress) {
		this.fatherAddress = fatherAddress;
	}

	public String getFatherAge() {
		return this.fatherAge;
	}
	public void setFatherAge(String fatherAge) {
		this.fatherAge = fatherAge;
	}

	public String getFatherCountry() {
		return this.fatherCountry;
	}
	public void setFatherCountry(String fatherCountry) {
		this.fatherCountry = fatherCountry;
	}

	public String getFatherIdCard() {
		return this.fatherIdCard;
	}
	public void setFatherIdCard(String fatherIdCard) {
		this.fatherIdCard = fatherIdCard;
	}

	public String getFatherName() {
		return this.fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getFatherNationality() {
		return this.fatherNationality;
	}
	public void setFatherNationality(String fatherNationality) {
		this.fatherNationality = fatherNationality;
	}

	public String getFullName() {
		return this.fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getMotherAddress() {
		return this.motherAddress;
	}
	public void setMotherAddress(String motherAddress) {
		this.motherAddress = motherAddress;
	}

	public String getMotherAge() {
		return this.motherAge;
	}
	public void setMotherAge(String motherAge) {
		this.motherAge = motherAge;
	}

	public String getMotherCountry() {
		return this.motherCountry;
	}
	public void setMotherCountry(String motherCountry) {
		this.motherCountry = motherCountry;
	}

	public String getMotherIdCard() {
		return this.motherIdCard;
	}
	public void setMotherIdCard(String motherIdCard) {
		this.motherIdCard = motherIdCard;
	}

	public String getMotherName() {
		return this.motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getMotherNationality() {
		return this.motherNationality;
	}
	public void setMotherNationality(String motherNationality) {
		this.motherNationality = motherNationality;
	}

	public String getNumber() {
		return this.number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

	public String getPlaceBirth() {
		return this.placeBirth;
	}
	public void setPlaceBirth(String placeBirth) {
		this.placeBirth = placeBirth;
	}

	public String getSex() {
		return this.sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

}
