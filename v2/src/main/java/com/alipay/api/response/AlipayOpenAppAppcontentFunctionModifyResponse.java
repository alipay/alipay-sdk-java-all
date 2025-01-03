package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.appcontent.function.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-03 11:02:09
 */
public class AlipayOpenAppAppcontentFunctionModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1421527656256436954L;

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
