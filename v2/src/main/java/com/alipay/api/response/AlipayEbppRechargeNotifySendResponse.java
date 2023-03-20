package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.recharge.notify.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 19:11:45
 */
public class AlipayEbppRechargeNotifySendResponse extends AlipayResponse {

	private static final long serialVersionUID = 4371748963536574351L;

	/** 
	 * 操作状态
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
