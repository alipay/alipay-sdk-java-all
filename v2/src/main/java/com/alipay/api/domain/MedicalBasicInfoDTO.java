package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医嘱基础信息，包括患者信息、就诊卡号、就诊科室、开单医生信息、诊断信息
 *
 * @author auto create
 * @since 1.0, 2026-09-14 14:13:01
 */
public class MedicalBasicInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 7817635627466977677L;

	/**
	 * 诊断信息
	 */
	@ApiField("diagnosis_info")
	private DiagnosisInfoDTO diagnosisInfo;

	/**
	 * 就诊科室
	 */
	@ApiField("faculty_name")
	private String facultyName;

	/**
	 * 就诊卡号
	 */
	@ApiField("medical_card_no")
	private String medicalCardNo;

	/**
	 * 开单医生信息
	 */
	@ApiField("open_order_doctor_info")
	private DoctorInfoDTO openOrderDoctorInfo;

	/**
	 * 患者信息
	 */
	@ApiField("patient_info")
	private PatientInfoDTO patientInfo;

	public DiagnosisInfoDTO getDiagnosisInfo() {
		return this.diagnosisInfo;
	}
	public void setDiagnosisInfo(DiagnosisInfoDTO diagnosisInfo) {
		this.diagnosisInfo = diagnosisInfo;
	}

	public String getFacultyName() {
		return this.facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public String getMedicalCardNo() {
		return this.medicalCardNo;
	}
	public void setMedicalCardNo(String medicalCardNo) {
		this.medicalCardNo = medicalCardNo;
	}

	public DoctorInfoDTO getOpenOrderDoctorInfo() {
		return this.openOrderDoctorInfo;
	}
	public void setOpenOrderDoctorInfo(DoctorInfoDTO openOrderDoctorInfo) {
		this.openOrderDoctorInfo = openOrderDoctorInfo;
	}

	public PatientInfoDTO getPatientInfo() {
		return this.patientInfo;
	}
	public void setPatientInfo(PatientInfoDTO patientInfo) {
		this.patientInfo = patientInfo;
	}

}
