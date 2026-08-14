package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.agent.delivery.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-06 19:27:50
 */
public class AlipayOpenAgentDeliveryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4867835971448287338L;

	/** 
	 * 能体唯一标识
	 */
	@ApiField("agent_id")
	private String agentId;

	/** 
	 * 投放的版本号
	 */
	@ApiField("agent_version")
	private String agentVersion;

	/** 
	 * 投放目标渠道
	 */
	@ApiField("channel")
	private String channel;

	/** 
	 * 该次投放的当前状态
	 */
	@ApiField("delivery_status")
	private String deliveryStatus;

	/** 
	 * 投放驳回原因，非驳回为空
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public String getAgentId( ) {
		return this.agentId;
	}

	public void setAgentVersion(String agentVersion) {
		this.agentVersion = agentVersion;
	}
	public String getAgentVersion( ) {
		return this.agentVersion;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getChannel( ) {
		return this.channel;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	public String getDeliveryStatus( ) {
		return this.deliveryStatus;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}
	public String getRejectReason( ) {
		return this.rejectReason;
	}

}
