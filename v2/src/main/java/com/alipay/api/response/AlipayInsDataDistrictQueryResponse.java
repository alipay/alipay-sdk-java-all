package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.data.district.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 15:59:24
 */
public class AlipayInsDataDistrictQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8668152183957142127L;

	/** 
	 * 地区信息
	 */
	@ApiField("districts")
	private String districts;

	public void setDistricts(String districts) {
		this.districts = districts;
	}
	public String getDistricts( ) {
		return this.districts;
	}

}
