package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotgms.token.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-15 11:56:43
 */
public class AlipayOpenIotgmsTokenCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7328916342231899393L;

	/** 
	 * 查询token，符合jwt标准
	 */
	@ApiField("query_token")
	private String queryToken;

	public void setQueryToken(String queryToken) {
		this.queryToken = queryToken;
	}
	public String getQueryToken( ) {
		return this.queryToken;
	}

}
