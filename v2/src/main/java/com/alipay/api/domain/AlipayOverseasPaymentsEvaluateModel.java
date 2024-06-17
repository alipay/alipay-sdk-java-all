package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付能力评估
 *
 * @author auto create
 * @since 1.0, 2024-03-22 17:13:16
 */
public class AlipayOverseasPaymentsEvaluateModel extends AlipayObject {

	private static final long serialVersionUID = 5724535893153264638L;

	/**
	 * 影响支付细节的因素，该参数用于定义支付场景
	 */
	@ApiField("payment_factor")
	private PaymentFactor paymentFactor;

	/**
	 * 需要评估的支付方式
	 */
	@ApiField("payment_method")
	private PaymentMethod paymentMethod;

	/**
	 * 订单金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public PaymentFactor getPaymentFactor() {
		return this.paymentFactor;
	}
	public void setPaymentFactor(PaymentFactor paymentFactor) {
		this.paymentFactor = paymentFactor;
	}

	public PaymentMethod getPaymentMethod() {
		return this.paymentMethod;
	}
	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
