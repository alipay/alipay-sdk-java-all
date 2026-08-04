package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询版本投放状态
 *
 * @author auto create
 * @since 1.0, 2026-07-28 19:52:54
 */
public class AlipayOpenAgentVersionDeliveryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6721957414619689511L;

	/**
	 * 智能体唯一标识
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 版本号
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
