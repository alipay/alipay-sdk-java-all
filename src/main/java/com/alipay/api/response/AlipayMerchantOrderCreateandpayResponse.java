package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.order.createandpay response.
 * 
 * @author auto create
 * @since 1.0, 2019-12-25 13:21:56
 */
public class AlipayMerchantOrderCreateandpayResponse extends AlipayResponse {

	private static final long serialVersionUID = 7239963818928966685L;

	/** 
	 * alipay侧的订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 支付成功或者失败，PAYMENT_SUCCESS、PAYMENT_FAIL、PAYMENT_INPROCESS等，只有整体返回Success并且这个字段存在、且等于PAYMENT_SUCCESS才代表支付/积分扣减成功。只有整体Success不代表支付成功！
	 */
	@ApiField("payment_status")
	private String paymentStatus;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getPaymentStatus( ) {
		return this.paymentStatus;
	}

}
