package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 处方
 *
 * @author auto create
 * @since 1.0, 2025-11-06 10:37:41
 */
public class HDFPrescription extends AlipayObject {

	private static final long serialVersionUID = 1558459225437214749L;

	/**
	 * 审核时间
	 */
	@ApiField("check_time")
	private String checkTime;

	/**
	 * 开方医生ID
	 */
	@ApiField("create_doctor_id")
	private String createDoctorId;

	/**
	 * 开方医生姓名
	 */
	@ApiField("create_doctor_name")
	private String createDoctorName;

	/**
	 * 开方时间（ISO或yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 可含ICD10编码，多个用分隔符
	 */
	@ApiField("diagnosis")
	private String diagnosis;

	/**
	 * null
	 */
	@ApiListField("drug_info")
	@ApiField("h_d_f_drug_info")
	private List<HDFDrugInfo> drugInfo;

	/**
	 * 处方过期时间
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/**
	 * 就诊科室
	 */
	@ApiField("faculty_name")
	private String facultyName;

	/**
	 * 合作方唯一处方标识
	 */
	@ApiField("partner_prescription_id")
	private String partnerPrescriptionId;

	/**
	 * 患者姓名
	 */
	@ApiField("patient_age")
	private Long patientAge;

	/**
	 * 患者姓名
	 */
	@ApiField("patient_name")
	private String patientName;

	/**
	 * 患者性别
	 */
	@ApiField("patient_sex")
	private String patientSex;

	/**
	 * 审核药师ID
	 */
	@ApiField("pharmacist_id")
	private String pharmacistId;

	/**
	 * 审核药师姓名
	 */
	@ApiField("pharmacist_name")
	private String pharmacistName;

	/**
	 * 处方ID（系统唯一标识）
	 */
	@ApiField("prescription_id")
	private String prescriptionId;

	/**
	 * 处方单补充说明
	 */
	@ApiField("prescription_note")
	private String prescriptionNote;

	/**
	 * 单位kg
	 */
	@ApiField("weight")
	private String weight;

	public String getCheckTime() {
		return this.checkTime;
	}
	public void setCheckTime(String checkTime) {
		this.checkTime = checkTime;
	}

	public String getCreateDoctorId() {
		return this.createDoctorId;
	}
	public void setCreateDoctorId(String createDoctorId) {
		this.createDoctorId = createDoctorId;
	}

	public String getCreateDoctorName() {
		return this.createDoctorName;
	}
	public void setCreateDoctorName(String createDoctorName) {
		this.createDoctorName = createDoctorName;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDiagnosis() {
		return this.diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public List<HDFDrugInfo> getDrugInfo() {
		return this.drugInfo;
	}
	public void setDrugInfo(List<HDFDrugInfo> drugInfo) {
		this.drugInfo = drugInfo;
	}

	public Date getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public String getFacultyName() {
		return this.facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public String getPartnerPrescriptionId() {
		return this.partnerPrescriptionId;
	}
	public void setPartnerPrescriptionId(String partnerPrescriptionId) {
		this.partnerPrescriptionId = partnerPrescriptionId;
	}

	public Long getPatientAge() {
		return this.patientAge;
	}
	public void setPatientAge(Long patientAge) {
		this.patientAge = patientAge;
	}

	public String getPatientName() {
		return this.patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientSex() {
		return this.patientSex;
	}
	public void setPatientSex(String patientSex) {
		this.patientSex = patientSex;
	}

	public String getPharmacistId() {
		return this.pharmacistId;
	}
	public void setPharmacistId(String pharmacistId) {
		this.pharmacistId = pharmacistId;
	}

	public String getPharmacistName() {
		return this.pharmacistName;
	}
	public void setPharmacistName(String pharmacistName) {
		this.pharmacistName = pharmacistName;
	}

	public String getPrescriptionId() {
		return this.prescriptionId;
	}
	public void setPrescriptionId(String prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

	public String getPrescriptionNote() {
		return this.prescriptionNote;
	}
	public void setPrescriptionNote(String prescriptionNote) {
		this.prescriptionNote = prescriptionNote;
	}

	public String getWeight() {
		return this.weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}

}
