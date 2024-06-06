package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.series.servicecode.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-26 13:56:49
 */
public class AlipayEcoMycarSeriesServicecodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8317761491884662585L;

	/** 
	 * 服务库服务编码
	 */
	@ApiField("service_code")
	private String serviceCode;

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceCode( ) {
		return this.serviceCode;
	}

}
