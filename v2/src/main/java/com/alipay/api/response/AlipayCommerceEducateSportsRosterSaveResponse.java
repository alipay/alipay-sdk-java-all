package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.sports.roster.save response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-11 17:32:51
 */
public class AlipayCommerceEducateSportsRosterSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 5899257757383288319L;

	/** 
	 * 新增成功的花名册code
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
