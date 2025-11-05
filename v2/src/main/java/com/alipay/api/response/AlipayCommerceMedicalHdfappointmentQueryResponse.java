package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdfappointment.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-17 15:27:39
 */
public class AlipayCommerceMedicalHdfappointmentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7869868284773297621L;

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
