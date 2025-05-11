package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.apires.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-03 12:39:39
 */
public class AlipayOpenAppApiresQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8197933954174557163L;

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
