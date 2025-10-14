package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ItemExchangeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.promoter.exchange.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:07:42
 */
public class AlipayCommerceOperationPromoterExchangeConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 4121627556488778321L;

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
