package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝交易支付工具
 *
 * @author auto create
 * @since 1.0, 2020-09-15 15:06:42
 */
public class InvoiceTradeFundItem extends AlipayObject {

	private static final long serialVersionUID = 2688197914118526879L;

	/**
	 * 当前支付工具支付的金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 支付宝支付工具描述
	 */
	@ApiField("payment_tool_name")
	private String paymentToolName;

	/**
	 * 支付宝支付工具类型
	 */
	@ApiField("payment_tool_type")
	private String paymentToolType;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getPaymentToolName() {
		return this.paymentToolName;
	}
	public void setPaymentToolName(String paymentToolName) {
		this.paymentToolName = paymentToolName;
	}

	public String getPaymentToolType() {
		return this.paymentToolType;
	}
	public void setPaymentToolType(String paymentToolType) {
		this.paymentToolType = paymentToolType;
	}

}
