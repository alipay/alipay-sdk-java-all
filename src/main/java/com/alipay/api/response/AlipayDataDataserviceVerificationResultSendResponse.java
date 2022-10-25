package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.verification.result.send response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-14 15:13:41
 */
public class AlipayDataDataserviceVerificationResultSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2153933487967875587L;

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
