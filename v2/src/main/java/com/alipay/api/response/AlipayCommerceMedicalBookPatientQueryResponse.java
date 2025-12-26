package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.book.patient.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-19 18:02:40
 */
public class AlipayCommerceMedicalBookPatientQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1233698426994174429L;

	/** 
	 * 生日
	 */
	@ApiField("birth_date")
	private String birthDate;

	/** 
	 * 性别
	 */
	@ApiField("gender")
	private Long gender;

	/** 
	 * 身份证号
	 */
	@ApiField("id_card_no")
	private String idCardNo;

	/** 
	 * 身份证类型
	 */
	@ApiField("id_card_type")
	private String idCardType;

	/** 
	 * 患者姓名
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 患者id
	 */
	@ApiField("patient_id")
	private String patientId;

	/** 
	 * 手机号
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	/** 
	 * 关系
	 */
	@ApiField("relationship")
	private String relationship;

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getBirthDate( ) {
		return this.birthDate;
	}

	public void setGender(Long gender) {
		this.gender = gender;
	}
	public Long getGender( ) {
		return this.gender;
	}

	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}
	public String getIdCardNo( ) {
		return this.idCardNo;
	}

	public void setIdCardType(String idCardType) {
		this.idCardType = idCardType;
	}
	public String getIdCardType( ) {
		return this.idCardType;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getPatientId( ) {
		return this.patientId;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneNumber( ) {
		return this.phoneNumber;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public String getRelationship( ) {
		return this.relationship;
	}

}
