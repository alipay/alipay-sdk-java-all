package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.test.test.charge response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:29:19
 */
public class AlipayOpenAppTestTestChargeResponse extends AlipayResponse {

	private static final long serialVersionUID = 7139739394324287851L;

	/** 
	 * 1
	 */
	@ApiField("name")
	private String name;

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

}
