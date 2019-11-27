package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.XizheTestObject;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.test.tset.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-13 20:04:12
 */
public class AlipaySecurityTestTsetQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7548749192527297453L;

	/** 
	 * test
	 */
	@ApiField("name")
	private XizheTestObject name;

	public void setName(XizheTestObject name) {
		this.name = name;
	}
	public XizheTestObject getName( ) {
		return this.name;
	}

}
