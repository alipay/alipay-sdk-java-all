package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预算详情
 *
 * @author auto create
 * @since 1.0, 2022-11-14 16:18:50
 */
public class BenefitBudgetDTO extends AlipayObject {

	private static final long serialVersionUID = 6262346172925954179L;

	/**
	 * 当前budget_type为amount时必填
	 */
	@ApiField("amount")
	private Amount amount;

	/**
	 * COUNT ： 数量类型;AMOUNT ： 金额行
	 */
	@ApiField("budget_type")
	private String budgetType;

	/**
	 * 当budgetType为COUNT时必填，填入的是权益的数量
	 */
	@ApiField("count")
	private Long count;

	public Amount getAmount() {
		return this.amount;
	}
	public void setAmount(Amount amount) {
		this.amount = amount;
	}

	public String getBudgetType() {
		return this.budgetType;
	}
	public void setBudgetType(String budgetType) {
		this.budgetType = budgetType;
	}

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

}
