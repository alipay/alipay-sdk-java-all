package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 开方购药处方单同步
 *
 * @author auto create
 * @since 1.0, 2025-04-23 14:47:17
 */
public class AlipayCommerceMedicalMedicinePrescriptionorderUploadModel extends AlipayObject {

	private static final long serialVersionUID = 5367751983874541429L;

	/**
	 * 科室名称
	 */
	@ApiField("depart_name")
	private String departName;

	/**
	 * 诊断列表，至少有一个主诊断，默认第一个为主诊断
	 */
	@ApiListField("disease_list")
	@ApiField("disease_info")
	private List<DiseaseInfo> diseaseList;

	/**
	 * 开方医生名称
	 */
	@ApiField("doctor_name")
	private String doctorName;

	/**
	 * 药品列表
	 */
	@ApiListField("drug_info_list")
	@ApiField("drug_info")
	private List<DrugInfo> drugInfoList;

	/**
	 * 处方过期时间点，未来的时间点
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/**
	 * 外部医生ID
	 */
	@ApiField("ext_doctor_id")
	private String extDoctorId;

	/**
	 * 外部处方编码
	 */
	@ApiField("ext_prescription_code")
	private String extPrescriptionCode;

	/**
	 * 支付宝问诊ID
	 */
	@ApiField("inquiry_id")
	private String inquiryId;

	/**
	 * 病例图片url列表（6张以内）
	 */
	@ApiListField("medical_picture_list")
	@ApiField("string")
	private List<String> medicalPictureList;

	/**
	 * 处方备注
	 */
	@ApiField("note")
	private String note;

	/**
	 * 就诊人信息
	 */
	@ApiField("patient_info")
	private PatientInfo patientInfo;

	/**
	 * 药师姓名
	 */
	@ApiField("pharmacist_name")
	private String pharmacistName;

	/**
	 * 支付宝为每个对接方分配的平台号
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 方笺pdf链接
	 */
	@ApiField("prescription_pdf")
	private String prescriptionPdf;

	/**
	 * 处方笺png链接
	 */
	@ApiField("prescription_png")
	private String prescriptionPng;

	/**
	 * 处方状态
	 */
	@ApiField("prescription_status")
	private String prescriptionStatus;

	/**
	 * 开方时间，格式 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("prescription_time")
	private Date prescriptionTime;

	/**
	 * 处方类型，XY-西药；ZY-中药
	 */
	@ApiField("prescription_type")
	private String prescriptionType;

	public String getDepartName() {
		return this.departName;
	}
	public void setDepartName(String departName) {
		this.departName = departName;
	}

	public List<DiseaseInfo> getDiseaseList() {
		return this.diseaseList;
	}
	public void setDiseaseList(List<DiseaseInfo> diseaseList) {
		this.diseaseList = diseaseList;
	}

	public String getDoctorName() {
		return this.doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public List<DrugInfo> getDrugInfoList() {
		return this.drugInfoList;
	}
	public void setDrugInfoList(List<DrugInfo> drugInfoList) {
		this.drugInfoList = drugInfoList;
	}

	public Date getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public String getExtDoctorId() {
		return this.extDoctorId;
	}
	public void setExtDoctorId(String extDoctorId) {
		this.extDoctorId = extDoctorId;
	}

	public String getExtPrescriptionCode() {
		return this.extPrescriptionCode;
	}
	public void setExtPrescriptionCode(String extPrescriptionCode) {
		this.extPrescriptionCode = extPrescriptionCode;
	}

	public String getInquiryId() {
		return this.inquiryId;
	}
	public void setInquiryId(String inquiryId) {
		this.inquiryId = inquiryId;
	}

	public List<String> getMedicalPictureList() {
		return this.medicalPictureList;
	}
	public void setMedicalPictureList(List<String> medicalPictureList) {
		this.medicalPictureList = medicalPictureList;
	}

	public String getNote() {
		return this.note;
	}
	public void setNote(String note) {
		this.note = note;
	}

	public PatientInfo getPatientInfo() {
		return this.patientInfo;
	}
	public void setPatientInfo(PatientInfo patientInfo) {
		this.patientInfo = patientInfo;
	}

	public String getPharmacistName() {
		return this.pharmacistName;
	}
	public void setPharmacistName(String pharmacistName) {
		this.pharmacistName = pharmacistName;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getPrescriptionPdf() {
		return this.prescriptionPdf;
	}
	public void setPrescriptionPdf(String prescriptionPdf) {
		this.prescriptionPdf = prescriptionPdf;
	}

	public String getPrescriptionPng() {
		return this.prescriptionPng;
	}
	public void setPrescriptionPng(String prescriptionPng) {
		this.prescriptionPng = prescriptionPng;
	}

	public String getPrescriptionStatus() {
		return this.prescriptionStatus;
	}
	public void setPrescriptionStatus(String prescriptionStatus) {
		this.prescriptionStatus = prescriptionStatus;
	}

	public Date getPrescriptionTime() {
		return this.prescriptionTime;
	}
	public void setPrescriptionTime(Date prescriptionTime) {
		this.prescriptionTime = prescriptionTime;
	}

	public String getPrescriptionType() {
		return this.prescriptionType;
	}
	public void setPrescriptionType(String prescriptionType) {
		this.prescriptionType = prescriptionType;
	}

}
