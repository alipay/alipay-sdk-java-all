package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.auction.balance.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:58
 */
public class AlipayFundTransAuctionBalanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5161369748132174161L;

	/** 
	 * 当前可用余额
	 */
	@ApiField("balance_available")
	private String balanceAvailable;

	/** 
	 * 冻结金额
	 */
	@ApiField("balance_freezed")
	private String balanceFreezed;

	public void setBalanceAvailable(String balanceAvailable) {
		this.balanceAvailable = balanceAvailable;
	}
	public String getBalanceAvailable( ) {
		return this.balanceAvailable;
	}

	public void setBalanceFreezed(String balanceFreezed) {
		this.balanceFreezed = balanceFreezed;
	}
	public String getBalanceFreezed( ) {
		return this.balanceFreezed;
	}

}
