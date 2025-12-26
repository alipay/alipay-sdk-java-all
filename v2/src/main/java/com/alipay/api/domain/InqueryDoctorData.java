package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 在线问诊医生基础信息
 *
 * @author auto create
 * @since 1.0, 2024-08-01 17:07:50
 */
public class InqueryDoctorData extends AlipayObject {

	private static final long serialVersionUID = 3771112482794638372L;

	/**
	 * 医生是否认证 1 已认证 0 未认证
	 */
	@ApiField("auth_status")
	private String authStatus;

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
	 * 教育职称
	 */
	@ApiField("educate_grade")
	private String educateGrade;

	/**
	 * 可以与支付宝侧关联的外部标准科室id
	 */
	@ApiField("ext_depart_id")
	private String extDepartId;

	/**
	 * 可以与支付宝侧关联的外部标准疾病id列表
	 */
	@ApiListField("ext_disease_id_list")
	@ApiField("string")
	private List<String> extDiseaseIdList;

	/**
	 * 外部自己医生的唯一标识
	 */
	@ApiField("ext_doctor_id")
	private String extDoctorId;

	/**
	 * 可以与支付宝侧关联的外部标准医院id
	 */
	@ApiField("ext_hospital_id")
	private String extHospitalId;

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
	 * 执医年限，单位年
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
专业标签数量不固定
	 */
	@ApiField("special_tags")
	private String specialTags;

	/**
	 * 医生职称
	 */
	@ApiField("title")
	private String title;

	public String getAuthStatus() {
		return this.authStatus;
	}
	public void setAuthStatus(String authStatus) {
		this.authStatus = authStatus;
	}

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

	public String getEducateGrade() {
		return this.educateGrade;
	}
	public void setEducateGrade(String educateGrade) {
		this.educateGrade = educateGrade;
	}

	public String getExtDepartId() {
		return this.extDepartId;
	}
	public void setExtDepartId(String extDepartId) {
		this.extDepartId = extDepartId;
	}

	public List<String> getExtDiseaseIdList() {
		return this.extDiseaseIdList;
	}
	public void setExtDiseaseIdList(List<String> extDiseaseIdList) {
		this.extDiseaseIdList = extDiseaseIdList;
	}

	public String getExtDoctorId() {
		return this.extDoctorId;
	}
	public void setExtDoctorId(String extDoctorId) {
		this.extDoctorId = extDoctorId;
	}

	public String getExtHospitalId() {
		return this.extHospitalId;
	}
	public void setExtHospitalId(String extHospitalId) {
		this.extHospitalId = extHospitalId;
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
