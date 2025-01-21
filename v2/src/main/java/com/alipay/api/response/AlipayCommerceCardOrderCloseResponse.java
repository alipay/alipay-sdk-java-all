package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.card.order.close response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-26 21:02:03
 */
public class AlipayCommerceCardOrderCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 6471783341268265919L;

	/** 
	 * 卡ID
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
