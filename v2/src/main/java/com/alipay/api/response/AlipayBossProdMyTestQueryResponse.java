package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.my.test.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 06:27:37
 */
public class AlipayBossProdMyTestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2327551773844494663L;

	/** 
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLongitude( ) {
		return this.longitude;
	}

}
