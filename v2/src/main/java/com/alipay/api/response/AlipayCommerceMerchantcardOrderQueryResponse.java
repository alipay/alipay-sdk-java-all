package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CardOrderInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-26 20:34:39
 */
public class AlipayCommerceMerchantcardOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7843164395627625277L;

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
