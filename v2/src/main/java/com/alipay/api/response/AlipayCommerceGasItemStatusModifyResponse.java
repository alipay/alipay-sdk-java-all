package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.gas.item.status.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-03 14:48:58
 */
public class AlipayCommerceGasItemStatusModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3251325628662942272L;

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
