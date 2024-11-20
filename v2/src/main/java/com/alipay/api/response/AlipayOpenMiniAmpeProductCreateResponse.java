package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.ampe.product.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-03 11:54:35
 */
public class AlipayOpenMiniAmpeProductCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8318667875295941387L;

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
