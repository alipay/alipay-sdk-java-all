package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.gas.item.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-10 11:57:39
 */
public class AlipayCommerceGasItemCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5576511997527683296L;

	/** 
	 * 支付宝加油系统商品id
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
