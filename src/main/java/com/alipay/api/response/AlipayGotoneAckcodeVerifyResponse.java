package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.gotone.ackcode.verify response.
 * 
 * @author auto create
 * @since 1.0, 2017-08-11 15:07:14
 */
public class AlipayGotoneAckcodeVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3242727626782233667L;

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
