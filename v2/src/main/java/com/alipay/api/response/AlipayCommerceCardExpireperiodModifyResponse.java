package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.card.expireperiod.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-17 17:21:50
 */
public class AlipayCommerceCardExpireperiodModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7858841965632393459L;

	/** 
	 * 卡id
	 */
	@ApiField("card_id")
	private String cardId;

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getCardId( ) {
		return this.cardId;
	}

}
