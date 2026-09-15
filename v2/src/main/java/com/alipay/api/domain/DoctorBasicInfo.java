package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-27 20:07:48
 */
public class DoctorBasicInfo extends AlipayObject {

	private static final long serialVersionUID = 8133782486987535623L;

	/**
	 * 个人简介
	 */
	@ApiField("brief_intro")
	private String briefIntro;

	/**
	 * 行业医生id
	 */
	@ApiField("doctor_inner_id")
	private String doctorInnerId;

	/**
	 * 医生名称
	 */
	@ApiField("doctor_name")
	private String doctorName;

	/**
	 * 医生在线标识
	 */
	@ApiField("doctor_online_flag")
	private String doctorOnlineFlag;

	/**
	 * 好大夫医生id
	 */
	@ApiField("hdf_doctor_id")
	private String hdfDoctorId;

	/**
	 * 医院名称
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	/**
	 * 综合病友推荐度
	 */
	@ApiField("hot_rank")
	private String hotRank;

	/**
	 * 接诊量
	 */
	@ApiField("medical_record_cnt")
	private Long medicalRecordCnt;

	/**
	 * null
	 */
	@ApiListField("service_button_info_list")
	@ApiField("service_button_info")
	private List<ServiceButtonInfo> serviceButtonInfoList;

	/**
	 * 擅长技能描述
	 */
	@ApiField("skilled_desc")
	private String skilledDesc;

	/**
	 * 职称
	 */
	@ApiField("title")
	private String title;

	/**
	 * null
	 */
	@ApiListField("treatment_experience_list")
	@ApiField("treat_experience_info")
	private List<TreatExperienceInfo> treatmentExperienceList;

	public String getBriefIntro() {
		return this.briefIntro;
	}
	public void setBriefIntro(String briefIntro) {
		this.briefIntro = briefIntro;
	}

	public String getDoctorInnerId() {
		return this.doctorInnerId;
	}
	public void setDoctorInnerId(String doctorInnerId) {
		this.doctorInnerId = doctorInnerId;
	}

	public String getDoctorName() {
		return this.doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorOnlineFlag() {
		return this.doctorOnlineFlag;
	}
	public void setDoctorOnlineFlag(String doctorOnlineFlag) {
		this.doctorOnlineFlag = doctorOnlineFlag;
	}

	public String getHdfDoctorId() {
		return this.hdfDoctorId;
	}
	public void setHdfDoctorId(String hdfDoctorId) {
		this.hdfDoctorId = hdfDoctorId;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getHotRank() {
		return this.hotRank;
	}
	public void setHotRank(String hotRank) {
		this.hotRank = hotRank;
	}

	public Long getMedicalRecordCnt() {
		return this.medicalRecordCnt;
	}
	public void setMedicalRecordCnt(Long medicalRecordCnt) {
		this.medicalRecordCnt = medicalRecordCnt;
	}

	public List<ServiceButtonInfo> getServiceButtonInfoList() {
		return this.serviceButtonInfoList;
	}
	public void setServiceButtonInfoList(List<ServiceButtonInfo> serviceButtonInfoList) {
		this.serviceButtonInfoList = serviceButtonInfoList;
	}

	public String getSkilledDesc() {
		return this.skilledDesc;
	}
	public void setSkilledDesc(String skilledDesc) {
		this.skilledDesc = skilledDesc;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public List<TreatExperienceInfo> getTreatmentExperienceList() {
		return this.treatmentExperienceList;
	}
	public void setTreatmentExperienceList(List<TreatExperienceInfo> treatmentExperienceList) {
		this.treatmentExperienceList = treatmentExperienceList;
	}

}
