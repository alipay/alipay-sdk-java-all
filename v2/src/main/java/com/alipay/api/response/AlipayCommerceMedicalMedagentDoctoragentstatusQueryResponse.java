package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GetAgentStatusVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.medagent.doctoragentstatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-25 14:52:33
 */
public class AlipayCommerceMedicalMedagentDoctoragentstatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6727224381111898115L;

	/** 
	 * ai医生智能体状态信息数据
	 */
	@ApiField("data")
	private GetAgentStatusVO data;

	public void setData(GetAgentStatusVO data) {
		this.data = data;
	}
	public GetAgentStatusVO getData( ) {
		return this.data;
	}

}
