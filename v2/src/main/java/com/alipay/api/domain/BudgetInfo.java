package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预算信息
 *
 * @author auto create
 * @since 1.0, 2019-06-25 19:48:15
 */
public class BudgetInfo extends AlipayObject {

	private static final long serialVersionUID = 2486421141331556761L;

	/**
	 * 预算数量
	 */
	@ApiField("budget_total")
	private String budgetTotal;

	/**
	 * 预算类型
	 */
	@ApiField("budget_type")
	private String budgetType;

	/**
	 * 设置每天的预算，如每天的预算设置为100，即该活动一天最多发放100次
	 */
	@ApiField("sub_budget_dimension")
	private String subBudgetDimension;

	/**
	 * 用于控制子纬度的预算数量
	 */
	@ApiField("sub_value")
	private String subValue;

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

	public String getSubBudgetDimension() {
		return this.subBudgetDimension;
	}
	public void setSubBudgetDimension(String subBudgetDimension) {
		this.subBudgetDimension = subBudgetDimension;
	}

	public String getSubValue() {
		return this.subValue;
	}
	public void setSubValue(String subValue) {
		this.subValue = subValue;
	}

}
