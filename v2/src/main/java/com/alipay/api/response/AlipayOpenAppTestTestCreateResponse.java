package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.test.test.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:13:46
 */
public class AlipayOpenAppTestTestCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3199173439252166113L;

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
