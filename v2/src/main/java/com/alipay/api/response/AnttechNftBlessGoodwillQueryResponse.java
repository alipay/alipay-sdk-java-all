package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.bless.goodwill.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-15 22:08:14
 */
public class AnttechNftBlessGoodwillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4149672137849839333L;

	/** 
	 * 当前善念值余额
	 */
	@ApiField("goodwill_balance")
	private Long goodwillBalance;

	public void setGoodwillBalance(Long goodwillBalance) {
		this.goodwillBalance = goodwillBalance;
	}
	public Long getGoodwillBalance( ) {
		return this.goodwillBalance;
	}

}
