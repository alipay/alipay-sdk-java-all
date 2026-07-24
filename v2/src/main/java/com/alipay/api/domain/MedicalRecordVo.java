package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 就诊记录信息
 *
 * @author auto create
 * @since 1.0, 2026-07-23 15:21:43
 */
public class MedicalRecordVo extends AlipayObject {

	private static final long serialVersionUID = 6132271932222753481L;

	/**
	 * 头像
	 */
	@ApiField("avatar")
	private String avatar;

	/**
	 * 好大夫医生ID
	 */
	@ApiField("doctor_id")
	private String doctorId;

	/**
	 * 医生名称
	 */
	@ApiField("doctor_name")
	private String doctorName;

	/**
	 * 医院名称
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	/**
	 * 病程文字内容
	 */
	@ApiField("medical_content")
	private String medicalContent;

	/**
	 * 好大夫病程id
	 */
	@ApiField("medical_record_id")
	private String medicalRecordId;

	/**
	 * 病程title
	 */
	@ApiField("medical_title")
	private String medicalTitle;

	/**
	 * 是否三甲
	 */
	@ApiField("third_class")
	private Boolean thirdClass;

	/**
	 * 医生职称
	 */
	@ApiField("title")
	private String title;

	public String getAvatar() {
		return this.avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getDoctorId() {
		return this.doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return this.doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getMedicalContent() {
		return this.medicalContent;
	}
	public void setMedicalContent(String medicalContent) {
		this.medicalContent = medicalContent;
	}

	public String getMedicalRecordId() {
		return this.medicalRecordId;
	}
	public void setMedicalRecordId(String medicalRecordId) {
		this.medicalRecordId = medicalRecordId;
	}

	public String getMedicalTitle() {
		return this.medicalTitle;
	}
	public void setMedicalTitle(String medicalTitle) {
		this.medicalTitle = medicalTitle;
	}

	public Boolean getThirdClass() {
		return this.thirdClass;
	}
	public void setThirdClass(Boolean thirdClass) {
		this.thirdClass = thirdClass;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
