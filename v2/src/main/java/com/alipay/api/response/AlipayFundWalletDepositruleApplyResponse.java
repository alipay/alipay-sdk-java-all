package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.wallet.depositrule.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-07 11:22:27
 */
public class AlipayFundWalletDepositruleApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4341454523852448515L;

	/** 
	 * 申请凭证
	 */
	@ApiField("apply_token")
	private String applyToken;

	/** 
	 * 申请链接
	 */
	@ApiField("apply_url")
	private String applyUrl;

	public void setApplyToken(String applyToken) {
		this.applyToken = applyToken;
	}
	public String getApplyToken( ) {
		return this.applyToken;
	}

	public void setApplyUrl(String applyUrl) {
		this.applyUrl = applyUrl;
	}
	public String getApplyUrl( ) {
		return this.applyUrl;
	}

}
