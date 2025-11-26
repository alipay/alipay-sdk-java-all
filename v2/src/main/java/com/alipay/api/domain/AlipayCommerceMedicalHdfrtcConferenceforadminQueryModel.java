package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询视频会议
 *
 * @author auto create
 * @since 1.0, 2025-11-19 15:33:18
 */
public class AlipayCommerceMedicalHdfrtcConferenceforadminQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8361946828215624415L;

	/**
	 * 角色类型
	 */
	@ApiField("role")
	private String role;

	/**
	 * 来源ID
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 来源类型
	 */
	@ApiField("source_type")
	private String sourceType;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getSourceType() {
		return this.sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
