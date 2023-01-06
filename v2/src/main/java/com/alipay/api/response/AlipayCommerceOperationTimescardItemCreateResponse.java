package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.timescard.item.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 18:08:17
 */
public class AlipayCommerceOperationTimescardItemCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1366642522684341371L;

	/** 
	 * 次卡商品id
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
