package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.terminal.edgecloud.heyagent.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-28 11:10:42
 */
public class AlipayTerminalEdgecloudHeyagentApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5629998914225645198L;

	/** 
	 * 本次启动云渲染会话ID
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
