package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.authentication.smileface.sendme.send response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-13 10:35:48
 */
public class ZolozAuthenticationSmilefaceSendmeSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6616789787118859162L;

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
