package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MikongQueryModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.test.test.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenAuthTestTestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7897281897295279119L;

	/** 
	 * aaa
	 */
	@ApiField("aaa")
	private String aaa;

	/** 
	 * test
	 */
	@ApiField("test")
	private MikongQueryModel test;

	public void setAaa(String aaa) {
		this.aaa = aaa;
	}
	public String getAaa( ) {
		return this.aaa;
	}

	public void setTest(MikongQueryModel test) {
		this.test = test;
	}
	public MikongQueryModel getTest( ) {
		return this.test;
	}

}
