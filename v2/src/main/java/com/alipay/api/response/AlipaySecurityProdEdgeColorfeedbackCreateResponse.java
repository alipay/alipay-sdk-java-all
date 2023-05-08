package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.edge.colorfeedback.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 05:23:55
 */
public class AlipaySecurityProdEdgeColorfeedbackCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5265139971935477173L;

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
