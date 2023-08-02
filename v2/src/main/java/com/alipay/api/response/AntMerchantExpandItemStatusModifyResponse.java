package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.item.status.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-05 10:59:14
 */
public class AntMerchantExpandItemStatusModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1292234146579611829L;

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
