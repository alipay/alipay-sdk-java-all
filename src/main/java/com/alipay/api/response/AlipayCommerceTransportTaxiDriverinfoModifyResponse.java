package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.taxi.driverinfo.modify response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-05 10:30:31
 */
public class AlipayCommerceTransportTaxiDriverinfoModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3353671513796371333L;

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
