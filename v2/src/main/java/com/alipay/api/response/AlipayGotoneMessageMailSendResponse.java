package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.gotone.message.mail.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 22:06:58
 */
public class AlipayGotoneMessageMailSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 4269324267372233445L;

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
