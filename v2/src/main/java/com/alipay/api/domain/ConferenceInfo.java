package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 视频会议信息
 *
 * @author auto create
 * @since 1.0, 2025-10-17 14:44:06
 */
public class ConferenceInfo extends AlipayObject {

	private static final long serialVersionUID = 8696846496975775762L;

	/**
	 * 单位秒
	 */
	@ApiField("duration")
	private Long duration;

	/**
	 * 单位秒
	 */
	@ApiField("remaining_duration")
	private Long remainingDuration;

	/**
	 * 单位秒
	 */
	@ApiField("remaining_scheduled_start_duration")
	private Long remainingScheduledStartDuration;

	/**
	 * 0: 未开始 1：进行中 2：已结束 3：已取消
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 视频会议ID
	 */
	@ApiField("video_conference_id")
	private Long videoConferenceId;

	public Long getDuration() {
		return this.duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public Long getRemainingDuration() {
		return this.remainingDuration;
	}
	public void setRemainingDuration(Long remainingDuration) {
		this.remainingDuration = remainingDuration;
	}

	public Long getRemainingScheduledStartDuration() {
		return this.remainingScheduledStartDuration;
	}
	public void setRemainingScheduledStartDuration(Long remainingScheduledStartDuration) {
		this.remainingScheduledStartDuration = remainingScheduledStartDuration;
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
