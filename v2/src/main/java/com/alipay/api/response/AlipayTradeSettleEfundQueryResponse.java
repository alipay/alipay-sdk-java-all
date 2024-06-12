package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.settle.efund.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:29:18
 */
public class AlipayTradeSettleEfundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5432851849979368264L;

	/** 
	 * 电商管控金额
	 */
	@ApiField("freeze_amount")
	private String freezeAmount;

	public void setFreezeAmount(String freezeAmount) {
		this.freezeAmount = freezeAmount;
	}
	public String getFreezeAmount( ) {
		return this.freezeAmount;
	}

}
