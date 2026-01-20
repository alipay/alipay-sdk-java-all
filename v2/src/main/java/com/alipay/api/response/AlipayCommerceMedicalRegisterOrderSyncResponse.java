package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.register.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-14 14:32:42
 */
public class AlipayCommerceMedicalRegisterOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1581467182887166813L;

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
