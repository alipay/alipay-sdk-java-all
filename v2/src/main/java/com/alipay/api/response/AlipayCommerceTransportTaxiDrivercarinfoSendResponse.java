package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.taxi.drivercarinfo.send response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-14 11:05:15
 */
public class AlipayCommerceTransportTaxiDrivercarinfoSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2485224521282185669L;

	/** 
	 * 状态码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 响应描述信息
	 */
	@ApiField("message")
	private String message;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

}
