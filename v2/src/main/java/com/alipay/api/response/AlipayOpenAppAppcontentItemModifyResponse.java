package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.appcontent.item.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-03 11:03:43
 */
public class AlipayOpenAppAppcontentItemModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8265445989842885746L;

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
