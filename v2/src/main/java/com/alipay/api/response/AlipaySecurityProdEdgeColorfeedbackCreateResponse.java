package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.edge.colorfeedback.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 03:35:01
 */
public class AlipaySecurityProdEdgeColorfeedbackCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1165993129596878468L;

	/** 
	 * 反馈生成的跟踪字符串，用于后续业务问题排查
	 */
	@ApiField("trace")
	private String trace;

	public void setTrace(String trace) {
		this.trace = trace;
	}
	public String getTrace( ) {
		return this.trace;
	}

}
