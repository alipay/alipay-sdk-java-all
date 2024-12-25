package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.appcontent.item.delete response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-06 10:11:07
 */
public class AlipayOpenAppAppcontentItemDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 4461247389349247547L;

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
