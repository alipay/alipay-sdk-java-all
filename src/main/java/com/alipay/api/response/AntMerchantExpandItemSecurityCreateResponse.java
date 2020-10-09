package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.item.security.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-06 21:54:50
 */
public class AntMerchantExpandItemSecurityCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8174941858478444149L;

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
