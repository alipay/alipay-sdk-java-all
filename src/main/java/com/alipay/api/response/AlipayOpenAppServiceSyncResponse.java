package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.service.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-26 20:09:12
 */
public class AlipayOpenAppServiceSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5856161289271838434L;

	/** 
	 * 服务code
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
