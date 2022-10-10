package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.data.district.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-08 23:07:47
 */
public class AlipayInsDataDistrictQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7726715568669593765L;

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
