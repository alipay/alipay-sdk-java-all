package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CardOrderInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-23 17:32:21
 */
public class AlipayCommerceMerchantcardOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7887352652152378393L;

	/** 
	 * 售卖订单信息
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
