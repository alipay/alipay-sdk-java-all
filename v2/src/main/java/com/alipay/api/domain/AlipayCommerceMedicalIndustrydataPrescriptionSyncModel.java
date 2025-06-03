package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 处方单回流接口
 *
 * @author auto create
 * @since 1.0, 2025-01-06 16:06:20
 */
public class AlipayCommerceMedicalIndustrydataPrescriptionSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2525546447626689953L;

	/**
	 * 支付宝用户openId
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝问诊单id
	 */
	@ApiField("alipay_order_id")
	private String alipayOrderId;

	/**
	 * 支付宝用户的userId
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 审方药师姓名
	 */
	@ApiField("audit_pharmacist_name")
	private String auditPharmacistName;

	/**
	 * 诊断结果
	 */
	@ApiField("clinic_desc")
	private String clinicDesc;

	/**
	 * 开方医生名称
	 */
	@ApiField("doctor_name")
	private String doctorName;

	/**
	 * 处方药品
	 */
	@ApiListField("drug_list")
	@ApiField("platform_prescription_drug_info")
	private List<PlatformPrescriptionDrugInfo> drugList;

	/**
	 * 分组号
	 */
	@ApiField("group_no")
	private String groupNo;

	/**
	 * 开具处方的互联网医院全称
	 */
	@ApiField("medical_institution_name")
	private String medicalInstitutionName;

	/**
	 * 开方外部医生ID
	 */
	@ApiField("merchant_doctor_id")
	private String merchantDoctorId;

	/**
	 * 外部用户id
	 */
	@ApiField("merchant_user_id")
	private String merchantUserId;

	/**
	 * 外部审方药师id
	 */
	@ApiField("out_audit_pharmacist_id")
	private String outAuditPharmacistId;

	/**
	 * 外部问诊单id
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 外部处方id
	 */
	@ApiField("out_prescription_id")
	private String outPrescriptionId;

	/**
	 * 外部处方跳转链接
	 */
	@ApiField("out_prescription_url")
	private String outPrescriptionUrl;

	/**
	 * 患者年龄
	 */
	@ApiField("patient_age")
	private String patientAge;

	/**
	 * 患者身份证号
	 */
	@ApiField("patient_idcard")
	private String patientIdcard;

	/**
	 * 患者姓名
	 */
	@ApiField("patient_name")
	private String patientName;

	/**
	 * 患者手机号
	 */
	@ApiField("patient_phone")
	private String patientPhone;

	/**
	 * 患者性别
枚举值：
男：MALE 
女：FEMALE
	 */
	@ApiField("patient_sex")
	private String patientSex;

	/**
	 * 外部平台编号
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 处方状态
	 */
	@ApiField("prescription_status")
	private String prescriptionStatus;

	/**
	 * 开方时间
	 */
	@ApiField("prescription_time")
	private Date prescriptionTime;

	/**
	 * 处方类型：
中药 CHINESE_MEDICINE、西药 WESTERN_MEDICINE
	 */
	@ApiField("prescription_type")
	private String prescriptionType;

	/**
	 * 中药处方症型
	 */
	@ApiField("syndrome_type")
	private String syndromeType;

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayOrderId() {
		return this.alipayOrderId;
	}
	public void setAlipayOrderId(String alipayOrderId) {
		this.alipayOrderId = alipayOrderId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getAuditPharmacistName() {
		return this.auditPharmacistName;
	}
	public void setAuditPharmacistName(String auditPharmacistName) {
		this.auditPharmacistName = auditPharmacistName;
	}

	public String getClinicDesc() {
		return this.clinicDesc;
	}
	public void setClinicDesc(String clinicDesc) {
		this.clinicDesc = clinicDesc;
	}

	public String getDoctorName() {
		return this.doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public List<PlatformPrescriptionDrugInfo> getDrugList() {
		return this.drugList;
	}
	public void setDrugList(List<PlatformPrescriptionDrugInfo> drugList) {
		this.drugList = drugList;
	}

	public String getGroupNo() {
		return this.groupNo;
	}
	public void setGroupNo(String groupNo) {
		this.groupNo = groupNo;
	}

	public String getMedicalInstitutionName() {
		return this.medicalInstitutionName;
	}
	public void setMedicalInstitutionName(String medicalInstitutionName) {
		this.medicalInstitutionName = medicalInstitutionName;
	}

	public String getMerchantDoctorId() {
		return this.merchantDoctorId;
	}
	public void setMerchantDoctorId(String merchantDoctorId) {
		this.merchantDoctorId = merchantDoctorId;
	}

	public String getMerchantUserId() {
		return this.merchantUserId;
	}
	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}

	public String getOutAuditPharmacistId() {
		return this.outAuditPharmacistId;
	}
	public void setOutAuditPharmacistId(String outAuditPharmacistId) {
		this.outAuditPharmacistId = outAuditPharmacistId;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getOutPrescriptionId() {
		return this.outPrescriptionId;
	}
	public void setOutPrescriptionId(String outPrescriptionId) {
		this.outPrescriptionId = outPrescriptionId;
	}

	public String getOutPrescriptionUrl() {
		return this.outPrescriptionUrl;
	}
	public void setOutPrescriptionUrl(String outPrescriptionUrl) {
		this.outPrescriptionUrl = outPrescriptionUrl;
	}

	public String getPatientAge() {
		return this.patientAge;
	}
	public void setPatientAge(String patientAge) {
		this.patientAge = patientAge;
	}

	public String getPatientIdcard() {
		return this.patientIdcard;
	}
	public void setPatientIdcard(String patientIdcard) {
		this.patientIdcard = patientIdcard;
	}

	public String getPatientName() {
		return this.patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientPhone() {
		return this.patientPhone;
	}
	public void setPatientPhone(String patientPhone) {
		this.patientPhone = patientPhone;
	}

	public String getPatientSex() {
		return this.patientSex;
	}
	public void setPatientSex(String patientSex) {
		this.patientSex = patientSex;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
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

	public String getSyndromeType() {
		return this.syndromeType;
	}
	public void setSyndromeType(String syndromeType) {
		this.syndromeType = syndromeType;
	}

}
