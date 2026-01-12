package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-12-24 19:27:42
 */
public class SignProductVO extends AlipayObject {

	private static final long serialVersionUID = 7239463368241192658L;

	/**
	 * 签约产品类型
	 */
	@ApiField("product_type")
	private String productType;

	/**
	 * 付款签约和保险产品的签约链接
	 */
	@ApiField("sign_url")
	private String signUrl;

	public String getProductType() {
		return this.productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getSignUrl() {
		return this.signUrl;
	}
	public void setSignUrl(String signUrl) {
		this.signUrl = signUrl;
	}

}
