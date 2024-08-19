package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券出资方式
 *
 * @author auto create
 * @since 1.0, 2024-08-08 18:12:31
 */
public class AppItemVoucherBudgetSupplyInfo extends AlipayObject {

	private static final long serialVersionUID = 3295147127795365673L;

	/**
	 * 【描述】营销资金预算类型
【枚举值】
免充值 : NO_CASH
	 */
	@ApiField("budget_type")
	private String budgetType;

	public String getBudgetType() {
		return this.budgetType;
	}
	public void setBudgetType(String budgetType) {
		this.budgetType = budgetType;
	}

}
