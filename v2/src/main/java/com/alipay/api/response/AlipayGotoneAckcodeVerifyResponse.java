package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.gotone.ackcode.verify response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:26:57
 */
public class AlipayGotoneAckcodeVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5852392449186939972L;

	/** 
	 * 返回结果
	 */
	@ApiField("result_code")
	private String resultCode;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

}
