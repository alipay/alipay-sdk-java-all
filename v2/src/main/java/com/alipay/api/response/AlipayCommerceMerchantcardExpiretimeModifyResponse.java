package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.expiretime.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-08 15:00:42
 */
public class AlipayCommerceMerchantcardExpiretimeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4314297589363144395L;

	/** 
	 * 发起延期后的延期单id
	 */
	@ApiField("card_expand_order_id")
	private String cardExpandOrderId;

	public void setCardExpandOrderId(String cardExpandOrderId) {
		this.cardExpandOrderId = cardExpandOrderId;
	}
	public String getCardExpandOrderId( ) {
		return this.cardExpandOrderId;
	}

}
