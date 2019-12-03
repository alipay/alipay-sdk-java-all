package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.ha.ha.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-29 17:57:45
 */
public class AlipaySecurityProdHaHaInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 4552517589342469297L;

	/** 
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress( ) {
		return this.address;
	}

}
