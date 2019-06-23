package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.item.modify response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-18 10:43:24
 */
public class AntMerchantExpandItemModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6353991289481236741L;

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
