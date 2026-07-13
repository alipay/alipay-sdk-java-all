package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.voice.plan.offline response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-09 10:29:32
 */
public class AlipayCommerceLogisticsVoicePlanOfflineResponse extends AlipayResponse {

	private static final long serialVersionUID = 2279312864263737974L;

	/** 
	 * 投放计划ID
	 */
	@ApiField("logistics_voice_plan_id")
	private String logisticsVoicePlanId;

	public void setLogisticsVoicePlanId(String logisticsVoicePlanId) {
		this.logisticsVoicePlanId = logisticsVoicePlanId;
	}
	public String getLogisticsVoicePlanId( ) {
		return this.logisticsVoicePlanId;
	}

}
