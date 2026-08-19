package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.sports.white.delete response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-11 17:42:48
 */
public class AlipayCommerceEducateSportsWhiteDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 8577665853228259632L;

	/** 
	 * 白名单code
	 */
	@ApiField("white_code")
	private String whiteCode;

	public void setWhiteCode(String whiteCode) {
		this.whiteCode = whiteCode;
	}
	public String getWhiteCode( ) {
		return this.whiteCode;
	}

}
