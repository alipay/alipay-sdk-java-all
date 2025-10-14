package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.risk.summary.check response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-25 11:33:27
 */
public class ZhimaCreditEpRiskSummaryCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 4728783786664341884L;

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
