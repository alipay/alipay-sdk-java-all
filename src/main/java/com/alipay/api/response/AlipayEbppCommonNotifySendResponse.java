package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.common.notify.send response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-05 18:57:34
 */
public class AlipayEbppCommonNotifySendResponse extends AlipayResponse {

	private static final long serialVersionUID = 3459224225497544569L;

	/** 
	 * 通知的执行结果
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
