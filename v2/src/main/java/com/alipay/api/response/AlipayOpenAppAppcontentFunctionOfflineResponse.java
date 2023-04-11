package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.appcontent.function.offline response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 08:23:10
 */
public class AlipayOpenAppAppcontentFunctionOfflineResponse extends AlipayResponse {

	private static final long serialVersionUID = 8416559518666538178L;

	/** 
	 * 服务编码
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
