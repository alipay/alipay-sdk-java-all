package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.discount.budget.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayMarketingCampaignDiscountBudgetCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4632824627616794491L;

	/** 
	 * 预算ID
	 */
	@ApiField("budget_id")
	private String budgetId;

	public void setBudgetId(String budgetId) {
		this.budgetId = budgetId;
	}
	public String getBudgetId( ) {
		return this.budgetId;
	}

}
