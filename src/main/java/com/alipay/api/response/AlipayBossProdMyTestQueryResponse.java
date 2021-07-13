package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.my.test.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-12 19:47:28
 */
public class AlipayBossProdMyTestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4671477487115438711L;

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
