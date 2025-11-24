package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 户口本信息
 *
 * @author auto create
 * @since 1.0, 2025-07-01 09:54:26
 */
public class HouseholdRegistrationDTO extends AlipayObject {

	private static final long serialVersionUID = 5665792598327141798L;

	/**
	 * 现户籍登记住址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 出生日期
	 */
	@ApiField("birth_date")
	private String birthDate;

	/**
	 * 出生地
	 */
	@ApiField("birth_place")
	private String birthPlace;

	/**
	 * 血型
	 */
	@ApiField("blood_desc")
	private String bloodDesc;

	/**
	 * 职业类别
	 */
	@ApiField("career")
	private String career;

	/**
	 * 本市其他住址
	 */
	@ApiField("city_other_addresses")
	private String cityOtherAddresses;

	/**
	 * 承办人签章
	 */
	@ApiField("contractor")
	private String contractor;

	/**
	 * 签发日期
	 */
	@ApiField("data_issue")
	private String dataIssue;

	/**
	 * 文化程度
	 */
	@ApiField("degree_of_education")
	private String degreeOfEducation;

	/**
	 * 曾用名
	 */
	@ApiField("former_name")
	private String formerName;

	/**
	 * 姓名
	 */
	@ApiField("full_name")
	private String fullName;

	/**
	 * 身高
	 */
	@ApiField("height")
	private String height;

	/**
	 * 户号
	 */
	@ApiField("household_number")
	private String householdNumber;

	/**
	 * 户别类型
	 */
	@ApiField("household_type")
	private String householdType;

	/**
	 * 公民身份证号码
	 */
	@ApiField("id_card")
	private String idCard;

	/**
	 * 婚姻状况
	 */
	@ApiField("marital_desc")
	private String maritalDesc;

	/**
	 * 兵役状况
	 */
	@ApiField("military_desc")
	private String militaryDesc;

	/**
	 * 民族
	 */
	@ApiField("nationality")
	private String nationality;

	/**
	 * 籍贯
	 */
	@ApiField("native_place")
	private String nativePlace;

	/**
	 * 人号
	 */
	@ApiField("person_id")
	private String personId;

	/**
	 * 户口簿打印日期
	 */
	@ApiField("print_date")
	private String printDate;

	/**
	 * 户籍登记日期
	 */
	@ApiField("registration_date")
	private String registrationDate;

	/**
	 * 与户主关系
	 */
	@ApiField("relationship_desc")
	private String relationshipDesc;

	/**
	 * 宗教信息
	 */
	@ApiField("religion")
	private String religion;

	/**
	 * 工作单位或服务机构
	 */
	@ApiField("service_location")
	private String serviceLocation;

	/**
	 * 性别
	 */
	@ApiField("sex")
	private String sex;

	/**
	 * 迁入本址信息
	 */
	@ApiField("when_and_from_moved_address")
	private String whenAndFromMovedAddress;

	/**
	 * 迁入本市信息
	 */
	@ApiField("when_and_from_moved_city")
	private String whenAndFromMovedCity;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthDate() {
		return this.birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getBirthPlace() {
		return this.birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getBloodDesc() {
		return this.bloodDesc;
	}
	public void setBloodDesc(String bloodDesc) {
		this.bloodDesc = bloodDesc;
	}

	public String getCareer() {
		return this.career;
	}
	public void setCareer(String career) {
		this.career = career;
	}

	public String getCityOtherAddresses() {
		return this.cityOtherAddresses;
	}
	public void setCityOtherAddresses(String cityOtherAddresses) {
		this.cityOtherAddresses = cityOtherAddresses;
	}

	public String getContractor() {
		return this.contractor;
	}
	public void setContractor(String contractor) {
		this.contractor = contractor;
	}

	public String getDataIssue() {
		return this.dataIssue;
	}
	public void setDataIssue(String dataIssue) {
		this.dataIssue = dataIssue;
	}

	public String getDegreeOfEducation() {
		return this.degreeOfEducation;
	}
	public void setDegreeOfEducation(String degreeOfEducation) {
		this.degreeOfEducation = degreeOfEducation;
	}

	public String getFormerName() {
		return this.formerName;
	}
	public void setFormerName(String formerName) {
		this.formerName = formerName;
	}

	public String getFullName() {
		return this.fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getHeight() {
		return this.height;
	}
	public void setHeight(String height) {
		this.height = height;
	}

	public String getHouseholdNumber() {
		return this.householdNumber;
	}
	public void setHouseholdNumber(String householdNumber) {
		this.householdNumber = householdNumber;
	}

	public String getHouseholdType() {
		return this.householdType;
	}
	public void setHouseholdType(String householdType) {
		this.householdType = householdType;
	}

	public String getIdCard() {
		return this.idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getMaritalDesc() {
		return this.maritalDesc;
	}
	public void setMaritalDesc(String maritalDesc) {
		this.maritalDesc = maritalDesc;
	}

	public String getMilitaryDesc() {
		return this.militaryDesc;
	}
	public void setMilitaryDesc(String militaryDesc) {
		this.militaryDesc = militaryDesc;
	}

	public String getNationality() {
		return this.nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getNativePlace() {
		return this.nativePlace;
	}
	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}

	public String getPersonId() {
		return this.personId;
	}
	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getPrintDate() {
		return this.printDate;
	}
	public void setPrintDate(String printDate) {
		this.printDate = printDate;
	}

	public String getRegistrationDate() {
		return this.registrationDate;
	}
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getRelationshipDesc() {
		return this.relationshipDesc;
	}
	public void setRelationshipDesc(String relationshipDesc) {
		this.relationshipDesc = relationshipDesc;
	}

	public String getReligion() {
		return this.religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getServiceLocation() {
		return this.serviceLocation;
	}
	public void setServiceLocation(String serviceLocation) {
		this.serviceLocation = serviceLocation;
	}

	public String getSex() {
		return this.sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getWhenAndFromMovedAddress() {
		return this.whenAndFromMovedAddress;
	}
	public void setWhenAndFromMovedAddress(String whenAndFromMovedAddress) {
		this.whenAndFromMovedAddress = whenAndFromMovedAddress;
	}

	public String getWhenAndFromMovedCity() {
		return this.whenAndFromMovedCity;
	}
	public void setWhenAndFromMovedCity(String whenAndFromMovedCity) {
		this.whenAndFromMovedCity = whenAndFromMovedCity;
	}

}
