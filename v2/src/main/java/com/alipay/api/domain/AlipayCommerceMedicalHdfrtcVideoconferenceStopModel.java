package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结束视频会议
 *
 * @author auto create
 * @since 1.0, 2025-11-21 11:02:48
 */
public class AlipayCommerceMedicalHdfrtcVideoconferenceStopModel extends AlipayObject {

	private static final long serialVersionUID = 2821715338427158762L;

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
	 * 视频结束类型 (ManualEnd:手动结束 TimeoutEnd:超时结束)
	 */
	@ApiField("end_type")
	private String endType;

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

	public String getEndType() {
		return this.endType;
	}
	public void setEndType(String endType) {
		this.endType = endType;
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
