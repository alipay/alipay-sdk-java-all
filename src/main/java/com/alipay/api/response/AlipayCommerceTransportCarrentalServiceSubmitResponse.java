package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.carrental.service.submit response.
 * 
 * @author auto create
 * @since 1.0, 2021-08-17 13:12:37
 */
public class AlipayCommerceTransportCarrentalServiceSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 1384416175647834559L;

	/** 
	 * 请求ID
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 服务编码 
需通过审核后才可使用
	 */
	@ApiField("service_code")
	private String serviceCode;

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceCode( ) {
		return this.serviceCode;
	}

}
