package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.bot.verify.check response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-08 18:17:37
 */
public class AlipayEbppIndustryBotVerifyCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 3852694165447167727L;

	/** 
	 * 用于表示用户在当前场景中核身状态
	 */
	@ApiField("verify_status")
	private String verifyStatus;

	public void setVerifyStatus(String verifyStatus) {
		this.verifyStatus = verifyStatus;
	}
	public String getVerifyStatus( ) {
		return this.verifyStatus;
	}

}
