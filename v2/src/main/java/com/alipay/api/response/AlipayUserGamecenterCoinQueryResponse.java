package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.gamecenter.coin.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 14:27:42
 */
public class AlipayUserGamecenterCoinQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3658149916478264524L;

	/** 
	 * 用户游戏币余额，单位个，整数
	 */
	@ApiField("balance")
	private Long balance;

	public void setBalance(Long balance) {
		this.balance = balance;
	}
	public Long getBalance( ) {
		return this.balance;
	}

}
