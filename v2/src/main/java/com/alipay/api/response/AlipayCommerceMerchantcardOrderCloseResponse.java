package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.order.close response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-29 16:12:29
 */
public class AlipayCommerceMerchantcardOrderCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 1697847936975999121L;

	/** 
	 * 售卖订单ID
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
