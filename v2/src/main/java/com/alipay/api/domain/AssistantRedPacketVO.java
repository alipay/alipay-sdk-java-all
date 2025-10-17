package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 红包小助手推荐红包模型
 *
 * @author auto create
 * @since 1.0, 2025-08-27 10:11:43
 */
public class AssistantRedPacketVO extends AlipayObject {

	private static final long serialVersionUID = 1476187388519231432L;

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
