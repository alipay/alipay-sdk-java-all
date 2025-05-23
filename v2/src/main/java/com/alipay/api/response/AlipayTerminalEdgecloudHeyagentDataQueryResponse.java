package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.terminal.edgecloud.heyagent.data.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-13 14:47:04
 */
public class AlipayTerminalEdgecloudHeyagentDataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8653655528239152132L;

	/** 
	 * agentId
	 */
	@ApiField("agent_id")
	private String agentId;

	/** 
	 * 页面dom数据
	 */
	@ApiField("dom")
	private String dom;

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public String getAgentId( ) {
		return this.agentId;
	}

	public void setDom(String dom) {
		this.dom = dom;
	}
	public String getDom( ) {
		return this.dom;
	}

}
