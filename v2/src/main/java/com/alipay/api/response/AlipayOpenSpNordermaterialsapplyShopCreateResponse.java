package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.nordermaterialsapply.shop.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-21 19:57:17
 */
public class AlipayOpenSpNordermaterialsapplyShopCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6718489739866668561L;

	/** 
	 * 返回门店单标识
	 */
	@ApiField("shop_order_no")
	private String shopOrderNo;

	public void setShopOrderNo(String shopOrderNo) {
		this.shopOrderNo = shopOrderNo;
	}
	public String getShopOrderNo( ) {
		return this.shopOrderNo;
	}

}
