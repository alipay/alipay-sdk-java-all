package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ItemExchangeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.promoter.exchange.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 18:07:16
 */
public class AlipayCommerceOperationPromoterExchangeConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 4651898676168733945L;

	/** 
	 * 积分兑换奖品信息
	 */
	@ApiField("item_exchange_info")
	private ItemExchangeInfo itemExchangeInfo;

	public void setItemExchangeInfo(ItemExchangeInfo itemExchangeInfo) {
		this.itemExchangeInfo = itemExchangeInfo;
	}
	public ItemExchangeInfo getItemExchangeInfo( ) {
		return this.itemExchangeInfo;
	}

}
