package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.brand.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-01 11:32:51
 */
public class AntMerchantExpandBrandCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8845365874672854686L;

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
