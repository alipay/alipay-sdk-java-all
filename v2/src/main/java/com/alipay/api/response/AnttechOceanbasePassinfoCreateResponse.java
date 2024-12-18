package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.passinfo.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:27
 */
public class AnttechOceanbasePassinfoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6453166165645151684L;

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
