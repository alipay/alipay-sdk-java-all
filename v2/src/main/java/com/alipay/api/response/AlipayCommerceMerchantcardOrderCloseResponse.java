package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.order.close response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-09 11:07:30
 */
public class AlipayCommerceMerchantcardOrderCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 3374399937242914633L;

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
