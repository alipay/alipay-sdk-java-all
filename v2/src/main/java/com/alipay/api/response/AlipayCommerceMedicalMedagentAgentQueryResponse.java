package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GetAgentResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.medagent.agent.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-17 10:22:33
 */
public class AlipayCommerceMedicalMedagentAgentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1556978613831821162L;

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
