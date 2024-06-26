package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.advertiser.ad.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-10 14:01:28
 */
public class AlipayCommerceIotAdvertiserAdCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3689375692875336235L;

	/** 
	 * 投放计划id
	 */
	@ApiField("id")
	private Long id;

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId( ) {
		return this.id;
	}

}
