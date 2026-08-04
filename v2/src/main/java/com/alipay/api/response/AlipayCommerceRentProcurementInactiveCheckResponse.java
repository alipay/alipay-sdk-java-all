package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.procurement.inactive.check response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-30 20:10:00
 */
public class AlipayCommerceRentProcurementInactiveCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 2757838928696439899L;

	/** 
	 * 是否需要当面激活标签
	 */
	@ApiField("activation_label")
	private String activationLabel;

	public void setActivationLabel(String activationLabel) {
		this.activationLabel = activationLabel;
	}
	public String getActivationLabel( ) {
		return this.activationLabel;
	}

}
