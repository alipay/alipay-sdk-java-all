package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.brand.bundle.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 12:44:59
 */
public class AlipayOpenMiniBrandBundleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8128113734695941811L;

	/** 
	 * 是否经过品牌认证
	 */
	@ApiField("brand_certified")
	private Boolean brandCertified;

	/** 
	 * 小程序品牌词
	 */
	@ApiField("brand_word")
	private String brandWord;

	public void setBrandCertified(Boolean brandCertified) {
		this.brandCertified = brandCertified;
	}
	public Boolean getBrandCertified( ) {
		return this.brandCertified;
	}

	public void setBrandWord(String brandWord) {
		this.brandWord = brandWord;
	}
	public String getBrandWord( ) {
		return this.brandWord;
	}

}
