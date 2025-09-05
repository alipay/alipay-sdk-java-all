package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 影响支付细节的因素。该参数用于定义支付场景。
 *
 * @author auto create
 * @since 1.0, 2024-01-26 14:59:02
 */
public class PaymentFactor extends AlipayObject {

	private static final long serialVersionUID = 1244685418235211668L;

	/**
	 * 如果将此参数的值指定为true，则在支付过程中向用户显示收银页面;
否则，在支付过程中不会向用户显示收银台页面。
	 */
	@ApiField("is_cashier_payment")
	private Boolean isCashierPayment;

	/**
	 * 若该参数指定为true，则支付场景为线下支付；否则，支付场景为线上支付。
	 */
	@ApiField("is_in_store_payment")
	private Boolean isInStorePayment;

	public Boolean getIsCashierPayment() {
		return this.isCashierPayment;
	}
	public void setIsCashierPayment(Boolean isCashierPayment) {
		this.isCashierPayment = isCashierPayment;
	}

	public Boolean getIsInStorePayment() {
		return this.isInStorePayment;
	}
	public void setIsInStorePayment(Boolean isInStorePayment) {
		this.isInStorePayment = isInStorePayment;
	}

}
