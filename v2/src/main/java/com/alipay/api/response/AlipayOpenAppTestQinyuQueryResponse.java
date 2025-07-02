package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.test.qinyu.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-23 10:28:57
 */
public class AlipayOpenAppTestQinyuQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2621341438843386198L;

	/** 
	 * 1
	 */
	@ApiField("oid")
	private String oid;

	public void setOid(String oid) {
		this.oid = oid;
	}
	public String getOid( ) {
		return this.oid;
	}

}
