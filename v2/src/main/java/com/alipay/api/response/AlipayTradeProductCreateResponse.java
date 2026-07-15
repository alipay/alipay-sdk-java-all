package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.product.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-08 19:47:57
 */
public class AlipayTradeProductCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5177227453824193828L;

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
