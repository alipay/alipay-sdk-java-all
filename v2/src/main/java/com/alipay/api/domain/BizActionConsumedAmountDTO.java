package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务占用金额DTO
 *
 * @author auto create
 * @since 1.0, 2022-07-15 16:21:31
 */
public class BizActionConsumedAmountDTO extends AlipayObject {

	private static final long serialVersionUID = 6647136627631648148L;

	/**
	 * 业务预算申请code
	 */
	@ApiField("biz_budget_apply_code")
	private String bizBudgetApplyCode;

	/**
	 * 业务活动唯一id
	 */
	@ApiField("biz_uk_id")
	private String bizUkId;

	/**
	 * 占用金额，单位元
	 */
	@ApiField("consumed_amount")
	private String consumedAmount;

	/**
	 * 占用金额币种
	 */
	@ApiField("consumed_amount_currency")
	private String consumedAmountCurrency;

	public String getBizBudgetApplyCode() {
		return this.bizBudgetApplyCode;
	}
	public void setBizBudgetApplyCode(String bizBudgetApplyCode) {
		this.bizBudgetApplyCode = bizBudgetApplyCode;
	}

	public String getBizUkId() {
		return this.bizUkId;
	}
	public void setBizUkId(String bizUkId) {
		this.bizUkId = bizUkId;
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

}
