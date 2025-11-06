package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.prodtest.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-05 10:17:20
 */
public class AlipayDataDataserviceProdtestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1851349134627253931L;

	/** 
	 * 测试
	 */
	@ApiField("user")
	private String user;

	public void setUser(String user) {
		this.user = user;
	}
	public String getUser( ) {
		return this.user;
	}

}
