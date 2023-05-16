package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etc.applyorder.createormodify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-16 19:10:47
 */
public class AlipayCommerceTransportEtcApplyorderCreateormodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4265545354479154497L;

	/** 
	 * 支付宝ETC申请单号
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
