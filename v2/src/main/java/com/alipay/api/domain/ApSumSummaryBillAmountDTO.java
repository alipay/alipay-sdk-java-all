package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应付统计金额结果
 *
 * @author auto create
 * @since 1.0, 2021-09-28 14:28:50
 */
public class ApSumSummaryBillAmountDTO extends AlipayObject {

	private static final long serialVersionUID = 7274467227893239632L;

	/**
	 * 账单金额
	 */
	@ApiField("bill_amount")
	private MultiCurrencyMoneyOpenApi billAmount;

	/**
	 * 已出账金额
	 */
	@ApiField("checkout_amount")
	private MultiCurrencyMoneyOpenApi checkoutAmount;

	/**
	 * 已确认金额
	 */
	@ApiField("confirmed_amount")
	private MultiCurrencyMoneyOpenApi confirmedAmount;

	/**
	 * 已结算金额
	 */
	@ApiField("settled_amount")
	private MultiCurrencyMoneyOpenApi settledAmount;

	/**
	 * 结算总金额
	 */
	@ApiField("settling_amount")
	private MultiCurrencyMoneyOpenApi settlingAmount;

	/**
	 * 待确认金额
	 */
	@ApiField("un_confirmed_amount")
	private MultiCurrencyMoneyOpenApi unConfirmedAmount;

	/**
	 * 待结算金额
	 */
	@ApiField("un_settle_amount")
	private MultiCurrencyMoneyOpenApi unSettleAmount;

	public MultiCurrencyMoneyOpenApi getBillAmount() {
		return this.billAmount;
	}
	public void setBillAmount(MultiCurrencyMoneyOpenApi billAmount) {
		this.billAmount = billAmount;
	}

	public MultiCurrencyMoneyOpenApi getCheckoutAmount() {
		return this.checkoutAmount;
	}
	public void setCheckoutAmount(MultiCurrencyMoneyOpenApi checkoutAmount) {
		this.checkoutAmount = checkoutAmount;
	}

	public MultiCurrencyMoneyOpenApi getConfirmedAmount() {
		return this.confirmedAmount;
	}
	public void setConfirmedAmount(MultiCurrencyMoneyOpenApi confirmedAmount) {
		this.confirmedAmount = confirmedAmount;
	}

	public MultiCurrencyMoneyOpenApi getSettledAmount() {
		return this.settledAmount;
	}
	public void setSettledAmount(MultiCurrencyMoneyOpenApi settledAmount) {
		this.settledAmount = settledAmount;
	}

	public MultiCurrencyMoneyOpenApi getSettlingAmount() {
		return this.settlingAmount;
	}
	public void setSettlingAmount(MultiCurrencyMoneyOpenApi settlingAmount) {
		this.settlingAmount = settlingAmount;
	}

	public MultiCurrencyMoneyOpenApi getUnConfirmedAmount() {
		return this.unConfirmedAmount;
	}
	public void setUnConfirmedAmount(MultiCurrencyMoneyOpenApi unConfirmedAmount) {
		this.unConfirmedAmount = unConfirmedAmount;
	}

	public MultiCurrencyMoneyOpenApi getUnSettleAmount() {
		return this.unSettleAmount;
	}
	public void setUnSettleAmount(MultiCurrencyMoneyOpenApi unSettleAmount) {
		this.unSettleAmount = unSettleAmount;
	}

}
