package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.payment.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-28 20:37:27
 */
public class AlipayCommerceMedicalPaymentOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2425149692299725976L;

	/** 
	 * 上传成功后的平台订单Id
	 */
	@ApiField("order_id")
	private String orderId;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

}
