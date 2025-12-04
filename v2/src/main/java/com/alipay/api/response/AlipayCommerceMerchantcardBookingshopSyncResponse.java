package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.bookingshop.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-03 10:27:42
 */
public class AlipayCommerceMerchantcardBookingshopSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2778116584148847927L;

	/** 
	 * 门店id
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
