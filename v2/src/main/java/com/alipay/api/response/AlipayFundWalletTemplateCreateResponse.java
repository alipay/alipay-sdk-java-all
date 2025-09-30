package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.wallet.template.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-25 20:02:40
 */
public class AlipayFundWalletTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1734975269883142868L;

	/** 
	 * 商户钱包模版id
	 */
	@ApiField("wallet_template_id")
	private String walletTemplateId;

	public void setWalletTemplateId(String walletTemplateId) {
		this.walletTemplateId = walletTemplateId;
	}
	public String getWalletTemplateId( ) {
		return this.walletTemplateId;
	}

}
