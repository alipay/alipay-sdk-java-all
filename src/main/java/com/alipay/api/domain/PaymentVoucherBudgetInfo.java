package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付券营销资金预算
 *
 * @author auto create
 * @since 1.0, 2021-08-27 16:02:49
 */
public class PaymentVoucherBudgetInfo extends AlipayObject {

	private static final long serialVersionUID = 1781998752591737214L;

	/**
	 * 营销资金预算,单位元。
总预算=优惠金额*总发券张数
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 营销资金预算类型
枚举值:
NO_CASH 免充值

1、免充值：制券方无需提前充值资金，用户核销支付券时，直接从订单原价中扣除优惠减价金额，最终只将用户实际支付的金额结算给核销商户，商户实收少于订单原价。
	 */
	@ApiField("budget_type")
	private String budgetType;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBudgetType() {
		return this.budgetType;
	}
	public void setBudgetType(String budgetType) {
		this.budgetType = budgetType;
	}

}
