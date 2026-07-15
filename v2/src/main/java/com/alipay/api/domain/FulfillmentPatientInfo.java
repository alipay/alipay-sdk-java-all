package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 陪诊患者信息
 *
 * @author auto create
 * @since 1.0, 2026-05-14 15:01:05
 */
public class FulfillmentPatientInfo extends AlipayObject {

	private static final long serialVersionUID = 7227477295581531874L;

	/**
	 * 年龄
	 */
	@ApiField("age")
	private Long age;

	/**
	 * 疾病描述/主诉
	 */
	@ApiField("disease_desc")
	private String diseaseDesc;

	/**
	 * 0-男，1-女
	 */
	@ApiField("gender")
	private Long gender;

	/**
	 * 证件号码
	 */
	@ApiField("id_card_no")
	private String idCardNo;

	/**
	 * 证件类型
	 */
	@ApiField("id_card_type")
	private String idCardType;

	/**
	 * true/false
	 */
	@ApiField("mindful_male_flag")
	private Boolean mindfulMaleFlag;

	/**
	 * 患者姓名
	 */
	@ApiField("patient_name")
	private String patientName;

	/**
	 * 与患者关系
	 */
	@ApiField("patient_relation")
	private String patientRelation;

	/**
	 * 联系电话
	 */
	@ApiField("phone")
	private String phone;

	public Long getAge() {
		return this.age;
	}
	public void setAge(Long age) {
		this.age = age;
	}

	public String getDiseaseDesc() {
		return this.diseaseDesc;
	}
	public void setDiseaseDesc(String diseaseDesc) {
		this.diseaseDesc = diseaseDesc;
	}

	public Long getGender() {
		return this.gender;
	}
	public void setGender(Long gender) {
		this.gender = gender;
	}

	public String getIdCardNo() {
		return this.idCardNo;
	}
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getIdCardType() {
		return this.idCardType;
	}
	public void setIdCardType(String idCardType) {
		this.idCardType = idCardType;
	}

	public Boolean getMindfulMaleFlag() {
		return this.mindfulMaleFlag;
	}
	public void setMindfulMaleFlag(Boolean mindfulMaleFlag) {
		this.mindfulMaleFlag = mindfulMaleFlag;
	}

	public String getPatientName() {
		return this.patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientRelation() {
		return this.patientRelation;
	}
	public void setPatientRelation(String patientRelation) {
		this.patientRelation = patientRelation;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
