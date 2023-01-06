package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.appcontent.function.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 18:37:58
 */
public class AlipayOpenAppAppcontentFunctionModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3699149499188847774L;

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
