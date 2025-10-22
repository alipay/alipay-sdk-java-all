package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MarketingPromotionOrderInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.recycle.marketing.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-14 15:32:40
 */
public class AlipayCommerceRecycleMarketingOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3375136324868129315L;

	/** 
	 * 推广订单信息
	 */
	@ApiField("promotion_order_info")
	private MarketingPromotionOrderInfo promotionOrderInfo;

	public void setPromotionOrderInfo(MarketingPromotionOrderInfo promotionOrderInfo) {
		this.promotionOrderInfo = promotionOrderInfo;
	}
	public MarketingPromotionOrderInfo getPromotionOrderInfo( ) {
		return this.promotionOrderInfo;
	}

}
