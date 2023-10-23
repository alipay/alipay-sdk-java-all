package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.recycle.security.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 01:16:43
 */
public class AlipayCommerceRecycleSecurityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7166759778379798951L;

	/** 
	 * 订单风险评估等级，
LOW_RISK：风险较低
MEDIUM_RISK：风险中等
HIGH_RISK：风险较高
	 */
	@ApiField("risk_level")
	private String riskLevel;

	/** 
	 * 不同风险情况的原因
	 */
	@ApiField("risk_reason")
	private String riskReason;

	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}
	public String getRiskLevel( ) {
		return this.riskLevel;
	}

	public void setRiskReason(String riskReason) {
		this.riskReason = riskReason;
	}
	public String getRiskReason( ) {
		return this.riskReason;
	}

}
