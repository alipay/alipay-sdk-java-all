package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.consultdata.consultorder.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-19 17:38:01
 */
public class AlipayCommerceMedicalConsultdataConsultorderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2432435761697937819L;

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
