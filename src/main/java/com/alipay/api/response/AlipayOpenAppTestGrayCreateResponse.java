package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.test.gray.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-19 12:26:37
 */
public class AlipayOpenAppTestGrayCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2554863674298353756L;

	/** 
	 * 1
	 */
	@ApiField("zone_name")
	private String zoneName;

	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}
	public String getZoneName( ) {
		return this.zoneName;
	}

}
