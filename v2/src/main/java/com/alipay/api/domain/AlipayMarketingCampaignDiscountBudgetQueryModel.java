package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销立减活动预算查询
 *
 * @author auto create
 * @since 1.0, 2024-05-27 13:59:17
 */
public class AlipayMarketingCampaignDiscountBudgetQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5298616683618527682L;

	/**
	 * 预算名称
	 */
	@ApiField("budget_id")
	private String budgetId;

	public String getBudgetId() {
		return this.budgetId;
	}
	public void setBudgetId(String budgetId) {
		this.budgetId = budgetId;
	}

}
