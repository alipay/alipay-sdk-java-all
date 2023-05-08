package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.common.notify.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 08:56:56
 */
public class AlipayEbppCommonNotifySendResponse extends AlipayResponse {

	private static final long serialVersionUID = 3112538759869312295L;

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
