package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.service.apply response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-19 14:11:23
 */
public class AlipayOpenAppServiceApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2295895387942699917L;

	/** 
	 * 服务id
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
