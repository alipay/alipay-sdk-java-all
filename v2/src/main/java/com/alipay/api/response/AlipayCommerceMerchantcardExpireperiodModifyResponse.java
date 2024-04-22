package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.expireperiod.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-18 18:07:02
 */
public class AlipayCommerceMerchantcardExpireperiodModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4241837636987481295L;

	/** 
	 * 订购单ID
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
