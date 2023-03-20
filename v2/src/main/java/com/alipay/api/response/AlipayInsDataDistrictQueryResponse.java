package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.data.district.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 03:28:08
 */
public class AlipayInsDataDistrictQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7624459969428352925L;

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
