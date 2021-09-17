package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.inspect.notify response.
 * 
 * @author auto create
 * @since 1.0, 2020-02-20 00:45:06
 */
public class AlipayEbppInspectNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5487451179667316814L;

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
