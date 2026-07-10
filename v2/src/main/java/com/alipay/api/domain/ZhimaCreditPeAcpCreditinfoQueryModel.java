package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻可信名片信用等级查询
 *
 * @author auto create
 * @since 1.0, 2026-06-01 15:27:49
 */
public class ZhimaCreditPeAcpCreditinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2832885488937412186L;

	/**
	 * 智能体id
	 */
	@ApiField("agent_id")
	private String agentId;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

}
