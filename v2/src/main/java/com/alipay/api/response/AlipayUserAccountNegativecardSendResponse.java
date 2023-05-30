package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.account.negativecard.send response.
 * 
 * @author auto create
 * @since 1.0, 2020-12-14 21:52:29
 */
public class AlipayUserAccountNegativecardSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 4144942833829617848L;

	/** 
	 * 结果码。SUCCESS：发送成功。
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
