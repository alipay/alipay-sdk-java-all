package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.credit.order.pay response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-17 16:27:46
 */
public class AlipayTradeCreditOrderPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 2533178388419593827L;

	/** 
	 * 订单串，用于客户端唤起收银台
	 */
	@ApiField("order_str")
	private String orderStr;

	public void setOrderStr(String orderStr) {
		this.orderStr = orderStr;
	}
	public String getOrderStr( ) {
		return this.orderStr;
	}

}
