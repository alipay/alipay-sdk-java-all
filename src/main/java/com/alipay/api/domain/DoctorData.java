package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医生数据
 *
 * @author auto create
 * @since 1.0, 2022-06-20 14:30:48
 */
public class DoctorData extends AlipayObject {

	private static final long serialVersionUID = 4897729365281435132L;

	/**
	 * 学术职称
	 */
	@ApiField("academic_title")
	private String academicTitle;

	/**
	 * 医生id
	 */
	@ApiField("doctor_id")
	private String doctorId;

	/**
	 * 医生个人介绍
	 */
	@ApiField("doctor_introduction")
	private String doctorIntroduction;

	/**
	 * 医生姓名
	 */
	@ApiField("doctor_name")
	private String doctorName;

	/**
	 * 医生头像
	 */
	@ApiField("doctor_photo")
	private String doctorPhoto;

	/**
	 * 医生标签
	 */
	@ApiField("doctor_tag")
	private String doctorTag;

	/**
	 * 医生挂号服务跳转链接
	 */
	@ApiField("doctor_url")
	private String doctorUrl;

	/**
	 * 执医年限
	 */
	@ApiField("medical_practice_years")
	private String medicalPracticeYears;

	/**
	 * 擅长疾病
	 */
	@ApiListField("skilled_disease")
	@ApiField("disease_data")
	private List<DiseaseData> skilledDisease;

	/**
	 * 擅长疾病描述
	 */
	@ApiField("skilled_disease_desc")
	private String skilledDiseaseDesc;

	/**
	 * 工作信息
	 */
	@ApiListField("work_info")
	@ApiField("doctor_work_info")
	private List<DoctorWorkInfo> workInfo;

	/**
	 * 排班时间
	 */
	@ApiField("work_time")
	private String workTime;

	public String getAcademicTitle() {
		return this.academicTitle;
	}
	public void setAcademicTitle(String academicTitle) {
		this.academicTitle = academicTitle;
	}

	public String getDoctorId() {
		return this.doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorIntroduction() {
		return this.doctorIntroduction;
	}
	public void setDoctorIntroduction(String doctorIntroduction) {
		this.doctorIntroduction = doctorIntroduction;
	}

	public String getDoctorName() {
		return this.doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorPhoto() {
		return this.doctorPhoto;
	}
	public void setDoctorPhoto(String doctorPhoto) {
		this.doctorPhoto = doctorPhoto;
	}

	public String getDoctorTag() {
		return this.doctorTag;
	}
	public void setDoctorTag(String doctorTag) {
		this.doctorTag = doctorTag;
	}

	public String getDoctorUrl() {
		return this.doctorUrl;
	}
	public void setDoctorUrl(String doctorUrl) {
		this.doctorUrl = doctorUrl;
	}

	public String getMedicalPracticeYears() {
		return this.medicalPracticeYears;
	}
	public void setMedicalPracticeYears(String medicalPracticeYears) {
		this.medicalPracticeYears = medicalPracticeYears;
	}

	public List<DiseaseData> getSkilledDisease() {
		return this.skilledDisease;
	}
	public void setSkilledDisease(List<DiseaseData> skilledDisease) {
		this.skilledDisease = skilledDisease;
	}

	public String getSkilledDiseaseDesc() {
		return this.skilledDiseaseDesc;
	}
	public void setSkilledDiseaseDesc(String skilledDiseaseDesc) {
		this.skilledDiseaseDesc = skilledDiseaseDesc;
	}

	public List<DoctorWorkInfo> getWorkInfo() {
		return this.workInfo;
	}
	public void setWorkInfo(List<DoctorWorkInfo> workInfo) {
		this.workInfo = workInfo;
	}

	public String getWorkTime() {
		return this.workTime;
	}
	public void setWorkTime(String workTime) {
		this.workTime = workTime;
	}

}
