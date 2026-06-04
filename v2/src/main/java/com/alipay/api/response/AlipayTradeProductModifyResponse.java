package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.product.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-30 15:57:43
 */
public class AlipayTradeProductModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7862439248181144425L;

	/** 
	 * 商品id
	 */
	@ApiField("product_id")
	private String productId;

	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductId( ) {
		return this.productId;
	}

}
