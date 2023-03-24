package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.inspect.notify response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 02:30:51
 */
public class AlipayEbppInspectNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4129519747866258631L;

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
