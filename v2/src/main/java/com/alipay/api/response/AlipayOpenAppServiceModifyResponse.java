package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.service.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-17 10:46:56
 */
public class AlipayOpenAppServiceModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2896735945254647857L;

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
