package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.taxi.highvalueorder.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 05:06:44
 */
public class AlipayCommerceTransportTaxiHighvalueorderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6651636615682958871L;

	/** 
	 * 状态码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 状态描述
	 */
	@ApiField("error_msg")
	private String errorMsg;

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

}
