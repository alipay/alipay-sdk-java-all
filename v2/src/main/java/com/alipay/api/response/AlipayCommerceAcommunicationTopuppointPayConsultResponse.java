package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.topuppoint.pay.consult response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-04 09:52:43
 */
public class AlipayCommerceAcommunicationTopuppointPayConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 3673265846248139612L;

	/** 
	 * 是否通过
	 */
	@ApiField("access")
	private Boolean access;

	public void setAccess(Boolean access) {
		this.access = access;
	}
	public Boolean getAccess( ) {
		return this.access;
	}

}
