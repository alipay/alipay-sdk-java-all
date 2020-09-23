package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.rebate.balance.send response.
 * 
 * @author auto create
 * @since 1.0, 2020-08-11 15:40:12
 */
public class AlipayEcoRebateBalanceSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7826314778527977478L;

	/** 
	 * 给用户发放集分宝的数量
	 */
	@ApiField("jfb_amount")
	private String jfbAmount;

	public void setJfbAmount(String jfbAmount) {
		this.jfbAmount = jfbAmount;
	}
	public String getJfbAmount( ) {
		return this.jfbAmount;
	}

}
