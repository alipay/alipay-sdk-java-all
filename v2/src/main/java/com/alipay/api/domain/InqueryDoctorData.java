package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 在线问诊医生基础信息
 *
 * @author auto create
 * @since 1.0, 2022-12-27 11:50:56
 */
public class InqueryDoctorData extends AlipayObject {

	private static final long serialVersionUID = 5137662635353343971L;

	/**
	 * 医生头像
	 */
	@ApiField("avator")
	private String avator;

	/**
	 * 变更类型
	 */
	@ApiField("change_type")
	private String changeType;

	/**
	 * 执业医院科室（多个科室时用英文逗号分隔）
	 */
	@ApiField("department_name")
	private String departmentName;

	/**
	 * 医生个人简介
	 */
	@ApiField("doctor_desc")
	private String doctorDesc;

	/**
	 * 医生名称
	 */
	@ApiField("doctor_name")
	private String doctorName;

	/**
	 * 医生性别
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 执业医院名称
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	/**
	 * 身份证号（医生执医许可证编号和身份证号至少填一项）
	 */
	@ApiField("id_no")
	private String idNo;

	/**
	 * 执医年限
	 */
	@ApiField("practice_year")
	private String practiceYear;

	/**
	 * 医生执医许可证编号（医生执医许可证编号和身份证号至少填一项）
	 */
	@ApiField("practicing_doctor_certificate_no")
	private String practicingDoctorCertificateNo;

	/**
	 * 医生擅长描述
	 */
	@ApiField("skilled_desc")
	private String skilledDesc;

	/**
	 * 医生擅长疾病（多个擅长疾病时用英文逗号分隔）
	 */
	@ApiField("skilled_disease")
	private String skilledDisease;

	/**
	 * 医生专业标签（多个标签时用英文逗号分隔）
	 */
	@ApiField("special_tags")
	private String specialTags;

	/**
	 * 医生职称
	 */
	@ApiField("title")
	private String title;

	public String getAvator() {
		return this.avator;
	}
	public void setAvator(String avator) {
		this.avator = avator;
	}

	public String getChangeType() {
		return this.changeType;
	}
	public void setChangeType(String changeType) {
		this.changeType = changeType;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDoctorDesc() {
		return this.doctorDesc;
	}
	public void setDoctorDesc(String doctorDesc) {
		this.doctorDesc = doctorDesc;
	}

	public String getDoctorName() {
		return this.doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getIdNo() {
		return this.idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getPracticeYear() {
		return this.practiceYear;
	}
	public void setPracticeYear(String practiceYear) {
		this.practiceYear = practiceYear;
	}

	public String getPracticingDoctorCertificateNo() {
		return this.practicingDoctorCertificateNo;
	}
	public void setPracticingDoctorCertificateNo(String practicingDoctorCertificateNo) {
		this.practicingDoctorCertificateNo = practicingDoctorCertificateNo;
	}

	public String getSkilledDesc() {
		return this.skilledDesc;
	}
	public void setSkilledDesc(String skilledDesc) {
		this.skilledDesc = skilledDesc;
	}

	public String getSkilledDisease() {
		return this.skilledDisease;
	}
	public void setSkilledDisease(String skilledDisease) {
		this.skilledDisease = skilledDisease;
	}

	public String getSpecialTags() {
		return this.specialTags;
	}
	public void setSpecialTags(String specialTags) {
		this.specialTags = specialTags;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
