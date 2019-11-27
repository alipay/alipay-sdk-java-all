package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.ipaytest.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenAppIpaytestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7232861997661186158L;

	/** 
	 * test
	 */
	@ApiField("test_2_ipay")
	private String test2Ipay;

	public void setTest2Ipay(String test2Ipay) {
		this.test2Ipay = test2Ipay;
	}
	public String getTest2Ipay( ) {
		return this.test2Ipay;
	}

}
