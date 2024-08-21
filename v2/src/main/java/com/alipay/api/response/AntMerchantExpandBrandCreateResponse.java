package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.brand.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 02:06:43
 */
public class AntMerchantExpandBrandCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1283111248621222756L;

	/** 
	 * 品牌ID
	 */
	@ApiField("brand_id")
	private String brandId;

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	public String getBrandId( ) {
		return this.brandId;
	}

}
