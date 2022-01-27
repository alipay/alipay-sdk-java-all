package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.appcontent.item.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-01-15 11:38:22
 */
public class AlipayOpenAppAppcontentItemCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7876331492912744779L;

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
