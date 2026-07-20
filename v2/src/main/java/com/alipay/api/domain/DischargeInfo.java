package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出院小结
 *
 * @author auto create
 * @since 1.0, 2026-07-17 16:32:52
 */
public class DischargeInfo extends AlipayObject {

	private static final long serialVersionUID = 3257611662134865826L;

	/**
	 * 病人主诉
	 */
	@ApiField("complaint")
	private String complaint;

	/**
	 * 处理及意见
	 */
	@ApiField("discharge_treatment_advice")
	private String dischargeTreatmentAdvice;

	/**
	 * 既往病史
	 */
	@ApiField("illness_history")
	private String illnessHistory;

	/**
	 * 出院诊断结果
	 */
	@ApiField("medicine_diagnosis")
	private String medicineDiagnosis;

	/**
	 * 住院期间检查结果
	 */
	@ApiField("physical_exam")
	private String physicalExam;

	/**
	 * 中医四诊，中医时才有
	 */
	@ApiField("tcm_four_diagnosis")
	private String tcmFourDiagnosis;

	/**
	 * 中医诊断结果，中医时才有
	 */
	@ApiField("traditional_chinese_medicine_diagnosis")
	private String traditionalChineseMedicineDiagnosis;

	/**
	 * 处理及意见
	 */
	@ApiField("treatment_advice")
	private String treatmentAdvice;

	public String getComplaint() {
		return this.complaint;
	}
	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}

	public String getDischargeTreatmentAdvice() {
		return this.dischargeTreatmentAdvice;
	}
	public void setDischargeTreatmentAdvice(String dischargeTreatmentAdvice) {
		this.dischargeTreatmentAdvice = dischargeTreatmentAdvice;
	}

	public String getIllnessHistory() {
		return this.illnessHistory;
	}
	public void setIllnessHistory(String illnessHistory) {
		this.illnessHistory = illnessHistory;
	}

	public String getMedicineDiagnosis() {
		return this.medicineDiagnosis;
	}
	public void setMedicineDiagnosis(String medicineDiagnosis) {
		this.medicineDiagnosis = medicineDiagnosis;
	}

	public String getPhysicalExam() {
		return this.physicalExam;
	}
	public void setPhysicalExam(String physicalExam) {
		this.physicalExam = physicalExam;
	}

	public String getTcmFourDiagnosis() {
		return this.tcmFourDiagnosis;
	}
	public void setTcmFourDiagnosis(String tcmFourDiagnosis) {
		this.tcmFourDiagnosis = tcmFourDiagnosis;
	}

	public String getTraditionalChineseMedicineDiagnosis() {
		return this.traditionalChineseMedicineDiagnosis;
	}
	public void setTraditionalChineseMedicineDiagnosis(String traditionalChineseMedicineDiagnosis) {
		this.traditionalChineseMedicineDiagnosis = traditionalChineseMedicineDiagnosis;
	}

	public String getTreatmentAdvice() {
		return this.treatmentAdvice;
	}
	public void setTreatmentAdvice(String treatmentAdvice) {
		this.treatmentAdvice = treatmentAdvice;
	}

}
