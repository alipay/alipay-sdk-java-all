package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.appinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-21 16:56:45
 */
public class AlipaySecurityAppinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5531188233249124967L;

	/** 
	 * 1
	 */
	@ApiField("bbb")
	private String bbb;

	public void setBbb(String bbb) {
		this.bbb = bbb;
	}
	public String getBbb( ) {
		return this.bbb;
	}

}
