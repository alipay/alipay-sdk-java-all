package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CardOrderInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-07 05:12:02
 */
public class AlipayCommerceMerchantcardOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6251357117351434876L;

	/** 
	 * 订单信息
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
