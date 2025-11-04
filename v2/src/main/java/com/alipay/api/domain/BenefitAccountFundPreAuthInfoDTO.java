package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益账户预授权预算信息
 *
 * @author auto create
 * @since 1.0, 2025-06-30 14:03:30
 */
public class BenefitAccountFundPreAuthInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 7461686757943869735L;

	/**
	 * 权益账户可采买金额，单位：元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 预授权预算ID
	 */
	@ApiField("budget_id")
	private String budgetId;

	/**
	 * 充值总金额，单位：元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

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
