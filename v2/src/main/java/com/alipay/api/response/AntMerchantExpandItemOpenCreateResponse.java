package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.item.open.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-28 20:27:44
 */
public class AntMerchantExpandItemOpenCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4638732411784357358L;

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
