package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.alipay.security.prod.test response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-08 10:23:17
 */
public class AlipaySecurityProdAlipaySecurityProdTestResponse extends AlipayResponse {

	private static final long serialVersionUID = 1895988531876199226L;

	/** 
	 * ddd
	 */
	@ApiField("admin")
	private String admin;

	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public String getAdmin( ) {
		return this.admin;
	}

}
