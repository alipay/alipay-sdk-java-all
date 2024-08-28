package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.gamecenter.coin.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-27 08:51:36
 */
public class AlipayUserGamecenterCoinQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5123731145849664782L;

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
