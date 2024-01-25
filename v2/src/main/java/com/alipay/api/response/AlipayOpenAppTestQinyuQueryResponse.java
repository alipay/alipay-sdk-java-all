package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.test.qinyu.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-27 10:31:40
 */
public class AlipayOpenAppTestQinyuQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5396286426979393431L;

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
