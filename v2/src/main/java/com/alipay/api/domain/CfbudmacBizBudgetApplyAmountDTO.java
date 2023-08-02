package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * BBA可用金额
 *
 * @author auto create
 * @since 1.0, 2023-01-11 15:09:08
 */
public class CfbudmacBizBudgetApplyAmountDTO extends AlipayObject {

	private static final long serialVersionUID = 2869674918674992482L;

	/**
	 * 业务预算申请Code
	 */
	@ApiField("biz_budget_apply_code")
	private String bizBudgetApplyCode;

	/**
	 * BBA全量占用金额，单位元
	 */
	@ApiField("consumed_amount")
	private String consumedAmount;

	/**
	 * 占用金额币种
	 */
	@ApiField("consumed_amount_currency")
	private String consumedAmountCurrency;

	/**
	 * BBA全量剩余金额，单位为元
	 */
	@ApiField("remain_amount")
	private String remainAmount;

	/**
	 * 剩余金额币种
	 */
	@ApiField("remain_amount_currency")
	private String remainAmountCurrency;

	public String getBizBudgetApplyCode() {
		return this.bizBudgetApplyCode;
	}
	public void setBizBudgetApplyCode(String bizBudgetApplyCode) {
		this.bizBudgetApplyCode = bizBudgetApplyCode;
	}

	public String getConsumedAmount() {
		return this.consumedAmount;
	}
	public void setConsumedAmount(String consumedAmount) {
		this.consumedAmount = consumedAmount;
	}

	public String getConsumedAmountCurrency() {
		return this.consumedAmountCurrency;
	}
	public void setConsumedAmountCurrency(String consumedAmountCurrency) {
		this.consumedAmountCurrency = consumedAmountCurrency;
	}

	public String getRemainAmount() {
		return this.remainAmount;
	}
	public void setRemainAmount(String remainAmount) {
		this.remainAmount = remainAmount;
	}

	public String getRemainAmountCurrency() {
		return this.remainAmountCurrency;
	}
	public void setRemainAmountCurrency(String remainAmountCurrency) {
		this.remainAmountCurrency = remainAmountCurrency;
	}

}
