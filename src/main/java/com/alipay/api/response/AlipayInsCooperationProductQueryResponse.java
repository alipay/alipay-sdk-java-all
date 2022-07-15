package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsProduct;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.cooperation.product.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-28 17:18:31
 */
public class AlipayInsCooperationProductQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5849955466198546628L;

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
