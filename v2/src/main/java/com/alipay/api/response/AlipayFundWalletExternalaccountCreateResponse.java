package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.wallet.externalaccount.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-22 15:12:42
 */
public class AlipayFundWalletExternalaccountCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2423655972953829163L;

	/** 
	 * 钱包外部账户ID
	 */
	@ApiField("external_account_no")
	private String externalAccountNo;

	/** 
	 * 钱包ID
	 */
	@ApiField("user_wallet_id")
	private String userWalletId;

	public void setExternalAccountNo(String externalAccountNo) {
		this.externalAccountNo = externalAccountNo;
	}
	public String getExternalAccountNo( ) {
		return this.externalAccountNo;
	}

	public void setUserWalletId(String userWalletId) {
		this.userWalletId = userWalletId;
	}
	public String getUserWalletId( ) {
		return this.userWalletId;
	}

}
