package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.gas.item.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-18 12:15:01
 */
public class AlipayCommerceGasItemModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2713786941414299659L;

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
