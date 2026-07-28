package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.distribution.flowsmscode.send response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-27 20:12:53
 */
public class AlipayCommerceAcommunicationDistributionFlowsmscodeSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 1616751779343684784L;

	/** 
	 * 支付宝订单id
	 */
	@ApiField("alipay_order_id")
	private String alipayOrderId;

	public void setAlipayOrderId(String alipayOrderId) {
		this.alipayOrderId = alipayOrderId;
	}
	public String getAlipayOrderId( ) {
		return this.alipayOrderId;
	}

}
