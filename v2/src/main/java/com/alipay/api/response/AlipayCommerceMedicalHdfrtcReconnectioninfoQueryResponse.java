package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdfrtc.reconnectioninfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-17 14:44:09
 */
public class AlipayCommerceMedicalHdfrtcReconnectioninfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5434778155355592599L;

	/** 
	 * 频道ID
	 */
	@ApiField("channel_id")
	private String channelId;

	/** 
	 * 是否是视频重连进入 0:否 1:是
	 */
	@ApiField("if_video_conference_reconnect")
	private Long ifVideoConferenceReconnect;

	/** 
	 * 来源ID
	 */
	@ApiField("source_id")
	private Long sourceId;

	/** 
	 * 弹窗提示文案
	 */
	@ApiField("tips")
	private String tips;

	/** 
	 * 视频会议ID
	 */
	@ApiField("video_conference_id")
	private Long videoConferenceId;

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public String getChannelId( ) {
		return this.channelId;
	}

	public void setIfVideoConferenceReconnect(Long ifVideoConferenceReconnect) {
		this.ifVideoConferenceReconnect = ifVideoConferenceReconnect;
	}
	public Long getIfVideoConferenceReconnect( ) {
		return this.ifVideoConferenceReconnect;
	}

	public void setSourceId(Long sourceId) {
		this.sourceId = sourceId;
	}
	public Long getSourceId( ) {
		return this.sourceId;
	}

	public void setTips(String tips) {
		this.tips = tips;
	}
	public String getTips( ) {
		return this.tips;
	}

	public void setVideoConferenceId(Long videoConferenceId) {
		this.videoConferenceId = videoConferenceId;
	}
	public Long getVideoConferenceId( ) {
		return this.videoConferenceId;
	}

}
