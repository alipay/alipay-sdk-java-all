package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.train.shop.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-11 10:10:18
 */
public class AlipayCommerceEducateTrainShopCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1256759288812598699L;

	/** 
	 * 支付宝内部店铺id
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
