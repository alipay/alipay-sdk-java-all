package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.dtbank.activity.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-27 17:22:31
 */
public class AlipayUserDtbankActivityModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1778223555884512578L;

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
