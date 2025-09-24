package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.agent.pay response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-25 10:37:33
 */
public class AlipayTradeAgentPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 6675281815162454685L;

	/** 
	 * 获取签名后的业务数据
	 */
	@ApiField("orderStr")
	private String orderStr;

	public void setOrderStr(String orderStr) {
		this.orderStr = orderStr;
	}
	public String getOrderStr( ) {
		return this.orderStr;
	}

}
