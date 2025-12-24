package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-11-06 10:37:41
 */
public class HDFMedicalContent extends AlipayObject {

	private static final long serialVersionUID = 1798738114754162894L;

	/**
	 * 慢性病
	 */
	@ApiField("chronic_disease")
	private HDFChronicDisease chronicDisease;

	/**
	 * 病情描述
	 */
	@ApiField("condition_desc")
	private HDFConditiondesc conditionDesc;

	/**
	 * 疾病名称
	 */
	@ApiField("disease")
	private HDFDisease disease;

	/**
	 * null
	 */
	@ApiListField("drug_allergy")
	@ApiField("h_d_f_drug_allergy")
	private List<HDFDrugAllergy> drugAllergy;

	/**
	 * null
	 */
	@ApiListField("gestation_str")
	@ApiField("h_d_f_gestation_str")
	private List<HDFGestationStr> gestationStr;

	/**
	 * 医院信息
	 */
	@ApiField("hostpital")
	private HdfHospital hostpital;

	/**
	 * null
	 */
	@ApiListField("illness_history")
	@ApiField("h_d_f_illness_history")
	private List<HDFIllnessHistory> illnessHistory;

	/**
	 * null
	 */
	@ApiListField("medicine_condition")
	@ApiField("h_d_f_medicine_condition")
	private List<HDFMedicineCondition> medicineCondition;

	/**
	 * 患病时间
	 */
	@ApiField("patient_course_time")
	private HDFPatientCourseTime patientCourseTime;

	/**
	 * 体格检查
	 */
	@ApiField("record_base")
	private HDFRecordBase recordBase;

	/**
	 * 诊疗经过
	 */
	@ApiField("treatment_process")
	private HDFHDFTreatmentProcess treatmentProcess;

	public HDFChronicDisease getChronicDisease() {
		return this.chronicDisease;
	}
	public void setChronicDisease(HDFChronicDisease chronicDisease) {
		this.chronicDisease = chronicDisease;
	}

	public HDFConditiondesc getConditionDesc() {
		return this.conditionDesc;
	}
	public void setConditionDesc(HDFConditiondesc conditionDesc) {
		this.conditionDesc = conditionDesc;
	}

	public HDFDisease getDisease() {
		return this.disease;
	}
	public void setDisease(HDFDisease disease) {
		this.disease = disease;
	}

	public List<HDFDrugAllergy> getDrugAllergy() {
		return this.drugAllergy;
	}
	public void setDrugAllergy(List<HDFDrugAllergy> drugAllergy) {
		this.drugAllergy = drugAllergy;
	}

	public List<HDFGestationStr> getGestationStr() {
		return this.gestationStr;
	}
	public void setGestationStr(List<HDFGestationStr> gestationStr) {
		this.gestationStr = gestationStr;
	}

	public HdfHospital getHostpital() {
		return this.hostpital;
	}
	public void setHostpital(HdfHospital hostpital) {
		this.hostpital = hostpital;
	}

	public List<HDFIllnessHistory> getIllnessHistory() {
		return this.illnessHistory;
	}
	public void setIllnessHistory(List<HDFIllnessHistory> illnessHistory) {
		this.illnessHistory = illnessHistory;
	}

	public List<HDFMedicineCondition> getMedicineCondition() {
		return this.medicineCondition;
	}
	public void setMedicineCondition(List<HDFMedicineCondition> medicineCondition) {
		this.medicineCondition = medicineCondition;
	}

	public HDFPatientCourseTime getPatientCourseTime() {
		return this.patientCourseTime;
	}
	public void setPatientCourseTime(HDFPatientCourseTime patientCourseTime) {
		this.patientCourseTime = patientCourseTime;
	}

	public HDFRecordBase getRecordBase() {
		return this.recordBase;
	}
	public void setRecordBase(HDFRecordBase recordBase) {
		this.recordBase = recordBase;
	}

	public HDFHDFTreatmentProcess getTreatmentProcess() {
		return this.treatmentProcess;
	}
	public void setTreatmentProcess(HDFHDFTreatmentProcess treatmentProcess) {
		this.treatmentProcess = treatmentProcess;
	}

}
