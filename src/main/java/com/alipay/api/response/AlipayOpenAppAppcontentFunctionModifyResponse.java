package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.appcontent.function.modify response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-17 17:02:25
 */
public class AlipayOpenAppAppcontentFunctionModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6596742347663976215L;

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
