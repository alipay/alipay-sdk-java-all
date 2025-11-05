package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.gas.item.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-10 13:57:40
 */
public class AlipayCommerceGasItemModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1348866552645885623L;

	/** 
	 * 商品id
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
