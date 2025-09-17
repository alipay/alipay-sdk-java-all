package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开放活动－预算
 *
 * @author auto create
 * @since 1.0, 2022-11-09 17:57:47
 */
public class OpenPromoBudget extends AlipayObject {

	private static final long serialVersionUID = 5835325643313871978L;

	/**
	 * 预算数量，支持1～999999999之间。默认为999999999
	 */
	@ApiField("budget_total")
	private String budgetTotal;

	/**
	 * 预算类型，现在支持CAMP_BUDGET_AMOUNT：表示数量预算
	 */
	@ApiField("budget_type")
	private String budgetType;

	public String getBudgetTotal() {
		return this.budgetTotal;
	}
	public void setBudgetTotal(String budgetTotal) {
		this.budgetTotal = budgetTotal;
	}

	public String getBudgetType() {
		return this.budgetType;
	}
	public void setBudgetType(String budgetType) {
		this.budgetType = budgetType;
	}

}
