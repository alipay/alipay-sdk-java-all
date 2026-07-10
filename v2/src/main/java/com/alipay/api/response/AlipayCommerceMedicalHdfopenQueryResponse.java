package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdfopen.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-04 10:57:51
 */
public class AlipayCommerceMedicalHdfopenQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8323847923674697399L;

	/** 
	 * 返回参数
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
