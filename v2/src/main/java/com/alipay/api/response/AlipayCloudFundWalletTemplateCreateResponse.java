package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.fund.wallet.template.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-11 11:42:03
 */
public class AlipayCloudFundWalletTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5543183944254937841L;

	/** 
	 * 创建的钱包id
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
