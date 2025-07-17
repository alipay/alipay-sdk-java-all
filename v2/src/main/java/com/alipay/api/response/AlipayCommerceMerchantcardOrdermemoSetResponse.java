package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.ordermemo.set response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-10 10:52:30
 */
public class AlipayCommerceMerchantcardOrdermemoSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5461463344372917395L;

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
