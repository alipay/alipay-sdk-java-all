package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.shop.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:55:10
 */
public class AlipayCommerceEcShopCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8656164239174145922L;

	/** 
	 * 企业码门店id
	 */
	@ApiField("ec_shop_id")
	private String ecShopId;

	public void setEcShopId(String ecShopId) {
		this.ecShopId = ecShopId;
	}
	public String getEcShopId( ) {
		return this.ecShopId;
	}

}
