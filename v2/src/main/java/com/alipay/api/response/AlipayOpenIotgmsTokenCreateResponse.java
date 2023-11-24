package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotgms.token.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-07 10:06:42
 */
public class AlipayOpenIotgmsTokenCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4294649384452554831L;

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
