package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.order.set response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-28 16:07:08
 */
public class AlipayCommerceMerchantcardOrderSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2661183553947939399L;

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
