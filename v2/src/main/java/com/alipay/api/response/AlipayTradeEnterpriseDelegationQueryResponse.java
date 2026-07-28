package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.enterprise.delegation.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-24 22:07:49
 */
public class AlipayTradeEnterpriseDelegationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7621389682257318442L;

	/** 
	 * 交易状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 支付交易号

	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
