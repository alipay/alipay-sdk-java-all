package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.recycle.security.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-29 15:01:51
 */
public class AlipayCommerceRecycleSecurityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6378366198545389387L;

	/** 
	 * 订单风险评估等级，
LOW_RISK：风险较低
HIGH_RISK：风险较高
	 */
	@ApiField("risk_level")
	private String riskLevel;

	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}
	public String getRiskLevel( ) {
		return this.riskLevel;
	}

}
