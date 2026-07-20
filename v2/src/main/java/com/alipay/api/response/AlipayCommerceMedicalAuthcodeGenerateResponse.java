package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.authcode.generate response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-27 10:17:50
 */
public class AlipayCommerceMedicalAuthcodeGenerateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7636479926361799925L;

	/** 
	 * 支付宝返回给商户的授权认证码，用于后续换取token
	 */
	@ApiField("authcode")
	private String authcode;

	/** 
	 * authcode过期时间
	 */
	@ApiField("expire_time")
	private String expireTime;

	public void setAuthcode(String authcode) {
		this.authcode = authcode;
	}
	public String getAuthcode( ) {
		return this.authcode;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}
	public String getExpireTime( ) {
		return this.expireTime;
	}

}
