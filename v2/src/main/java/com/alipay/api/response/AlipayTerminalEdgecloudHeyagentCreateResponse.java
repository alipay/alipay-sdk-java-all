package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.terminal.edgecloud.heyagent.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-13 14:47:04
 */
public class AlipayTerminalEdgecloudHeyagentCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7295282682635842223L;

	/** 
	 * 本次绘话的ID
	 */
	@ApiField("agent_id")
	private String agentId;

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public String getAgentId( ) {
		return this.agentId;
	}

}
