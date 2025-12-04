package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.industrydata.orderdelete.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 12:37:37
 */
public class AlipayCommerceMedicalIndustrydataOrderdeleteSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6891755695174952229L;

	/** 
	 * 支付宝问诊单id
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
