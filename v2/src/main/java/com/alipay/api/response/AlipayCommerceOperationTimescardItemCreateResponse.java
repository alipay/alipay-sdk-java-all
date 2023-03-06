package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.timescard.item.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-01 19:21:19
 */
public class AlipayCommerceOperationTimescardItemCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3546695138872577762L;

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
