package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.agent.pay response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-03 15:47:52
 */
public class AlipayTradeAgentPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 5719613457167238431L;

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
