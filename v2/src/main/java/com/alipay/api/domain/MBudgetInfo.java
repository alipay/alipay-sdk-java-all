package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销活动预算信息
 *
 * @author auto create
 * @since 1.0, 2018-11-27 19:52:02
 */
public class MBudgetInfo extends AlipayObject {

	private static final long serialVersionUID = 7763994441539172429L;

	/**
	 * 日预算设置必须在1~999999999范围内，不限制填写“-1”，注意：日预算不能大于总预算
	 */
	@ApiField("budget_daily")
	private String budgetDaily;

	/**
	 * 总预算设置必须在1~999999999范围内，不限制填写“-1”
	 */
	@ApiField("budget_total")
	private String budgetTotal;

	/**
	 * 预算类型，支持枚举：数量预算：QUANTITY
	 */
	@ApiField("budget_type")
	private String budgetType;

	public String getBudgetDaily() {
		return this.budgetDaily;
	}
	public void setBudgetDaily(String budgetDaily) {
		this.budgetDaily = budgetDaily;
	}

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
