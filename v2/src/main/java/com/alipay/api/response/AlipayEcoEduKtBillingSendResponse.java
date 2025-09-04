package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.edu.kt.billing.send response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-20 19:17:57
 */
public class AlipayEcoEduKtBillingSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 3125636418362474144L;

	/** 
	 * 支付宝－中小学－教育缴费的账单号
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
