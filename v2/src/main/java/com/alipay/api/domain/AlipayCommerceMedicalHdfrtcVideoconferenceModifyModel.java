package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 更新视频会议
 *
 * @author auto create
 * @since 1.0, 2025-10-17 14:44:13
 */
public class AlipayCommerceMedicalHdfrtcVideoconferenceModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7634949424571371925L;

	/**
	 * 视频结束时间
	 */
	@ApiField("real_end_time")
	private Date realEndTime;

	/**
	 * 来源类型
	 */
	@ApiField("source_type")
	private String sourceType;

	/**
	 * 视频状态
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 视频会议ID
	 */
	@ApiField("video_conference_id")
	private Long videoConferenceId;

	public Date getRealEndTime() {
		return this.realEndTime;
	}
	public void setRealEndTime(Date realEndTime) {
		this.realEndTime = realEndTime;
	}

	public String getSourceType() {
		return this.sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getVideoConferenceId() {
		return this.videoConferenceId;
	}
	public void setVideoConferenceId(Long videoConferenceId) {
		this.videoConferenceId = videoConferenceId;
	}

}
