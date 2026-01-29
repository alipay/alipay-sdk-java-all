package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开始视频会议
 *
 * @author auto create
 * @since 1.0, 2025-11-19 15:49:43
 */
public class AlipayCommerceMedicalHdfrtcVideoconferenceRestartModel extends AlipayObject {

	private static final long serialVersionUID = 7254198791751916972L;

	/**
	 * 手机型号
	 */
	@ApiField("device_model")
	private String deviceModel;

	/**
	 * 设备来源
	 */
	@ApiField("device_source")
	private String deviceSource;

	/**
	 * 角色类型
	 */
	@ApiField("role")
	private String role;

	/**
	 * 来源类型
	 */
	@ApiField("source_type")
	private String sourceType;

	/**
	 * 医生空间ID
	 */
	@ApiField("space_id")
	private Long spaceId;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private Long userId;

	/**
	 * 视频会议ID
	 */
	@ApiField("video_conference_id")
	private Long videoConferenceId;

	public String getDeviceModel() {
		return this.deviceModel;
	}
	public void setDeviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
	}

	public String getDeviceSource() {
		return this.deviceSource;
	}
	public void setDeviceSource(String deviceSource) {
		this.deviceSource = deviceSource;
	}

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public String getSourceType() {
		return this.sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public Long getSpaceId() {
		return this.spaceId;
	}
	public void setSpaceId(Long spaceId) {
		this.spaceId = spaceId;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getVideoConferenceId() {
		return this.videoConferenceId;
	}
	public void setVideoConferenceId(Long videoConferenceId) {
		this.videoConferenceId = videoConferenceId;
	}

}
