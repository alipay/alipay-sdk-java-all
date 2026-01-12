package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.express.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-23 13:47:41
 */
public class AlipayCommerceLogisticsExpressOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3717745552769681499L;

	/** 
	 * 卡片地址
	 */
	@ApiField("card_url")
	private String cardUrl;

	public void setCardUrl(String cardUrl) {
		this.cardUrl = cardUrl;
	}
	public String getCardUrl( ) {
		return this.cardUrl;
	}

}
