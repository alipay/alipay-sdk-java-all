package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.consultdata.consultorder.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-23 22:52:56
 */
public class AlipayCommerceMedicalConsultdataConsultorderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7462956572774246314L;

	/** 
	 * 支付宝行业侧订单号
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
