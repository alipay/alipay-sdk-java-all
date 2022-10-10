package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.wallet.template.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-10 19:42:28
 */
public class AlipayFundWalletTemplateConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 3731773815914299488L;

	/** 
	 * 钱包场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 钱包模版id
	 */
	@ApiField("wallet_template_id")
	private String walletTemplateId;

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene( ) {
		return this.bizScene;
	}

	public void setWalletTemplateId(String walletTemplateId) {
		this.walletTemplateId = walletTemplateId;
	}
	public String getWalletTemplateId( ) {
		return this.walletTemplateId;
	}

}
