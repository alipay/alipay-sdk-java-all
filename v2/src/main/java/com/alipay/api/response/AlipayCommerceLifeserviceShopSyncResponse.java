package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.shop.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-14 11:27:52
 */
public class AlipayCommerceLifeserviceShopSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3886331214477343491L;

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
