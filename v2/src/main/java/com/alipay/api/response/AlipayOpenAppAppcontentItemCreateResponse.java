package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.appcontent.item.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-06 10:48:30
 */
public class AlipayOpenAppAppcontentItemCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1791478275343593885L;

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
