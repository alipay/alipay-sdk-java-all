package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.agent.isv.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-15 09:56:41
 */
public class AlipayOpenAgentIsvCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1454496125616266157L;

	/** 
	 * 智能体代创建订单号
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
