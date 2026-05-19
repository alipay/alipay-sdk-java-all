package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 陪护患者信息
 *
 * @author auto create
 * @since 1.0, 2026-05-14 15:01:05
 */
public class InpatientNursingPatientInfo extends AlipayObject {

	private static final long serialVersionUID = 8569353955134978725L;

	/**
	 * 年龄
	 */
	@ApiField("age")
	private Long age;

	/**
	 * 非本人时
	 */
	@ApiField("applicant_phone")
	private String applicantPhone;

	/**
	 * 所患疾病描述
	 */
	@ApiField("disease_description")
	private String diseaseDescription;

	/**
	 * 所患疾病照片URL
	 */
	@ApiListField("disease_photo_url_list")
	@ApiField("string")
	private List<String> diseasePhotoUrlList;

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
	 * 检查报告/门诊病例URL
	 */
	@ApiListField("medical_document_url_list")
	@ApiField("string")
	private List<String> medicalDocumentUrlList;

	/**
	 * 客户姓名
	 */
	@ApiField("patient_name")
	private String patientName;

	/**
	 * 为谁申请
	 */
	@ApiField("patient_relation")
	private String patientRelation;

	/**
	 * 脱敏显示
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 对护工的特殊需求
	 */
	@ApiField("special_requirements")
	private String specialRequirements;

	public Long getAge() {
		return this.age;
	}
	public void setAge(Long age) {
		this.age = age;
	}

	public String getApplicantPhone() {
		return this.applicantPhone;
	}
	public void setApplicantPhone(String applicantPhone) {
		this.applicantPhone = applicantPhone;
	}

	public String getDiseaseDescription() {
		return this.diseaseDescription;
	}
	public void setDiseaseDescription(String diseaseDescription) {
		this.diseaseDescription = diseaseDescription;
	}

	public List<String> getDiseasePhotoUrlList() {
		return this.diseasePhotoUrlList;
	}
	public void setDiseasePhotoUrlList(List<String> diseasePhotoUrlList) {
		this.diseasePhotoUrlList = diseasePhotoUrlList;
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

	public List<String> getMedicalDocumentUrlList() {
		return this.medicalDocumentUrlList;
	}
	public void setMedicalDocumentUrlList(List<String> medicalDocumentUrlList) {
		this.medicalDocumentUrlList = medicalDocumentUrlList;
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

	public String getSpecialRequirements() {
		return this.specialRequirements;
	}
	public void setSpecialRequirements(String specialRequirements) {
		this.specialRequirements = specialRequirements;
	}

}
