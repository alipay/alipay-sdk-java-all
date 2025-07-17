package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.verifyidentity.voiceprint.precreate response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-18 14:32:28
 */
public class AlipaySecurityRiskVerifyidentityVoiceprintPrecreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2121829127627494486L;

	/** 
	 * 预注册结果
	 */
	@ApiField("pre_register_result")
	private String preRegisterResult;

	/** 
	 * 注册成功的数据，一个token
	 */
	@ApiField("register_data")
	private String registerData;

	public void setPreRegisterResult(String preRegisterResult) {
		this.preRegisterResult = preRegisterResult;
	}
	public String getPreRegisterResult( ) {
		return this.preRegisterResult;
	}

	public void setRegisterData(String registerData) {
		this.registerData = registerData;
	}
	public String getRegisterData( ) {
		return this.registerData;
	}

}
