package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.item.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 16:12:42
 */
public class AntMerchantExpandItemCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5461834199643796583L;

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
