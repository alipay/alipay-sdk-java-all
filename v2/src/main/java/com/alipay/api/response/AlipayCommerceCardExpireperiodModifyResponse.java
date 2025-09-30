package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.card.expireperiod.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-26 21:02:02
 */
public class AlipayCommerceCardExpireperiodModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5336599851883174925L;

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
