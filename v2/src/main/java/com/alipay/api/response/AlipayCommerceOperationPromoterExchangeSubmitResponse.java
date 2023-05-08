package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ExchangeOrderInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.promoter.exchange.submit response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 20:48:23
 */
public class AlipayCommerceOperationPromoterExchangeSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 2111213543924415432L;

	/** 
	 * 积分兑换奖品处理结果
	 */
	@ApiField("exchange_order_result")
	private ExchangeOrderInfo exchangeOrderResult;

	public void setExchangeOrderResult(ExchangeOrderInfo exchangeOrderResult) {
		this.exchangeOrderResult = exchangeOrderResult;
	}
	public ExchangeOrderInfo getExchangeOrderResult( ) {
		return this.exchangeOrderResult;
	}

}
