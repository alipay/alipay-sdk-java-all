package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.nordermaterialsapply.shop.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-11 10:59:39
 */
public class AlipayOpenSpNordermaterialsapplyShopCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5432538833393235829L;

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
