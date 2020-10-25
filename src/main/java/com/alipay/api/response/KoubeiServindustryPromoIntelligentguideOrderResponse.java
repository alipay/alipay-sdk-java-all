package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.servindustry.promo.intelligentguide.order response.
 * 
 * @author auto create
 * @since 1.0, 2020-03-10 10:35:08
 */
public class KoubeiServindustryPromoIntelligentguideOrderResponse extends AlipayResponse {

	private static final long serialVersionUID = 7853796378447456656L;

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
