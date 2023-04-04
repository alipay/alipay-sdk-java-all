package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.appcontent.item.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 05:12:54
 */
public class AlipayOpenAppAppcontentItemModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6731111125322457449L;

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
