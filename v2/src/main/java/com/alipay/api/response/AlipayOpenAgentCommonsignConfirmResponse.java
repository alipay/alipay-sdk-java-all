package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.agent.commonsign.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 07:36:47
 */
public class AlipayOpenAgentCommonsignConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 7384797887469829171L;

	/** 
	 * 签约单号
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
