package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.sports.roster.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-11 17:32:51
 */
public class AlipayCommerceEducateSportsRosterModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1388654814937834679L;

	/** 
	 * 花名册cod
	 */
	@ApiField("roster_code")
	private String rosterCode;

	public void setRosterCode(String rosterCode) {
		this.rosterCode = rosterCode;
	}
	public String getRosterCode( ) {
		return this.rosterCode;
	}

}
