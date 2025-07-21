package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.expireperiod.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-30 20:27:26
 */
public class AlipayCommerceMerchantcardExpireperiodModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3247977529174285881L;

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
