package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.authentication.token.verify response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-28 15:27:49
 */
public class AlipayCommerceMedicalAuthenticationTokenVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5319362357877419864L;

	/** 
	 * 响应结果数据
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
