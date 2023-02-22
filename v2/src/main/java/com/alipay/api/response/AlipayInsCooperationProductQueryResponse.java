package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsProduct;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.cooperation.product.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 10:13:00
 */
public class AlipayInsCooperationProductQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2364333265124853765L;

	/** 
	 * 保险产品
	 */
	@ApiField("product")
	private InsProduct product;

	public void setProduct(InsProduct product) {
		this.product = product;
	}
	public InsProduct getProduct( ) {
		return this.product;
	}

}
