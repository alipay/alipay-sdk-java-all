package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.resale.zmxy.consult response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-27 17:22:45
 */
public class AlipayCommerceResaleZmxyConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 7831562661511821598L;

	/** 
	 * 是否准入
	 */
	@ApiField("permit")
	private Boolean permit;

	public void setPermit(Boolean permit) {
		this.permit = permit;
	}
	public Boolean getPermit( ) {
		return this.permit;
	}

}
