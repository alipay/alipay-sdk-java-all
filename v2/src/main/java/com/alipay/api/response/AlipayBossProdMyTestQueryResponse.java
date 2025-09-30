package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.my.test.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:37:41
 */
public class AlipayBossProdMyTestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7642395696363233275L;

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
