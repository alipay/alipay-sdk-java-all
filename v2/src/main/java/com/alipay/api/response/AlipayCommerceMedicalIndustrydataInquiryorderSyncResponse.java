package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.industrydata.inquiryorder.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-03 15:22:31
 */
public class AlipayCommerceMedicalIndustrydataInquiryorderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8751782257844338661L;

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
