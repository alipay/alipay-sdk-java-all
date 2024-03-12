package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.wallet.template.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-04 16:58:40
 */
public class AlipayFundWalletTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5461322549539747197L;

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
