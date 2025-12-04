package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.advertiser.ad.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:55:11
 */
public class AlipayCommerceIotAdvertiserAdCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5498278457363665543L;

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
