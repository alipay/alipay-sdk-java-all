package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.nps.status.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-17 11:02:43
 */
public class AlipayCommerceMedicalNpsStatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6747222139844848892L;

	/** 
	 * true：需要弹nps卡片
false：不需要弹nps卡片
	 */
	@ApiField("status")
	private Boolean status;

	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Boolean getStatus( ) {
		return this.status;
	}

}
