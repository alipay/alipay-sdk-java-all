package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.dtbank.activity.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-29 14:35:04
 */
public class AlipayUserDtbankActivityModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5835164811347634673L;

	/** 
	 * 活动修改的结果，INIT表示处理中，SUCCESS表示成功，FAILED表示失败
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
