package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.wallet.token.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-29 10:02:19
 */
public class AlipayFundWalletTokenCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5686942443738722752L;

	/** 
	 * 绑定凭证
	 */
	@ApiField("bind_token")
	private String bindToken;

	/** 
	 * 绑定链接
	 */
	@ApiField("bind_url")
	private String bindUrl;

	/** 
	 * 用户钱包ID
	 */
	@ApiField("user_wallet_id")
	private String userWalletId;

	public void setBindToken(String bindToken) {
		this.bindToken = bindToken;
	}
	public String getBindToken( ) {
		return this.bindToken;
	}

	public void setBindUrl(String bindUrl) {
		this.bindUrl = bindUrl;
	}
	public String getBindUrl( ) {
		return this.bindUrl;
	}

	public void setUserWalletId(String userWalletId) {
		this.userWalletId = userWalletId;
	}
	public String getUserWalletId( ) {
		return this.userWalletId;
	}

}
