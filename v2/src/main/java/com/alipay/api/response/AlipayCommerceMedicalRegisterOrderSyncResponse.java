package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.register.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-12 10:02:41
 */
public class AlipayCommerceMedicalRegisterOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6592731743535533472L;

	/** 
	 * 支付宝订单唯一ID
	 */
	@ApiField("order_no")
	private String orderNo;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

}
