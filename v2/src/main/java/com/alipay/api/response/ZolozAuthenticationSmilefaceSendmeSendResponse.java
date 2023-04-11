package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.authentication.smileface.sendme.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 06:58:20
 */
public class ZolozAuthenticationSmilefaceSendmeSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 1836993321172661352L;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
