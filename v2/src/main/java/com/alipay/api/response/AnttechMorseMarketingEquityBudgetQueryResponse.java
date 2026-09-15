package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.morse.marketing.equity.budget.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-21 10:33:49
 */
public class AnttechMorseMarketingEquityBudgetQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3824631441811735369L;

	/** 
	 * 权益剩余预算，单位为分
	 */
	@ApiField("remaining_budget")
	private Long remainingBudget;

	/** 
	 * 权益总预算，单位为分
	 */
	@ApiField("total_budget")
	private Long totalBudget;

	public void setRemainingBudget(Long remainingBudget) {
		this.remainingBudget = remainingBudget;
	}
	public Long getRemainingBudget( ) {
		return this.remainingBudget;
	}

	public void setTotalBudget(Long totalBudget) {
		this.totalBudget = totalBudget;
	}
	public Long getTotalBudget( ) {
		return this.totalBudget;
	}

}
