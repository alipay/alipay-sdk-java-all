package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.multistep.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-27 10:32:29
 */
public class AlipayFundTransMultistepTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 4247162338848659246L;

	/** 
	 * 单据单号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 单据转账状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

}
