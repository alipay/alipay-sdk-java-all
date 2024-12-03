package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.inspect.notify response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:48
 */
public class AlipayEbppInspectNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6666379739895155387L;

	/** 
	 * 结果同步状态
	 */
	@ApiField("status")
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
