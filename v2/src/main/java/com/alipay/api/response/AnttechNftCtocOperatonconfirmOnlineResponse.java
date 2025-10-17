package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.ctoc.operatonconfirm.online response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-28 11:33:17
 */
public class AnttechNftCtocOperatonconfirmOnlineResponse extends AlipayResponse {

	private static final long serialVersionUID = 4458548624485664251L;

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
