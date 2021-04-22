package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.rebate.balance.send response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-26 14:52:34
 */
public class AlipayEcoRebateBalanceSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5589919449471841799L;

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
