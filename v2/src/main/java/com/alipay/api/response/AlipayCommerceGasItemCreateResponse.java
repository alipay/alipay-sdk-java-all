package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.gas.item.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-18 12:18:20
 */
public class AlipayCommerceGasItemCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2343584522182789984L;

	/** 
	 * 支付宝加油系统商品id
	 */
	@ApiField("item_id")
	private String itemId;

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

}
