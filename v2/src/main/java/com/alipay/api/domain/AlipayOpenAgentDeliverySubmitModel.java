package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能体投放到指定渠道
 *
 * @author auto create
 * @since 1.0, 2026-08-05 20:49:12
 */
public class AlipayOpenAgentDeliverySubmitModel extends AlipayObject {

	private static final long serialVersionUID = 7721585689576144185L;

	/**
	 * 智能体唯一标识
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 待投放的智能体版本号
	 */
	@ApiField("agent_version")
	private String agentVersion;

	/**
	 * 投放目标渠道
	 */
	@ApiField("channel")
	private String channel;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgentVersion() {
		return this.agentVersion;
	}
	public void setAgentVersion(String agentVersion) {
		this.agentVersion = agentVersion;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

}
