package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 回收行情价格同步
 *
 * @author auto create
 * @since 1.0, 2025-01-13 14:37:23
 */
public class AlipayCommerceRecycleMarketpriceSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8227825178372915214L;

	/**
	 * null
	 */
	@ApiListField("market_price_list")
	@ApiField("recycle_market_price_create_request")
	private List<RecycleMarketPriceCreateRequest> marketPriceList;

	public List<RecycleMarketPriceCreateRequest> getMarketPriceList() {
		return this.marketPriceList;
	}
	public void setMarketPriceList(List<RecycleMarketPriceCreateRequest> marketPriceList) {
		this.marketPriceList = marketPriceList;
	}

}
