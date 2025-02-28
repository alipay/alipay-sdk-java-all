package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ExchangeOrderInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.promoter.exchange.submit response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-08 11:38:23
 */
public class AlipayCommerceOperationPromoterExchangeSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 7826445794471821645L;

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
