package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能营销预算信息
 *
 * @author auto create
 * @since 1.0, 2018-01-22 16:20:23
 */
public class InteligentBudgetInfo extends AlipayObject {

	private static final long serialVersionUID = 7573485276656959412L;

	/**
	 * 预算数量
	 */
	@ApiField("budget_total")
	private String budgetTotal;

	/**
	 * 预算类型，枚举（QUANTITY：数量预算）
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
