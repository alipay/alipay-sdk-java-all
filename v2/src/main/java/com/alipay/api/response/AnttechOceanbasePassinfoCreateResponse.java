package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.passinfo.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-18 17:40:23
 */
public class AnttechOceanbasePassinfoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7551581596549711135L;

	/** 
	 * 登录态
	 */
	@ApiField("authorization")
	private String authorization;

	public void setAuthorization(String authorization) {
		this.authorization = authorization;
	}
	public String getAuthorization( ) {
		return this.authorization;
	}

}
