package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.verification.result.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 21:20:21
 */
public class AlipayDataDataserviceVerificationResultSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 3132866155277482765L;

	/** 
	 * 反馈是否成功
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
