package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.industrydata.inquiryorderevaluate.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-14 15:17:09
 */
public class AlipayCommerceMedicalIndustrydataInquiryorderevaluateSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7637353865615451911L;

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
