package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.apires.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-17 10:53:46
 */
public class AlipayOpenAppApiresQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5657891153475718156L;

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
