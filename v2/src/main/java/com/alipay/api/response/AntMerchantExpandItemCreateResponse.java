package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.item.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 19:25:16
 */
public class AntMerchantExpandItemCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8478921169445697456L;

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
