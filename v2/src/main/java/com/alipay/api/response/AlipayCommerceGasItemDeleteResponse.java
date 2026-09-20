package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.gas.item.delete response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-25 15:37:07
 */
public class AlipayCommerceGasItemDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 8422365115577879867L;

	/** 
	 * 商品ID
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
