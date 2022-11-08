package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.point.budget.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-05 13:55:02
 */
public class AlipayAssetPointBudgetQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5247973476251869663L;

	/** 
	 * 还可以发放的集分宝个数
	 */
	@ApiField("budget_amount")
	private Long budgetAmount;

	public void setBudgetAmount(Long budgetAmount) {
		this.budgetAmount = budgetAmount;
	}
	public Long getBudgetAmount( ) {
		return this.budgetAmount;
	}

}
