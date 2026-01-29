package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.shopstock.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-26 15:57:41
 */
public class AlipayCommerceLifeserviceShopstockSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6226624512521867364L;

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
