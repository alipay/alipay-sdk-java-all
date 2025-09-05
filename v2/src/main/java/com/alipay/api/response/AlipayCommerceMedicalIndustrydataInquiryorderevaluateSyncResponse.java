package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.industrydata.inquiryorderevaluate.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 12:37:37
 */
public class AlipayCommerceMedicalIndustrydataInquiryorderevaluateSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1316637271839292777L;

	/** 
	 * 支付宝订单号
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
