package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 就诊人信息
 *
 * @author auto create
 * @since 1.0, 2025-09-04 10:07:45
 */
public class PatientInfo extends AlipayObject {

	private static final long serialVersionUID = 6656555491851358917L;

	/**
	 * 过敏史
	 */
	@ApiField("allergy_history")
	private String allergyHistory;

	/**
	 * 家族病史
	 */
	@ApiField("family_medical_history")
	private String familyMedicalHistory;

	/**
	 * 1肾功能 1-正常 2-异常
	 */
	@ApiField("kidney_function")
	private String kidneyFunction;

	/**
	 * 哺乳 1-是 2-否
	 */
	@ApiField("lactation_status")
	private String lactationStatus;

	/**
	 * 肝功能 1-正常 2-异常
	 */
	@ApiField("liver_function")
	private String liverFunction;

	/**
	 * 疾病史
	 */
	@ApiField("medical_history")
	private String medicalHistory;

	/**
	 * 过往史
	 */
	@ApiField("past_history")
	private String pastHistory;

	/**
	 * 患者年龄
	 */
	@ApiField("patient_age")
	private String patientAge;

	/**
	 * 患者年龄单位
○ 小于30天：天 
○ 30天~1年：月 
○ 大于等于1年：岁
	 */
	@ApiField("patient_age_unit")
	private String patientAgeUnit;

	/**
	 * 患者出身日期，格式：yyyy-MM-dd
	 */
	@ApiField("patient_birthday")
	private String patientBirthday;

	/**
	 * 患者性别
	 */
	@ApiField("patient_gender")
	private String patientGender;

	/**
	 * 就诊人ID
	 */
	@ApiField("patient_id")
	private String patientId;

	/**
	 * 患者姓名
	 */
	@ApiField("patient_name")
	private String patientName;

	/**
	 * 妊娠 1-是 2-否
	 */
	@ApiField("pregnancy_status")
	private String pregnancyStatus;

	/**
	 * 备孕 1-是 2-否
	 */
	@ApiField("preparation_status")
	private String preparationStatus;

	/**
	 * 体重，单位kg
	 */
	@ApiField("weight")
	private String weight;

	public String getAllergyHistory() {
		return this.allergyHistory;
	}
	public void setAllergyHistory(String allergyHistory) {
		this.allergyHistory = allergyHistory;
	}

	public String getFamilyMedicalHistory() {
		return this.familyMedicalHistory;
	}
	public void setFamilyMedicalHistory(String familyMedicalHistory) {
		this.familyMedicalHistory = familyMedicalHistory;
	}

	public String getKidneyFunction() {
		return this.kidneyFunction;
	}
	public void setKidneyFunction(String kidneyFunction) {
		this.kidneyFunction = kidneyFunction;
	}

	public String getLactationStatus() {
		return this.lactationStatus;
	}
	public void setLactationStatus(String lactationStatus) {
		this.lactationStatus = lactationStatus;
	}

	public String getLiverFunction() {
		return this.liverFunction;
	}
	public void setLiverFunction(String liverFunction) {
		this.liverFunction = liverFunction;
	}

	public String getMedicalHistory() {
		return this.medicalHistory;
	}
	public void setMedicalHistory(String medicalHistory) {
		this.medicalHistory = medicalHistory;
	}

	public String getPastHistory() {
		return this.pastHistory;
	}
	public void setPastHistory(String pastHistory) {
		this.pastHistory = pastHistory;
	}

	public String getPatientAge() {
		return this.patientAge;
	}
	public void setPatientAge(String patientAge) {
		this.patientAge = patientAge;
	}

	public String getPatientAgeUnit() {
		return this.patientAgeUnit;
	}
	public void setPatientAgeUnit(String patientAgeUnit) {
		this.patientAgeUnit = patientAgeUnit;
	}

	public String getPatientBirthday() {
		return this.patientBirthday;
	}
	public void setPatientBirthday(String patientBirthday) {
		this.patientBirthday = patientBirthday;
	}

	public String getPatientGender() {
		return this.patientGender;
	}
	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	public String getPatientId() {
		return this.patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return this.patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPregnancyStatus() {
		return this.pregnancyStatus;
	}
	public void setPregnancyStatus(String pregnancyStatus) {
		this.pregnancyStatus = pregnancyStatus;
	}

	public String getPreparationStatus() {
		return this.preparationStatus;
	}
	public void setPreparationStatus(String preparationStatus) {
		this.preparationStatus = preparationStatus;
	}

	public String getWeight() {
		return this.weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}

}
