package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 视频会议重连信息查询
 *
 * @author auto create
 * @since 1.0, 2025-10-17 14:44:08
 */
public class AlipayCommerceMedicalHdfrtcReconnectioninfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5884117519451334819L;

	/**
	 * 角色类型 Space:医生 Patient:患者
	 */
	@ApiField("role")
	private String role;

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
