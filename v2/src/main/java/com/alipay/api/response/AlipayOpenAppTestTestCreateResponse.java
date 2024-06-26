package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.test.test.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:29:06
 */
public class AlipayOpenAppTestTestCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5219628936594266787L;

	/** 
	 * 省份
	 */
	@ApiField("province_code")
	private String provinceCode;

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	public String getProvinceCode( ) {
		return this.provinceCode;
	}

}
