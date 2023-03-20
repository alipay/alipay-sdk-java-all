package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.apidefaultparam.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 04:46:45
 */
public class AlipayOpenApidefaultparamQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8826627986434745573L;

	/** 
	 * 某个接口的默认入参
	 */
	@ApiField("param")
	private String param;

	public void setParam(String param) {
		this.param = param;
	}
	public String getParam( ) {
		return this.param;
	}

}
