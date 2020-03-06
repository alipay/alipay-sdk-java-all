package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trust.user.auth.send response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayTrustUserAuthSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 8899878746631394346L;

	/** 
	 * 当授权通知发送成功时，为T；否则用业务错误码表示
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
