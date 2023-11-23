package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etc.applyorder.createormodify response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-16 09:44:19
 */
public class AlipayCommerceTransportEtcApplyorderCreateormodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1437914617991526796L;

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
