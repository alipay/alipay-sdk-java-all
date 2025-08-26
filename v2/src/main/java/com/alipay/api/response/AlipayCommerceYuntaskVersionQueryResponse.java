package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.version.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 12:42:36
 */
public class AlipayCommerceYuntaskVersionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6571937954884296335L;

	/** 
	 * 版本号
	 */
	@ApiField("version_code")
	private String versionCode;

	public void setVersionCode(String versionCode) {
		this.versionCode = versionCode;
	}
	public String getVersionCode( ) {
		return this.versionCode;
	}

}
