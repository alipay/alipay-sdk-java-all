package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.servindustry.promo.intelligentguide.order response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-01 11:06:19
 */
public class KoubeiServindustryPromoIntelligentguideOrderResponse extends AlipayResponse {

	private static final long serialVersionUID = 1283186179327913854L;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
