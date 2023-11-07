package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.wallet.template.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-06 13:41:49
 */
public class AlipayFundWalletTemplateConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 3712194423666322868L;

	/** 
	 * 钱包场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 销售产品码
	 */
	@ApiField("product_code")
	private String productCode;

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

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

	public void setWalletTemplateId(String walletTemplateId) {
		this.walletTemplateId = walletTemplateId;
	}
	public String getWalletTemplateId( ) {
		return this.walletTemplateId;
	}

}
