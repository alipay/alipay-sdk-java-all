package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 红包小助手推荐红包模型
 *
 * @author auto create
 * @since 1.0, 2025-10-22 09:34:45
 */
public class AssistantRedPacketVO extends AlipayObject {

	private static final long serialVersionUID = 8241149844891568561L;

	/**
	 * 人群类型
	 */
	@ApiField("crowd_type")
	private String crowdType;

	/**
	 * 用于填写红包id
	 */
	@ApiField("red_packet_id")
	private String redPacketId;

	/**
	 * 红包可见的棋盘人群
	 */
	@ApiField("visible_users")
	private String visibleUsers;

	public String getCrowdType() {
		return this.crowdType;
	}
	public void setCrowdType(String crowdType) {
		this.crowdType = crowdType;
	}

	public String getRedPacketId() {
		return this.redPacketId;
	}
	public void setRedPacketId(String redPacketId) {
		this.redPacketId = redPacketId;
	}

	public String getVisibleUsers() {
		return this.visibleUsers;
	}
	public void setVisibleUsers(String visibleUsers) {
		this.visibleUsers = visibleUsers;
	}

}
