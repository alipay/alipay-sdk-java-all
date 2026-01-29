package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdfrtc.conference.accept response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-28 16:47:42
 */
public class AlipayCommerceMedicalHdfrtcConferenceAcceptResponse extends AlipayResponse {

	private static final long serialVersionUID = 7181758227127247238L;

	/** 
	 * 返回值
	 */
	@ApiField("response_data")
	private String responseData;

	public void setResponseData(String responseData) {
		this.responseData = responseData;
	}
	public String getResponseData( ) {
		return this.responseData;
	}

}
