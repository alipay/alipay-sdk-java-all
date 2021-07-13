package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.recharge.notify.send response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-13 15:45:01
 */
public class AlipayEbppRechargeNotifySendResponse extends AlipayResponse {

	private static final long serialVersionUID = 3726228137238682656L;

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
