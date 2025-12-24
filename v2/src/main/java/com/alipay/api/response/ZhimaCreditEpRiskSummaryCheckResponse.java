package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.risk.summary.check response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-16 10:26:24
 */
public class ZhimaCreditEpRiskSummaryCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 8781598938491773442L;

	/** 
	 * true：有风险；false：无风险
	 */
	@ApiField("has_risk")
	private Boolean hasRisk;

	public void setHasRisk(Boolean hasRisk) {
		this.hasRisk = hasRisk;
	}
	public Boolean getHasRisk( ) {
		return this.hasRisk;
	}

}
