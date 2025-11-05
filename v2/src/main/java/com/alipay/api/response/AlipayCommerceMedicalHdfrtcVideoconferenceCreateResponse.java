package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdfrtc.videoconference.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-17 14:44:10
 */
public class AlipayCommerceMedicalHdfrtcVideoconferenceCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2183767125732917426L;

	/** 
	 * 视频会议ID
	 */
	@ApiField("video_conference_id")
	private Long videoConferenceId;

	public void setVideoConferenceId(Long videoConferenceId) {
		this.videoConferenceId = videoConferenceId;
	}
	public Long getVideoConferenceId( ) {
		return this.videoConferenceId;
	}

}
