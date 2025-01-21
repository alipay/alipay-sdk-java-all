package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.industrydata.inquiryorder.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 17:32:19
 */
public class AlipayCommerceMedicalIndustrydataInquiryorderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5512712258639174244L;

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
