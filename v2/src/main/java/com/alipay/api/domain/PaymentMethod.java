package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付方式
 *
 * @author auto create
 * @since 1.0, 2024-03-22 17:18:14
 */
public class PaymentMethod extends AlipayObject {

	private static final long serialVersionUID = 6127456359337894528L;

	/**
	 * 买家支付宝用户ID。
2088开头的16位纯数字。
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * customer_id对应的open_id，买家支付宝用户唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 具体支付方式名称
	 */
	@ApiField("payment_method_type")
	private String paymentMethodType;

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPaymentMethodType() {
		return this.paymentMethodType;
	}
	public void setPaymentMethodType(String paymentMethodType) {
		this.paymentMethodType = paymentMethodType;
	}

}
