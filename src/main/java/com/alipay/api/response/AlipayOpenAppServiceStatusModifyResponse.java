package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.service.status.modify response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-18 10:18:24
 */
public class AlipayOpenAppServiceStatusModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1259576676765653718L;

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
