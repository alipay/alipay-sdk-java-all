package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.ctoc.operatonconfirm.online response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-02 21:12:32
 */
public class AnttechNftCtocOperatonconfirmOnlineResponse extends AlipayResponse {

	private static final long serialVersionUID = 8375131748272865616L;

	/** 
	 * 验证确认
	 */
	@ApiField("verify_confirm_id")
	private String verifyConfirmId;

	public void setVerifyConfirmId(String verifyConfirmId) {
		this.verifyConfirmId = verifyConfirmId;
	}
	public String getVerifyConfirmId( ) {
		return this.verifyConfirmId;
	}

}
