package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.wallet.template.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-02 16:31:44
 */
public class AlipayFundWalletTemplateConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 8464969522945944761L;

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
