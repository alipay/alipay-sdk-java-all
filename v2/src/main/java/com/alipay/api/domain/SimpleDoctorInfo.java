package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医生列表
 *
 * @author auto create
 * @since 1.0, 2026-08-27 20:32:51
 */
public class SimpleDoctorInfo extends AlipayObject {

	private static final long serialVersionUID = 6257418584678787428L;

	/**
	 * 医生ID
	 */
	@ApiField("doctor_id")
	private String doctorId;

	/**
	 * 医生名称
	 */
	@ApiField("doctor_name")
	private String doctorName;

	/**
	 * 医生在线标识，1：在线 0：不在线
	 */
	@ApiField("doctor_online_flag")
	private Long doctorOnlineFlag;

	/**
	 * 病友推荐度，5分制
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
	@ApiListField("medical_record_disease_list")
	@ApiField("doctor_record_disease")
	private List<DoctorRecordDisease> medicalRecordDiseaseList;

	/**
	 * null
	 */
	@ApiListField("service_info")
	@ApiField("doctor_service_info")
	private List<DoctorServiceInfo> serviceInfo;

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

	public Long getDoctorOnlineFlag() {
		return this.doctorOnlineFlag;
	}
	public void setDoctorOnlineFlag(Long doctorOnlineFlag) {
		this.doctorOnlineFlag = doctorOnlineFlag;
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

	public List<DoctorRecordDisease> getMedicalRecordDiseaseList() {
		return this.medicalRecordDiseaseList;
	}
	public void setMedicalRecordDiseaseList(List<DoctorRecordDisease> medicalRecordDiseaseList) {
		this.medicalRecordDiseaseList = medicalRecordDiseaseList;
	}

	public List<DoctorServiceInfo> getServiceInfo() {
		return this.serviceInfo;
	}
	public void setServiceInfo(List<DoctorServiceInfo> serviceInfo) {
		this.serviceInfo = serviceInfo;
	}

}
