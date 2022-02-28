package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.item.delete response.
 * 
 * @author auto create
 * @since 1.0, 2021-02-19 17:02:31
 */
public class AntMerchantExpandItemDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 7681791277999268522L;

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
