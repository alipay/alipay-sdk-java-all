package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.nps.status.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-26 17:52:41
 */
public class AlipayCommerceMedicalNpsStatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3341157248391513968L;

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
