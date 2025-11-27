package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.license.suwen.identify response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-08 10:57:33
 */
public class AlipaySecurityRiskLicenseSuwenIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7833598847279249496L;

	/** 
	 * 素问工单id
	 */
	@ApiField("suwen_event_id")
	private String suwenEventId;

	public void setSuwenEventId(String suwenEventId) {
		this.suwenEventId = suwenEventId;
	}
	public String getSuwenEventId( ) {
		return this.suwenEventId;
	}

}
