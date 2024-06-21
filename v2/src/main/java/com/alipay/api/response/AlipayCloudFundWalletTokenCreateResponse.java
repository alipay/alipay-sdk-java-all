package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.fund.wallet.token.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-11 11:37:03
 */
public class AlipayCloudFundWalletTokenCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4618961124434427911L;

	/** 
	 * 绑定凭证
	 */
	@ApiField("bind_token")
	private String bindToken;

	/** 
	 * 用户开通钱包链接
	 */
	@ApiField("bind_url")
	private String bindUrl;

	/** 
	 * 用户若已开通过钱包，会幂等返回用户钱包ID
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
