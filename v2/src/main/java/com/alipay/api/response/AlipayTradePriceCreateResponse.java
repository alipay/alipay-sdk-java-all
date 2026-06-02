package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.price.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-27 19:55:55
 */
public class AlipayTradePriceCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3421983924571145129L;

	/** 
	 * 价格实例id
	 */
	@ApiField("price_id")
	private String priceId;

	/** 
	 * 本次创建的商品或请求关联的商品id
	 */
	@ApiField("product_id")
	private String productId;

	public void setPriceId(String priceId) {
		this.priceId = priceId;
	}
	public String getPriceId( ) {
		return this.priceId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductId( ) {
		return this.productId;
	}

}
