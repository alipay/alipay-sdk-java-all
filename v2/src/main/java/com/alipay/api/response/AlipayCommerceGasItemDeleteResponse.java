package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.gas.item.delete response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-03 14:49:39
 */
public class AlipayCommerceGasItemDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 3139216777676656245L;

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
