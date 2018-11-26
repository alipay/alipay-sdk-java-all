package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.advert.create response.
 * 
 * @author auto create
 * @since 1.0, 2018-11-05 14:55:00
 */
public class AlipayOpenPublicAdvertCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2163479617675952726L;

	/** 
	 * 广告位id
	 */
	@ApiField("advert_id")
	private String advertId;

	public void setAdvertId(String advertId) {
		this.advertId = advertId;
	}
	public String getAdvertId( ) {
		return this.advertId;
	}

}
