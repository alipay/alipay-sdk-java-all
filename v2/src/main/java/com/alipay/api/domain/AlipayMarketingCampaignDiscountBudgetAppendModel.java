package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销立减活动预算追加
 *
 * @author auto create
 * @since 1.0, 2022-10-12 19:39:24
 */
public class AlipayMarketingCampaignDiscountBudgetAppendModel extends AlipayObject {

	private static final long serialVersionUID = 8333911761638198681L;

	/**
	 * 预算ID
	 */
	@ApiField("budget_id")
	private String budgetId;

	/**
	 * 追加后的预算总金额（注意：是追加后的预算总金额，不是在原基础上追加的金额），单位：元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getBudgetId() {
		return this.budgetId;
	}
	public void setBudgetId(String budgetId) {
		this.budgetId = budgetId;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
