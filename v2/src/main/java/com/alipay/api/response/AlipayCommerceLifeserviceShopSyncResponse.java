package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.shop.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-25 14:33:53
 */
public class AlipayCommerceLifeserviceShopSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7297112395781734479L;

	/** 
	 * 蚂蚁门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

}
