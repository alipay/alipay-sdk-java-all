package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.qhinsclaim.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-17 14:17:46
 */
public class AlipayCommerceMedicalInsuranceQhinsclaimSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2397792441422452269L;

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
