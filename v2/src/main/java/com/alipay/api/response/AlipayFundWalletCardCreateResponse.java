package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.wallet.card.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 02:06:44
 */
public class AlipayFundWalletCardCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2541794275189558459L;

	/** 
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/** 
	 * 销售产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene( ) {
		return this.bizScene;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardNo( ) {
		return this.cardNo;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

}
