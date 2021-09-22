package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付记录金额数据模型
 *
 * @author auto create
 * @since 1.0, 2020-04-03 14:11:55
 */
public class TransactionAmountDTO extends AlipayObject {

	private static final long serialVersionUID = 4265876175462114132L;

	/**
	 * 金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
