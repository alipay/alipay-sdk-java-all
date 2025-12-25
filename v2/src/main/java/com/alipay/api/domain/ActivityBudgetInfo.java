package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业码活动预算信息
 *
 * @author auto create
 * @since 1.0, 2025-12-01 20:27:41
 */
public class ActivityBudgetInfo extends AlipayObject {

	private static final long serialVersionUID = 2474252325991591391L;

	/**
	 * 活动的预算金额，单位元；当优惠类型为折扣或者满立减时，预算金额需要大于最高优惠金额的5倍
	 */
	@ApiField("budget_amount")
	private String budgetAmount;

	/**
	 * 出资方的支付宝账号
	 */
	@ApiField("fund_account")
	private String fundAccount;

	/**
	 * 活动预算的出资方
	 */
	@ApiField("fund_type")
	private String fundType;

	public String getBudgetAmount() {
		return this.budgetAmount;
	}
	public void setBudgetAmount(String budgetAmount) {
		this.budgetAmount = budgetAmount;
	}

	public String getFundAccount() {
		return this.fundAccount;
	}
	public void setFundAccount(String fundAccount) {
		this.fundAccount = fundAccount;
	}

	public String getFundType() {
		return this.fundType;
	}
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

}
