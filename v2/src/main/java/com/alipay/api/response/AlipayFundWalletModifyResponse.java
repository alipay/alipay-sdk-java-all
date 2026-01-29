package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.wallet.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-05 10:57:42
 */
public class AlipayFundWalletModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3466437883731345334L;

	/** 
	 * 用户钱包id
	 */
	@ApiField("user_wallet_id")
	private String userWalletId;

	/** 
	 * 钱包名称
	 */
	@ApiField("wallet_name")
	private String walletName;

	public void setUserWalletId(String userWalletId) {
		this.userWalletId = userWalletId;
	}
	public String getUserWalletId( ) {
		return this.userWalletId;
	}

	public void setWalletName(String walletName) {
		this.walletName = walletName;
	}
	public String getWalletName( ) {
		return this.walletName;
	}

}
