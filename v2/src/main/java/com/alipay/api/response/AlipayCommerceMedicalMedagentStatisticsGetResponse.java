package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AgentStatisticDataOpenVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.medagent.statistics.get response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-22 17:12:50
 */
public class AlipayCommerceMedicalMedagentStatisticsGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3711727729142619779L;

	/** 
	 * 数据结果
	 */
	@ApiField("data")
	private AgentStatisticDataOpenVO data;

	public void setData(AgentStatisticDataOpenVO data) {
		this.data = data;
	}
	public AgentStatisticDataOpenVO getData( ) {
		return this.data;
	}

}
