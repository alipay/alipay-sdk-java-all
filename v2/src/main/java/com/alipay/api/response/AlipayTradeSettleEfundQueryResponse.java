package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.settle.efund.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-23 20:56:39
 */
public class AlipayTradeSettleEfundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4891465928414663287L;

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
