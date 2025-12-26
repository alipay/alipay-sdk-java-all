package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.recycle.risk.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-14 20:17:34
 */
public class AlipayCommerceRecycleRiskConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 2814438356184972688L;

	/** 
	 * 风险等级 1～5（分数越小风险越高）
	 */
	@ApiField("risk_level")
	private Long riskLevel;

	public void setRiskLevel(Long riskLevel) {
		this.riskLevel = riskLevel;
	}
	public Long getRiskLevel( ) {
		return this.riskLevel;
	}

}
