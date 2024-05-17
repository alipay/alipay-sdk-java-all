package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotgms.token.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:40
 */
public class AlipayOpenIotgmsTokenCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5478425582939973471L;

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
