package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 校验视频会议
 *
 * @author auto create
 * @since 1.0, 2025-10-17 14:44:04
 */
public class AlipayCommerceMedicalHdfrtcVideoconferenceCheckModel extends AlipayObject {

	private static final long serialVersionUID = 1656442863275951577L;

	/**
	 * Space:医生 Patient:患者
	 */
	@ApiField("role")
	private String role;

	/**
	 * 外部来源ID，如执行单ID
	 */
	@ApiField("source_id")
	private Long sourceId;

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
	 * 好大夫侧用户ID
	 */
	@ApiField("user_id")
	private Long userId;

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public Long getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(Long sourceId) {
		this.sourceId = sourceId;
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

}
