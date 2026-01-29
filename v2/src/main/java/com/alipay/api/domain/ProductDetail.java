package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开通明细信息
 *
 * @author auto create
 * @since 1.0, 2026-01-09 18:33:09
 */
public class ProductDetail extends AlipayObject {

	private static final long serialVersionUID = 3356622482986511385L;

	/**
	 * 产品开通明细编码
	 */
	@ApiField("product_detail_code")
	private String productDetailCode;

	public String getProductDetailCode() {
		return this.productDetailCode;
	}
	public void setProductDetailCode(String productDetailCode) {
		this.productDetailCode = productDetailCode;
	}

}
