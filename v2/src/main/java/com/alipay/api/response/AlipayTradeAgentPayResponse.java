package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.agent.pay response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-26 17:52:44
 */
public class AlipayTradeAgentPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 2483672351761783381L;

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
