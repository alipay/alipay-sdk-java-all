package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.ctoc.smscode.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-18 21:12:42
 */
public class AnttechNftCtocSmscodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7624916549127711822L;

	/** 
	 * 验证码
	 */
	@ApiField("sms_code")
	private String smsCode;

	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}
	public String getSmsCode( ) {
		return this.smsCode;
	}

}
