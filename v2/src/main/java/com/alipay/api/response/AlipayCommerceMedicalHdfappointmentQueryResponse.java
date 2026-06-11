package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdfappointment.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-29 11:07:42
 */
public class AlipayCommerceMedicalHdfappointmentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7836673647563686475L;

	/** 
	 * 响应内容
	 */
	@ApiField("content")
	private String content;

	public void setContent(String content) {
		this.content = content;
	}
	public String getContent( ) {
		return this.content;
	}

}
