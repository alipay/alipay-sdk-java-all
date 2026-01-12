package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.industrydata.inquiryorder.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-19 19:42:42
 */
public class AlipayCommerceMedicalIndustrydataInquiryorderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1347383143794693954L;

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
