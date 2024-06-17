package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.order.close response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-28 17:07:03
 */
public class AlipayCommerceMerchantcardOrderCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 3758851162558416852L;

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
