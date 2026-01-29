package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保存音视频相关日志
 *
 * @author auto create
 * @since 1.0, 2025-11-19 15:37:41
 */
public class AlipayCommerceMedicalHdfrtcConferenceeventlogSaveModel extends AlipayObject {

	private static final long serialVersionUID = 2199974624896951826L;

	/**
	 * 事件内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 设备信息
	 */
	@ApiField("device_info")
	private String deviceInfo;

	/**
	 * 事件类型
	 */
	@ApiField("event_type")
	private String eventType;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 角色类型
	 */
	@ApiField("user_type")
	private String userType;

	/**
	 * 会议ID
	 */
	@ApiField("video_conference_id")
	private String videoConferenceId;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getDeviceInfo() {
		return this.deviceInfo;
	}
	public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserType() {
		return this.userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getVideoConferenceId() {
		return this.videoConferenceId;
	}
	public void setVideoConferenceId(String videoConferenceId) {
		this.videoConferenceId = videoConferenceId;
	}

}
