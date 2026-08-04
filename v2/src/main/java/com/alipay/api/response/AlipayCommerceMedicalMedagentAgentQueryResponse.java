package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GetAgentResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.medagent.agent.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-31 11:19:21
 */
public class AlipayCommerceMedicalMedagentAgentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5172747919913988739L;

	/** 
	 * 智能体基本信息
	 */
	@ApiField("data")
	private GetAgentResult data;

	public void setData(GetAgentResult data) {
		this.data = data;
	}
	public GetAgentResult getData( ) {
		return this.data;
	}

}
