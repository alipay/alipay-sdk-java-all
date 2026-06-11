package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.product.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-08 19:47:56
 */
public class AlipayTradeProductModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2697235169134912854L;

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
