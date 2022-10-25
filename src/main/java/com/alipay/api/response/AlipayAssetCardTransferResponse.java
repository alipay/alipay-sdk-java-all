package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.card.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-12 19:38:08
 */
public class AlipayAssetCardTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 6586285929584649917L;

	/** 
	 * 支付宝订单id
	 */
	@ApiField("asset_order_id")
	private String assetOrderId;

	public void setAssetOrderId(String assetOrderId) {
		this.assetOrderId = assetOrderId;
	}
	public String getAssetOrderId( ) {
		return this.assetOrderId;
	}

}
