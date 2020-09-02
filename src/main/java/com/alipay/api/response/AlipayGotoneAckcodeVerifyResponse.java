package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.gotone.ackcode.verify response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-30 15:18:19
 */
public class AlipayGotoneAckcodeVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4454152579797923194L;

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
