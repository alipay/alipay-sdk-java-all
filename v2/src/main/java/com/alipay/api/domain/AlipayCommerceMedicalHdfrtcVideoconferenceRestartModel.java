package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开始视频会议
 *
 * @author auto create
 * @since 1.0, 2025-10-17 14:44:07
 */
public class AlipayCommerceMedicalHdfrtcVideoconferenceRestartModel extends AlipayObject {

	private static final long serialVersionUID = 3498618615463428661L;

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
