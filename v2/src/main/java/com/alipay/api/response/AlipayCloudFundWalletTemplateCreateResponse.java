package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.fund.wallet.template.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-15 18:17:05
 */
public class AlipayCloudFundWalletTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3275375493441488793L;

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
