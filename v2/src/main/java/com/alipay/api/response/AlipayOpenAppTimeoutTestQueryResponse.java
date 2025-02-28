package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.timeout.test.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-21 20:59:17
 */
public class AlipayOpenAppTimeoutTestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2351114359456488962L;

	/** 
	 * 秒
	 */
	@ApiField("timeout")
	private String timeout;

	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}
	public String getTimeout( ) {
		return this.timeout;
	}

}
