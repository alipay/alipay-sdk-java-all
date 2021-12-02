package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.gotone.message.sms.send response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-16 15:13:20
 */
public class AlipayGotoneMessageSmsSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6174853348283211671L;

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
