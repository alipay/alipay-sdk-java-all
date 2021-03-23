package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.appcontent.function.modify response.
 * 
 * @author auto create
 * @since 1.0, 2021-02-02 10:58:26
 */
public class AlipayOpenAppAppcontentFunctionModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3356247714739449396L;

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
