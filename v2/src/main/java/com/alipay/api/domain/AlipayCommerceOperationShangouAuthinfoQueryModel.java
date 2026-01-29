package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝闪购智能体用户授权信息查询
 *
 * @author auto create
 * @since 1.0, 2025-12-12 16:42:42
 */
public class AlipayCommerceOperationShangouAuthinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3186459695415921359L;

	/**
	 * 智能体id
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 来源渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 支付宝用户openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户uid
	 */
	@ApiField("user_id")
	private String userId;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
