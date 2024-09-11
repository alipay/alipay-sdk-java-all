package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.sms.code.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-03 15:16:49
 */
public class DatadigitalFincloudFinsaasSmsCodeSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2465811211285221743L;

	/** 
	 * 手机验证码失效时间
	 */
	@ApiField("expire_time")
	private String expireTime;

	/** 
	 * 手机短信验证码
	 */
	@ApiField("sms_code")
	private String smsCode;

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}
	public String getExpireTime( ) {
		return this.expireTime;
	}

	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}
	public String getSmsCode( ) {
		return this.smsCode;
	}

}
