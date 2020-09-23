package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.test.test.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-10-30 17:46:59
 */
public class AlipayOpenAppTestTestCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2351182535832582715L;

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
