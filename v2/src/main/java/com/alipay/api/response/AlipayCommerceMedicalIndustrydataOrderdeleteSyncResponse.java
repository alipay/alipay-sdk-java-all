package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.industrydata.orderdelete.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-14 15:17:13
 */
public class AlipayCommerceMedicalIndustrydataOrderdeleteSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3436436264776587724L;

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
