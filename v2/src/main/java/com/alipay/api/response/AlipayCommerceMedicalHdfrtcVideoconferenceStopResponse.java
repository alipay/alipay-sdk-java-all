package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdfrtc.videoconference.stop response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-21 11:07:41
 */
public class AlipayCommerceMedicalHdfrtcVideoconferenceStopResponse extends AlipayResponse {

	private static final long serialVersionUID = 3335529631881883835L;

	/** 
	 * 视频时长（单位秒）
	 */
	@ApiField("video_consult_time")
	private Long videoConsultTime;

	public void setVideoConsultTime(Long videoConsultTime) {
		this.videoConsultTime = videoConsultTime;
	}
	public Long getVideoConsultTime( ) {
		return this.videoConsultTime;
	}

}
