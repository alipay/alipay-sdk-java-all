package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 下架商户门店
 *
 * @author auto create
 * @since 1.0, 2021-08-10 10:34:33
 */
public class AlipayOpenServicemarketCommodityShopOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 2543785413462223223L;

	/**
	 * 服务商户ID
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getCommodityId() {
		return this.commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
