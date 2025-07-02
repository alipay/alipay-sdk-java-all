package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.my.getchy.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:18
 */
public class AlipaySecurityProdMyGetchyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8747594784231435654L;

	/** 
	 * 1
	 */
	@ApiField("chen")
	private String chen;

	public void setChen(String chen) {
		this.chen = chen;
	}
	public String getChen( ) {
		return this.chen;
	}

}
