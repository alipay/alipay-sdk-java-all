package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ConferenceInfo;
import com.alipay.api.domain.DoctorDetails;
import com.alipay.api.domain.PatientDetails;
import com.alipay.api.domain.RtcBaseInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdfrtc.videoconference.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-17 14:44:07
 */
public class AlipayCommerceMedicalHdfrtcVideoconferenceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4665776244949116645L;

	/** 
	 * 会议信息
	 */
	@ApiField("conference_info")
	private ConferenceInfo conferenceInfo;

	/** 
	 * 医生信息
	 */
	@ApiField("doctor_info")
	private DoctorDetails doctorInfo;

	/** 
	 * 患者信息
	 */
	@ApiField("patient_info")
	private PatientDetails patientInfo;

	/** 
	 * 音视频相关信息
	 */
	@ApiField("rtc_base_info")
	private RtcBaseInfo rtcBaseInfo;

	public void setConferenceInfo(ConferenceInfo conferenceInfo) {
		this.conferenceInfo = conferenceInfo;
	}
	public ConferenceInfo getConferenceInfo( ) {
		return this.conferenceInfo;
	}

	public void setDoctorInfo(DoctorDetails doctorInfo) {
		this.doctorInfo = doctorInfo;
	}
	public DoctorDetails getDoctorInfo( ) {
		return this.doctorInfo;
	}

	public void setPatientInfo(PatientDetails patientInfo) {
		this.patientInfo = patientInfo;
	}
	public PatientDetails getPatientInfo( ) {
		return this.patientInfo;
	}

	public void setRtcBaseInfo(RtcBaseInfo rtcBaseInfo) {
		this.rtcBaseInfo = rtcBaseInfo;
	}
	public RtcBaseInfo getRtcBaseInfo( ) {
		return this.rtcBaseInfo;
	}

}
