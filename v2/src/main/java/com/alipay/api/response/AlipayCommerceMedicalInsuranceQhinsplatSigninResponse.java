package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.qhinsplat.signin response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-17 14:17:46
 */
public class AlipayCommerceMedicalInsuranceQhinsplatSigninResponse extends AlipayResponse {

	private static final long serialVersionUID = 7318338182854431455L;

	/** 
	 * 响应出参
	 */
	@ApiField("response_str")
	private String responseStr;

	public void setResponseStr(String responseStr) {
		this.responseStr = responseStr;
	}
	public String getResponseStr( ) {
		return this.responseStr;
	}

}
