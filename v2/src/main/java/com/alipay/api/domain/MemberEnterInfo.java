package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户进入信息
 *
 * @author auto create
 * @since 1.0, 2025-10-17 14:44:05
 */
public class MemberEnterInfo extends AlipayObject {

	private static final long serialVersionUID = 4711373211954372696L;

	/**
	 * 医生是否进入过会议室
	 */
	@ApiField("doctor_has_entered")
	private Boolean doctorHasEntered;

	/**
	 * 医生是否在会议室中
	 */
	@ApiField("doctor_is_present")
	private Boolean doctorIsPresent;

	/**
	 * 患者是否在会议室中
	 */
	@ApiField("patient_is_present")
	private Boolean patientIsPresent;

	/**
	 * 视频会议ID
	 */
	@ApiField("video_conference_id")
	private Long videoConferenceId;

	public Boolean getDoctorHasEntered() {
		return this.doctorHasEntered;
	}
	public void setDoctorHasEntered(Boolean doctorHasEntered) {
		this.doctorHasEntered = doctorHasEntered;
	}

	public Boolean getDoctorIsPresent() {
		return this.doctorIsPresent;
	}
	public void setDoctorIsPresent(Boolean doctorIsPresent) {
		this.doctorIsPresent = doctorIsPresent;
	}

	public Boolean getPatientIsPresent() {
		return this.patientIsPresent;
	}
	public void setPatientIsPresent(Boolean patientIsPresent) {
		this.patientIsPresent = patientIsPresent;
	}

	public Long getVideoConferenceId() {
		return this.videoConferenceId;
	}
	public void setVideoConferenceId(Long videoConferenceId) {
		this.videoConferenceId = videoConferenceId;
	}

}
