package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.app.baina.prize.preconsult response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-16 11:02:03
 */
public class AlipayPayAppBainaPrizePreconsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 4321275515376131987L;

	/** 
	 * 该字段表示用户是否可下单，true=可以下单，false=不能下单
	 */
	@ApiField("allow_award")
	private Boolean allowAward;

	public void setAllowAward(Boolean allowAward) {
		this.allowAward = allowAward;
	}
	public Boolean getAllowAward( ) {
		return this.allowAward;
	}

}
