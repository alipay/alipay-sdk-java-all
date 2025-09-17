package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于生成问诊总结
 *
 * @author auto create
 * @since 1.0, 2025-06-23 14:28:27
 */
public class MedicalRecordInfo extends AlipayObject {

	private static final long serialVersionUID = 5556295883322911439L;

	/**
	 * 过敏史内容
	 */
	@ApiField("allergy")
	private String allergy;

	/**
	 * 病情描述
	 */
	@ApiField("condition_desc")
	private String conditionDesc;

	/**
	 * 疾病描述
	 */
	@ApiField("disease")
	private String disease;

	/**
	 * 妊娠怀孕情况
	 */
	@ApiField("gestation")
	private String gestation;

	/**
	 * 身高描述
	 */
	@ApiField("height")
	private String height;

	/**
	 * 患者希望主诊医生提供的帮助
	 */
	@ApiField("hope_help")
	private String hopeHelp;

	/**
	 * 曾就诊医院
	 */
	@ApiField("hospital")
	private String hospital;

	/**
	 * 重大病史
	 */
	@ApiField("illness_history")
	private String illnessHistory;

	/**
	 * 用药情况，当前正在使用的药物
	 */
	@ApiField("medicine_condition")
	private String medicineCondition;

	/**
	 * 患病时长
	 */
	@ApiField("patient_course_time")
	private String patientCourseTime;

	/**
	 * 体重描述
	 */
	@ApiField("weight")
	private String weight;

	public String getAllergy() {
		return this.allergy;
	}
	public void setAllergy(String allergy) {
		this.allergy = allergy;
	}

	public String getConditionDesc() {
		return this.conditionDesc;
	}
	public void setConditionDesc(String conditionDesc) {
		this.conditionDesc = conditionDesc;
	}

	public String getDisease() {
		return this.disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getGestation() {
		return this.gestation;
	}
	public void setGestation(String gestation) {
		this.gestation = gestation;
	}

	public String getHeight() {
		return this.height;
	}
	public void setHeight(String height) {
		this.height = height;
	}

	public String getHopeHelp() {
		return this.hopeHelp;
	}
	public void setHopeHelp(String hopeHelp) {
		this.hopeHelp = hopeHelp;
	}

	public String getHospital() {
		return this.hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public String getIllnessHistory() {
		return this.illnessHistory;
	}
	public void setIllnessHistory(String illnessHistory) {
		this.illnessHistory = illnessHistory;
	}

	public String getMedicineCondition() {
		return this.medicineCondition;
	}
	public void setMedicineCondition(String medicineCondition) {
		this.medicineCondition = medicineCondition;
	}

	public String getPatientCourseTime() {
		return this.patientCourseTime;
	}
	public void setPatientCourseTime(String patientCourseTime) {
		this.patientCourseTime = patientCourseTime;
	}

	public String getWeight() {
		return this.weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}

}
