package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.agent.create.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-05 16:32:54
 */
public class AlipayOpenSpAgentCreateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8141568137536367778L;

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
	 * 申请单状态
	 */
	@ApiField("status")
	private String status;

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public String getAgentId( ) {
		return this.agentId;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getAgentName( ) {
		return this.agentName;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
