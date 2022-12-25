package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.service.apply response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-06 17:14:17
 */
public class AlipayOpenAppServiceApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3131978983453839694L;

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
