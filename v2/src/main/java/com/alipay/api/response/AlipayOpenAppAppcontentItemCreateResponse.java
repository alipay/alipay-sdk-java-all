package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.appcontent.item.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:27:43
 */
public class AlipayOpenAppAppcontentItemCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6259571425219352357L;

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
