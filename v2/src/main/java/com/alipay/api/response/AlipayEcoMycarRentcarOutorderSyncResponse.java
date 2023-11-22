package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.rentcar.outorder.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-02 17:37:06
 */
public class AlipayEcoMycarRentcarOutorderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1769316862588791487L;

	/** 
	 * 订单同步到支付宝车生活后生成的车生活订单id
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
