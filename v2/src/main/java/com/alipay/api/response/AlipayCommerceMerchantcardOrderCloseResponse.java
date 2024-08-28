package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.order.close response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-30 13:42:03
 */
public class AlipayCommerceMerchantcardOrderCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 7712292138692883543L;

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
