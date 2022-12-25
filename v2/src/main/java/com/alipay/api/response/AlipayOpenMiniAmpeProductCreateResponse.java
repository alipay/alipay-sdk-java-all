package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.ampe.product.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 09:52:57
 */
public class AlipayOpenMiniAmpeProductCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4883542812971961473L;

	/** 
	 * 创建成功生成的productId
	 */
	@ApiField("product_id")
	private Long productId;

	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public Long getProductId( ) {
		return this.productId;
	}

}
