package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.roster.info.save response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-29 10:29:43
 */
public class AlipayCommerceEducateRosterInfoSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 4745446138496415662L;

	/** 
	 * 花名册ID
	 */
	@ApiField("roster_id")
	private String rosterId;

	public void setRosterId(String rosterId) {
		this.rosterId = rosterId;
	}
	public String getRosterId( ) {
		return this.rosterId;
	}

}
