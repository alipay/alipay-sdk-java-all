package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.brand.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-01 11:41:55
 */
public class AntMerchantExpandBrandCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6442616814315451878L;

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
