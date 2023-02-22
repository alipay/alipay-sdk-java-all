package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.mdeviceprod.shop.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 05:30:27
 */
public class AlipayCommerceIotMdeviceprodShopCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3446311933447363599L;

	/** 
	 * 虚拟门店ID
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
