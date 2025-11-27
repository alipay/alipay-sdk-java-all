package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发起订阅付费服务
 *
 * @author auto create
 * @since 1.0, 2025-11-19 16:47:21
 */
public class AlipayAipaySubscribePackageInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 1276666877795421352L;

	/**
	 * 智能体id
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 智能体名称
	 */
	@ApiField("agent_name")
	private String agentName;

	/**
	 * 区分智能体平台，本地部署为其他
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 订购计划id
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 客户id
	 */
	@ApiField("uuid")
	private String uuid;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgentName() {
		return this.agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getUuid() {
		return this.uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

}
