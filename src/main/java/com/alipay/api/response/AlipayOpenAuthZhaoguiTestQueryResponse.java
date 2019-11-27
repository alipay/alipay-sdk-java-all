package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AAATest;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.zhaogui.test.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenAuthZhaoguiTestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2258495835837871572L;

	/** 
	 * zhaoguitest
	 */
	@ApiField("output")
	private AAATest output;

	public void setOutput(AAATest output) {
		this.output = output;
	}
	public AAATest getOutput( ) {
		return this.output;
	}

}
