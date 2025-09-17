package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.order.set response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-15 17:02:17
 */
public class AlipayCommerceMerchantcardOrderSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7467867449277836783L;

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
