package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CardOrderInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-22 17:03:17
 */
public class AlipayCommerceMerchantcardOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6819974892951231393L;

	/** 
	 * 订购单信息
	 */
	@ApiField("card_order_info")
	private CardOrderInfo cardOrderInfo;

	public void setCardOrderInfo(CardOrderInfo cardOrderInfo) {
		this.cardOrderInfo = cardOrderInfo;
	}
	public CardOrderInfo getCardOrderInfo( ) {
		return this.cardOrderInfo;
	}

}
