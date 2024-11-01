package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.appcontent.item.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 05:53:18
 */
public class AlipayOpenAppAppcontentItemCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3191558877366542121L;

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
