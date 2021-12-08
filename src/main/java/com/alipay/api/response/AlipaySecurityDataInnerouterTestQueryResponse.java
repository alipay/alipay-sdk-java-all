package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.data.innerouter.test.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-02 18:10:27
 */
public class AlipaySecurityDataInnerouterTestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2188121955913348227L;

	/** 
	 * 123
	 */
	@ApiField("one")
	private String one;

	public void setOne(String one) {
		this.one = one;
	}
	public String getOne( ) {
		return this.one;
	}

}
