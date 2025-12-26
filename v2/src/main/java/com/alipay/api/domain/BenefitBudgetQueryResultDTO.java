package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益预算查询结果
 *
 * @author auto create
 * @since 1.0, 2022-11-14 16:04:58
 */
public class BenefitBudgetQueryResultDTO extends AlipayObject {

	private static final long serialVersionUID = 3859364899494627838L;

	/**
	 * 权益id
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 金额型总预算
	 */
	@ApiField("budget_total_amount")
	private Amount budgetTotalAmount;

	/**
	 * 数量型总预算
	 */
	@ApiField("budget_total_count")
	private Long budgetTotalCount;

	/**
	 * 预算类型
	 */
	@ApiField("budget_type")
	private String budgetType;

	/**
	 * 金额型预算剩余金额
	 */
	@ApiField("remain_amount")
	private Amount remainAmount;

	/**
	 * 数量型预算剩余数量,budgetType=COUNT 时有值
	 */
	@ApiField("remain_count")
	private Long remainCount;

	public String getBenefitId() {
		return this.benefitId;
	}
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

	public Amount getBudgetTotalAmount() {
		return this.budgetTotalAmount;
	}
	public void setBudgetTotalAmount(Amount budgetTotalAmount) {
		this.budgetTotalAmount = budgetTotalAmount;
	}

	public Long getBudgetTotalCount() {
		return this.budgetTotalCount;
	}
	public void setBudgetTotalCount(Long budgetTotalCount) {
		this.budgetTotalCount = budgetTotalCount;
	}

	public String getBudgetType() {
		return this.budgetType;
	}
	public void setBudgetType(String budgetType) {
		this.budgetType = budgetType;
	}

	public Amount getRemainAmount() {
		return this.remainAmount;
	}
	public void setRemainAmount(Amount remainAmount) {
		this.remainAmount = remainAmount;
	}

	public Long getRemainCount() {
		return this.remainCount;
	}
	public void setRemainCount(Long remainCount) {
		this.remainCount = remainCount;
	}

}
