package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.maintain.shop.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:09:54
 */
public class AlipayEcoMycarMaintainShopCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6594522363928271955L;

	/** 
	 * 车主平台创建的门店编号
	 */
	@ApiField("shop_id")
	private Long shopId;

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	public Long getShopId( ) {
		return this.shopId;
	}

}
