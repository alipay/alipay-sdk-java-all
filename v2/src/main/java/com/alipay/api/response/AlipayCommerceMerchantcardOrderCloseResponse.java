package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.order.close response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-16 10:38:39
 */
public class AlipayCommerceMerchantcardOrderCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 8299246731736797846L;

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
